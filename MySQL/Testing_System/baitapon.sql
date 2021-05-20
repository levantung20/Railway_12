SELECT * FROM fresher.trainee;

-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu 
 DROP DATABASE IF EXISTS fresher ;
 CREATE DATABASE fresher ;
 use fresher ;
 CREATE TABLE Trainee (
        TraineeID TINYINT,
        Fullname NVARCHAR(50),
        Birth_Date DATE,
        Gender ENUM ('Male', 'female', 'unknown' ),
        ET_IQ  TINYINT Check (ET_IQ>=0 and ET_IQ<=20),
        Et_gmath tinyint check (et_gmath >=0 and et_gmath <=20),
        ET_English tinyint check (ET_English >=0 and et_english <=50),
        Trainig_Class NVARCHAR(50),
        Evaluation_Notee NVARCHAR (50)
    
 -- Question 2: Thêm ít nhất 10 bản ghi vào table 
 INSERT into trainee
 VALUE (1, 'nguyen van a' , '2000-08-05', 'male', 10,12,30, 'VTI003','DHTM'),
         (2, 'nguyen van b' , '1994-02-12' , 'male' ,12,15,36, 'vti001','DHTM'),
         (3, 'le thi n ' , '1995-10-10' ,'female',11,14,31, 'VTI002', 'DHTM' ),
        (4, 'Dao thi d' ,'2001-05-15', 'female',14,15,16, 'VTIOO4', 'DHTM'),
        (5, 'nguyen van e' , '2002-05-11', 'female', 12,16,30, 'VTI003','DHTM'),
        (6, 'nguyen thi c' , '1990-08-10', 'female', 11,11,50, 'VTI003','DHTM'),
        (7, 'nguyen thi g' , '1994-08-09', 'female', 9,13,40, 'VTI003','DHTM'),
        (8, 'nguyen thi b' , '1995-08-08', 'female', 20,12,38, 'VTI003','DHTM'),
        (9, 'nguyen thi f' , '1996-08-06', 'female', 18,17,37, 'VTI003','DHTM'),
        (10, 'nguyen thi v' , '1997-08-05', 'female', 15,20,35, 'VTI003','DHTM');
    
 -- Question 3: Insert 1 bản ghi mà có điểm ET_IQ =30. Sau đó xem kết quả. 
 INSERT into trainee (ET_IQ) VALUE (30); 
 
 -- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, và sắp xếp theo ngày sinh. Điểm ET_IQ >=12, ET_Gmath>=12, ET_English>=20 
 SELECT *
 FROM trainee
 where ET_IQ >=12 AND ET_Gmath >= 12 and ET_English >=20;
 
 -- Question 5: Viết lệnh để lấy ra thông tin thực tập sinh có tên bắt đầu bằng chữ N và kết thúc bằng chữ C 
 SELECT *
 FROM trainee
 where full_name like `N%C`;
 
 -- Question 6: Viết lệnh để lấy ra thông tin thực tập sinh mà tên có ký thự thứ 2 là chữ G 
 SELECT *
 FROM Trainee
 WHERE full_name like `_g%`;
 
 -- Question 7: Viết lệnh để lấy ra thông tin thực tập sinh mà tên có 10 ký tự và ký tự cuối cùng là C 
 SELECT *
 FROM trainee
 WHERE Full_Name like `C%` and length(full_naem) =10;
 
 --  Question 8: Viết lệnh để lấy ra Fullname của các thực tập sinh trong lớp, lọc bỏ các tên trùng
 SELECT DISTINCT full_name
 FROM trainee;
 
 -- Question 9: Viết lệnh để lấy ra Fullname của các thực tập sinh trong lớp, sắp xếp các tên này theo thứ tự từ A-
 SELECT *
 FROM Trainee
 ORDER BY full_name asc;
 -- Question 10: Viết lệnh để lấy ra thông tin thực tập sinh có tên dài nhất
 SELECT *, length(Full_name)
 FROM trainee
 WHERE length(full_namne) = (SELECT max(length(full_name)) from trainee ;
 
 -- Question 11: Viết lệnh để lấy ra ID, Fullname và Ngày sinh thực tập sinh có tên dài nhất
 SELECT traineeID ,Full_name,birth_date
 FROM trainee
 WHERE length(full_name) = (SELECT max(length(Full_name)) from trainee);

 -- Question 12: Viết lệnh để lấy ra Tên, và điểm IQ, Gmath, English thực tập sinh có tên dài nhất
 SELECT full_name, ET_IQ, ET_Gmath, ET_English
 From trainee 
 WHERE length(full_name) = (SELECT max(length(full_name)) from trainee);

 -- Question 13: Lấy ra 5 thực tập sinh có tuổi nhỏ nhất 
 SELECT TraineeID, Full_name, (year(curdate()) - year(birth_Date)) as age FROM Trainee
 ORDER BY age asc
 LIMIT 5;
 
 -- Question 14:  Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người thỏa mãn số điểm như sau:
-- ET_IQ +ET_Gmath>=20
-- ET_IQ>=8
-- ET_Gmath >=8
-- ET_English>=18
SELECT *
FROM `Trainee table`
WHERE ET_IQ >= 8 AND ET-English >= 18 and (ET_IQ + ET_Gmath >=20)

-- Question 15: Xóa thực tập sinh có TraineeID = 5
DELETE 
FROM trainee
WHERE trainee=5;

-- Question 16: Xóa thực tập sinh có tổng điểm ET_IQ, ET_Gmath <=15
DELETE 
FROM trainee
WHERE ET_IQ+ET_Gmath <=15 ;

  -- Question 17: Xóa thực tập sinh quá 30 tuổi
  DELETE FROM trainee WHERE
year(curdate()) - year(birth_date) > 25;

-- Question 20: Đếm xem trong lớp VTI001  có bao nhiêu thực tập sinh
SELECT CONUT(training_class) 
from trainee
where trainee_class =`vti001`
 
 -- Question 22: Đếm tổng số thực tập sinh trong lớp VTI001 và VTI003 có bao nhiêu thực tập sinh. 
 SELECT Trainee_Class, count(*)
 FROM   Trainee
 GROUP BY Trainee_Class
 HAVING    Trainee_Class =`vti001` or Trainee_class = `vti003`
 
 -- Question 24: Lấy ra lớp có lớn hơn 5 thực tập viên 
 SELECT COUNT(TRainig_Class) as lop FROM Trainee GROUP BY Training_class HAVING COUNT(Training_class) >3;
 
-- Question 26: Lấy ra trường có ít hơn 4 thực tập viên tham gia khóa học 
SELECT COUNT(Training_class) as `so luong hoc vien` FROM Trainee GROUP BY Training_Clas HAVING  COUNT(EVALUATIONNOTES) <= 4;
