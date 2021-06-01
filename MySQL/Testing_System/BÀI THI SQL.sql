-- Requirement 1:
-- Để quản lý Thực tập của sinh viên, người ta xây dựng một cơ sở dữ liệu có tên là
-- ThucTap gồm các sơ đồ quan hệ sau (trường có dấu gạch chân là PrimaryKey)
--  Country(country_id, country_name)
-- Location(location_id, street_address, postal_code, country_id)
--  Employee(employee_id, full_name, email, location_id)
-- Questions
-- 1. Tạo table với các ràng buộc và kiểu dữ liệu Thêm ít nhất 3 bản ghi vào table

DROP DATABASE IF EXISTS thuctap1;
CREATE DATABASE thuctap1;
use thuctap1;
DROP TABLE IF EXISTS COUNTRY;
CREATE TABLE COUNTRY (
 COUNTRY_ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
COUNTRY_NAME VARCHAR(50) 
);

DROP TABLE IF EXISTS LOCATION;
CREATE TABLE location(
 location_id INT  UNSIGNED AUTO_INCREMENT PRIMARY key,
street_address VARCHAR(50),
postal_code CHAR(20),
country_id INT UNSIGNED REFERENCES country(country_id)
 );

 DROP TABLE IF EXISTS employee;
 CREATE TABLE employee(
 employee_id INT AUTO_INCREMENT PRIMARY KEY,
 full_name VARCHAR(50) NOT NULL,
 email  VARCHAR(50) CHECK (Email like '%@%'),
 location_id INT UNSIGNED 
 );
 
-- 2 viết lệnh để
-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT *
FROM Employee
WHERE location_id IN ( 	SELECT 	location_id 
						FROM 	Location
						WHERE	country_id = (  SELECT 	country_id
												FROM 	Country
                                                WHERE 	country_name = 'Vietnam' ));
                                                
-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT 	country_name
FROM	Country
WHERE 	country_id = (	SELECT 	country_id
						FROM 	Location	
						WHERE 	location_id = (		SELECT 	location_id
													FROM 	Employee
													WHERE 	email = 'nn03@gmail.com'));
														
-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang  làm việc
SELECT C.country_name, L.street_address, COUNT(E.employee_id) AS so_nv
FROM Location		L
LEFT JOIN Employee	E	ON L.location_id = E.location_id
JOIN Country		C 	ON L.country_id	= C.country_id
GROUP BY L.location_id, L.country_id;

-- 3 Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa
-- 10 employee
 -- KHONG LAM DUOC 

-- 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
-- location đó sẽ có location_id = null
DROP TRIGGER IF EXISTS question4;
DELIMITER $$
CREATE TRIGGER question4
AFTER DELETE ON Location
FOR EACH ROW
	BEGIN
		UPDATE 	Employee
        SET 	location_id = NULL
        WHERE 	location_id = OLD.location_id;
	END $$
DELIMITER ;



