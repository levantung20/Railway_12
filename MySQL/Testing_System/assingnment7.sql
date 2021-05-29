USE TestingSystem3;

-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước
DROP TRIGGER IF EXISTS Check_create_date_Group;
Delimiter $$
CREATE TRIGGER check_create_date_group
BEFORE INSERT ON `group`
FOR EACH ROW
        BEGIN   
            DECLARE v_create DATETIME;
            set v_create = date_sub(now(), interval 1 year);
            IF NEW.CreateDate < v_create THEN
            SIGNAL SQLSTATE '12345'
            set MESSAGE_TEXT=`Khong the tao moi group ngay tao khong hop le` ;
            END IF;
        END $$
        DELIMITER ;
INSERT INTO `testingsystem3` .`group` (`groupID`,`groupName`,`CreatorID`,`Createdate`)
VALUES ('11','11','11','2020-04-10 00:00:00');
        

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"
DROP TRIGGER check_create_User;
DELIMITER $$
CREATE TRIGGER check_create_User
BEFORE INSERT ON `account`
FOR EACH ROW 
            BEGIN
                DECLARE V_DepartmentID MEDIUMINT ;
                SELECT departmentID into v_departmentID WHERE departmentName = `sale`;
                IF NEW.DepartmentID = v_departmentID THEN
                SIGNAL SQLSTATE '12345'
                SET MESSAGE_TEXT= `Phong "sale" khong the nhan them nguoi` ;
                END IF ;
            END $$
DELIMITER ; 

insert into `testingsystem3` .`account` (`accountID`, `Email`,`username`,`FullName`,`DepartmentID`,`positionID`,`CreateDate`)
VALUES ('255' , 'tungvtc@gmail.com','tungvtc' ,'tungvtc', '8', '2','2020-12-03 00:00:00');

-- Question 3: Cấu hình 1 group có nhiều nhất là 5 account
DROP TRIGGER check_create_User;
DELIMITER $$
CREATE TRIGGER check_create_User 
BEFORE INSERT ON `Account`
FOR EACH ROW 
        BEGIN 
            DECLARE Count MEDIUMINT ;
            SELECT groupID, count(AccountID) FROM groupaccount GROUP BY groupID HAVING groupID = NEW.GroupID;
            IF v_countacc >=18 THEN
            SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT='nhom nay da co 18 acc, khong the them nua ';
            END IF ;
            END $$
    DELIMITER ;
    INSERT INTO `testingsystem3`. `groupaccount` (`groupID`,`accountID`, `JoinDate`)
     VALUES (1, 255, '2020-07-20');
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS Set_exam;
DELIMITER $$
CREATE TRIGGER set_exam
BEFORE INSERT ON `examquestion`
FOR EACH ROW 
        BEGIN 
         DECLARE v_Count INT;
         select count(questionID) into v_count 
         from examquestion
         GROUP BY examID HAVING xamID = New.examID;
         IF v_count >= 17
         Then SIGNAL SQLSTATE '12345'
         SET MESSAGE_TEXT = 'This exam has reached its Limitation .';
         END IF;
         END $$
         DELIMITER ;
         INSERT INTO `examquestion` (examID, questionID)
        VALUES (4 ,25);

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
-- tin liên quan tới user đó
DROP TRIGGER IF EXISTS DELETE_ACC;
DELIMITER $$
CREATE TRIGGER DELETE_ACC
BEFORE DELETE ON `account`
FOR EACH ROW 
        BEGIN IF OLD.email like 'adimn@gmail.com'
        THEN SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = " day la mail quan tri khong the xoa maill nay ";
        END IF ;
    end $$
DELIMITER ;
DELETE FROM `account` where AccountID = 8;

-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
DROP TRIGGER V_DepartmnetID
BEFORE INSERT ON `Account`
For EACH ROW 
BEGIN DECLARE WAiting_DepartmentID MIDDLEINT;
SELECT departmentID INTO Waiting_DepartmentID 
FROM `account`
Where DepartmentName ='pHONG CHO';
                   IF NEW.departmentID IS NULL THEN
            SET NEW.departmnetID = waiting_DepartemntID;
        END IF;
    END $$
DELIMITER;
-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng.
DROP TRIGGER IF EXISTS check_question_answer;
DELIMITER $$
CREATE TRIGGER Check_question_answer
BEFORE INSERT ON `answer`
FOR EACH ROW
        BEGIN 
        DECLARE v_answer_no MEDIUMINT UNSIGNED;
        DECLARE V_Rightanswer_no MEDIUMINT UNSIGNED;
        SELECT COUNT(AnswerID) INTO V_answer_no
        FROM answer 
        WHERE QuestionID = NEW.questionID
        GROUP BY QuestionID;
        SELECT COUNT(answerID) INTO v_Rightanswer_no
        FROM answer
        WHERE (QusetionID =New.QuestionID AND isCorrect =1)
        GROUP BY QuestionID;
        IF v_answer_no >=4 OR (V_anwer_no <4 AND V_Rifhtanswer_no > 2 AND NEW.isCorrect =1) THEN
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT ='khong the them do ko dung cau hinh'
        END IF;
        END $$
        DELIMITER ;
        
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
-- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
DROP TRIGGER IF EXISTS auto_gender_update;
DELIMITER $$
CREATE TRIGGER Auto_Gender_Update
BEFORE INSERT ON `Account`
FOR EACH ROW 
        BEGIN IF NEW.GENDER ='NAM' THEN
          SET NEW.GENDER = 'M';
      ELSEIF NEW.GENDER = 'NU' THEN
      SET NEW.GENDER = 'F';
      ELSEIF NEW.GENDER = 'CHUA XAC DINH' THEN
      SET NEW.GENDER = 'U';
      END IF;

END $$
DELIMITER ;
        
-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
-- question khi question đó chưa nằm trong exam nào
DROP TRIGGER Delete_Update;
DELIMITER $$
CREATE TRIGGER Delete_Update
BEFORE UPDATE ON question 
FOR EACH ROW 
BEGIN 
    DECLARE not_on_exam TINYINT;
    select q.question q 
    FROM question q 
    LEFT JOIN ExamQuestion eq ON q.QuestionID = eq.QuestionID
    WHERE eq.examID IS NULL ;
        IF NEW.QuestionID != Not_ON_Exam THEN 
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = ' Khong the insert';
        END IF;
END $$
DELIMITER ;

UPDATE question 
set Content = '1'
WHERE questionid = '5' ;
        
        
        
        
        