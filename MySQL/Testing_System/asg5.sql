use testingSystem5;
  -- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
  DROP VIEW IF EXISTS L;
  CREATE VIEW L AS
  SELECT A.username, A.FullName , A.Email
  From `account` A
  join Department  d on a.DepartmentID = D.DepartmentID
  where D.DepartmentName LIKE '%sale%' ;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
DROP VIEW IF EXISTS l;
CREATE VIEW L AS
select A.AccountID, A.username, A.emaill, COUNT(A.username) as danhsachnhanvien
FROM Groupaccount GA
JOIN 'L' A ON GA.AccountID = A.AccountID
Group BY A.username
HAVING COUNT(A.username) = ( SELECT max(couta) 

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
được coi là quá dài) và xóa nó đi
DROP VIEW overlongcontent as
SELECT *
FROM  question
where length(content) >18;
DROP VIEW overlongcontent;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW danhsachnhanvien AS 
select d.departmentname, count(accountID) as workers
FROM  `account` a
LEFT JOIN department d ON a.DepartmentID = d.DepartmentID
GROUP BY a.DepartmentID
ORDER BY Workers DESC
LIMIT 0,5;

-- cau5
CREATE VIEW danhsachcauhoi_nguyen as
SELECT * FROM question q JOIN `account` a on
q.CreatorID = a.AccountID 
where a.fullname like 'nguyen%'
; 