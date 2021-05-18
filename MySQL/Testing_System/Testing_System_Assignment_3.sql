-- Question 2: lấy ra tất cả các phòng ban 
SELECT *
FROM departmentID;

-- Question 3: lấy ra id của phòng ban "Sale" 
SELECT DepartmentID
FROM   Department
WHERE  DepartmentNAME LIKE 

-- Question 4: lấy ra thông tin account có full name dài nhất 
-- 
 -- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
 --  
 
 -- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019 
 SELECT Groupname 
 FROM `group`
 WHERE Createdate <'2019-12-20' ;

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời 
SELECT QuestionID, COUNT (AnswerID)
FROM answer 
GROUP BY questionID 
HAVING COUNT (answerID) >=4

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT *
FROM EXAM 
WHERE createdate <2019-12-12 ;

-- Question 9: Lấy ra 5 group được tạo gần đây nhất 
SELECT departmentID 
COUNT (*)
FROM `GROUP` 
CREATEDATE desc limit 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2 
SELECT departmentID,  COUNT(AccountID) AS sonhanvien
FROM `Account`
GROUP BY departmentID 
HAVING departmentID =2 ;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o
SELECT * 
FROM `Account`
WHERE FullName like`D%O`;

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12
DELETE FROM EXam
WHERE Createdate <= `2019-12-20`

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
 UPDATE `account`
 set 
 fullname :`Nguyễn Bá Lộc`
emaill = `loc.nguyenba@vti.com.vn
where Account ID =5 ;


 
 