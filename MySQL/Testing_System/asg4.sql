
SELECT * FROM department WHERE departmnet =4;

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT a.accountid, a.fullname , d.departmentname
FROM `account` a LEFT JOIN department d ON a.departmentID  = d.departmentID;
 
 -- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
 SELECT *
 FROM `account` 
 WHERE CreateDate >=2010/12/20;
 
 -- Question 3: Viết lệnh để lấy ra tất cả các developer
 SELECT *
 FROM `account` 
 WHERE PositionID =1;
 
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT
 department_name AS bo_phan , count(ac.department_id) as thanhvien
 from
    department as de
    JOIN 
        `account` AS ac on de.department_id = ac.department_id
    GROUP BY department_name
    HAVING COUNT( ac.department_id) >=3;
    
    -- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhấT
    SELECT q.QuestionID, q.Content  FROM examquestion e
    INNER JOIN question q ON e.QuestionID = q.QuestionID
    GROUP BY e.QuestionID 
    HAVING COUNT(e.QuestionID) = (SELECT max(countQuestion) 
                                  From
                                        (SELECT count(*) as countQuestion
                                         FROM examquestion  
                                         GROUP BY QuestionID) as maxCount);


-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT q.categroryID, c.CategoryName, count(q.categoryID) AS solansudung
FROM question q
JOIN categoryquestion c on q.CategoryID = c.CategoryID
GROUP BY q.CategoryID ORDER BY q.CategoryID;

--  Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT q.questionID , q.Content , COUNT(q.QuestionID) as solasudung
FROM question q
JOIN examquestion eq ON q.QuestionID = eq.QuestionID
GROUP BY q.QuestionID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
DROP VIEW IF EXISTS AnswerNo_of_question;
CREATE VIEW AnswerNo_of_question AS
(SELECT q.QuestionID, q.Content, a.answerID, COUNT(*) as so cau tra loi 
FROM answer a 
JOIN question q on a.QuestionID = q.QuestionID
GROUP BY q.QuestionID
ORDER BY socautraloi DESC);
SELECT *
FROM AnswerNo_of_question
WHERE Socautraloi =( SELECT MAX(Socatraloi) FROM answerNo_of_question);

-- Question 9: Thống kê số lượng account trong mỗi group
SELECT A.groupID ,COUNT(B.groupID) AS `soluong account`
FROM groupaccount A
INNER JOIN `group` B on A.GroupID =B.GroupID
GROUP BY(A.GroupID) ORDER BY 'so luong account' DESC ;
SELECT A.GroupID, Count (B.GroupID) 'so luong account'
FROM groupaccount A
INNER JOIN `group` B ON A.GroupID = B.GroupID
GROUP BY (A.GroupID)
ORDER BY `so luong account` DESC ; 
 
-- Question 10: Tìm chức vụ có ít người nhất
     SELECT p.positionname FROM `account` a
     INNER JOIN position p ON a.positionID = p.positionID
     GROUP BY a.positionID
     HAVING COUNT(a.positionID) = (SELECT MIN(countposition)
                                    FROM
                                        (SELECT count(*) as countposition
                                        FROM `account`
                                        GROUP BY PositionID) as minCount) ;

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT d.DepartmentID,d.DepartmentName, p.postionName,
count(p.Positionid) as SL FROM `account` a 
INNER JOIN department d ON a.DepartmentID = d.DepartmentID
INNER JOIN position p ON a.PositionID = p.PositionID 
GROUP BY a.DepartmentID, a.PositionID;

 --  Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
 SELECT T.Type_Name as dinhdanhcauhoi , COUNT(Q.TypeID) AS soluongcauhoi
 FROM question
 JOIN Type_Question T on t.TypeID = Q.TypeID
GROUP BY Q.TypeID ;
 
 -- Question 14:Lấy ra group không có account nào
 SELECT *
 FROM `GROUP` g
 LEFT JOIN groupaccount GA
 ON g.GroupID = ga.GroupID WHERE GA.GroupID is NULL;
 
-- Question 16: Lấy ra question không có answer nào
SELECT q.questionID, q.Content
FROM Question q
LEFT JOIN answer A on A.QuestionID = Q.QuestionID
WHERE A.QuestionID is Null;

 
 
 
 
 