 
 -- Cho table sau:
Department (Department_Number, Department_Name)
Employee_Table (Employee_Number, Employee_Name,
Department_Number)
Employee_Skill_Table (Employee_Number, Skill_Number, Date Registered)
Skill_Table (Skill_Number, Skill_Name)
Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
Question 2: Thêm ít nhất 10 bản ghi vào table
Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
Hướng dẫn: sử dụng UNION
Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
Hướng dẫn: sử dụng GROUP BY
Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
Hướng dẫn: sử dụng DISTINCT

-- cau 1
DROP DATABASE IN EXISTS quanlyNhanvien;
CREATE DATABASE quanlyNhanvien;
use quuanlyNhanvien;
CREATE TABLE Departmnet (
    DepartmentID MEDIUMINT UNSIGNED auto_INCREMENT PRIMARY key ,
    DepartentName NVARCHAR (100) Not Null UNIQUE key 
    );
    
DROP TABLE IF EXISTS Employee_table;
CREATE TABLE Employee_table (
    Employee_Number MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name NVARCHAR(100) not null
   Department_Number MIDDLEINT UNSIGNED NOT NULL , 
    FROEIGN KEY (DepartmentID) REFERNCES Department (DepartmentID)
    );
 DROP TABLE IF EXISTS Employee_sKill_table;
 CREATE TABLE EmployeeID (  
         EmployeeID MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
         SkillID MEDIUMINT UNSIGNED,
         DATe_registered date
         );
         
CREATE TABLE skill_table(
Skill_Number MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 Skill_Name NVARCHAR (100) Not null );
 -- cau 2 
USE QUANLYNHANVIEN;
INSERT INTO Department (Department_Number, Department_Name )
	VALUES (1,'kỸ thuật'),
            (2,' kiểm hàng'),
            (3,'phát triển nhân lực '),
            (4,'lĩnh vực'),
            (5,'kinh doanh'),
            (6,'kế toán '),
                (7,'Sale'),
            (8,'đào tạo'),
            (9,'nhân sự'),
            (10,'Tiếp thị');
INSERT INTO Employee_Table (Employee_Number,Employee_Name,Department_Number)
VALUE (1,'lgoodge0',2),
        (2,'dgeertz1',9),
        (3,'qharwick2',9),
        (4,'noriordan3',2),
        (5,'ledmondson4',8),
        (6,'cgerauld5',7),
        (7,'thowgego6',7),
        (8,'vkiernan7',8),
        (9,'tgegg8',1),
        (10,'iadamidesa',1);
INSERT INTO Employee_Skill_Table (Employee_Number,Skill_Number,CreateDate)                            
VALUE (1,2,'2017-04-09'),
        (2,3,'2020-09-13'),
        (3,3,'2018-01-23'),
        (4,2,'2018-11-30'),
        (5,7,'2019-06-16'),
        (6,9,'2019-12-26'),
        (7,3,'2017-08-27'),
        (8,2,'2017-08-08'),
        (9,1,'2017-09-23'),
        (10,5,'2018-10-08');

INSERT INTO Skill_Table (Skill_Number,Skill_Name)
VALUE (1,'JAVA'),
        (2,'JAVASCRIPT'),
        (3,'RUBY'),
        (4,'PHP'),
        (5,'VUAJS'),
        (6,'REACTJS'),
        (7,'HTML'),
        (8,'CSS'),
        (9,'.NET'),
        (10,'PYTHON');
								

-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java Hướng dẫn: sử dụng UNION
SELECT Employee_Name
FROM   Employee_skil_table es
Join employee_table e on e.employee_number = es.employee_number
WHERE ES.SKill_Number =1;

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT D.department_name
FROM department.e
 JOIN empolyee e on d.departmentnumber=e.departmentNumber
 GROUP BY D.departmentNumber Having COUNT(d.departmentNumber) > 3;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
Hướng dẫn: sử dụng GROUP BY
SELECT DE.Department_Name,EM.Empolyee_Name
FROM Department DE LEFT JOIN employee_table EM
ON DE.Department_Number = EM.Department_Number
GROUP BY DE.Department_Number
ORDER BY DE. Department_Name asc ;

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills
SELECT E.Employee_Number , e.Employee_Name, COUNT(*) AS SKILL_Number
FROM Employee_table e
JOIN employee_skill_table et ON e.Employee_number = et.Employee_number
GROUP BY Empolyee_number
having skill_number>1;







         
 
        
        













