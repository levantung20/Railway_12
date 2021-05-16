DROP DATABASE IF EXISTS Testing_System2;
CREATE DATABASE Testing_System2;

USE Testing_System2;

CREATE TABLE  Department(
    DepartmentID   mediumINT unsigned AUTO_INCREMENT primary key,

    DepartmentName      VARCHAR(60) not null unique key 
 );
 
CREATE TABLE `Position` (
    PositionID             mediumINT unsigned  unsigned AUTO_INCREMENT primary key,
    PositionName        ENUM ('dev' ,'test', 'scrum master', 'pm' ) not null unique key
    
);

CREATE TABLE `Account`(
AccountID    mediumINT unsigned  unsigned AUTO_INCREMENT primary key,
Email VARCHAR(60) not null unique key,
Username VARCHAR (60) not null unique key,
FullName VARCHAR (60)not null unique key,
DepartmentID   mediumINT unsigned not null unique key, 
PosituonID mediumINT unsigned not null unique key, 
creat DATE

);

CREATE TABLE `Group` (
GroupID    mediumINT unsigned  unsigned AUTO_INCREMENT primary key,
GroupName VARCHAR(60) not null unique key,
CreatorID    mediumINT unsigned  not null,
CreateDate DATETIME default NOW()
);

 CREATE TABLE GroupAccount ( 
 GroupID    mediumINT unsigned  unsigned AUTO_INCREMENT primary key,
 AccountID    mediumINT unsigned not null unique key, 
 JoinDate DATETIME default NOW()
 );
 
 CREATE TABLE TypeQuestion (
 TypeID    mediumINT unsigned unsigned AUTO_INCREMENT primary key,
 TypeName VARCHAR(60) not null unique key
 );
 
 CREATE TABLE CategoryQuestion (
 QuestionID    mediumINT unsigned unsigned AUTO_INCREMENT primary key,
 Content VARCHAR (60) not null unique key, 
 CategoryID    mediumINT unsigned,
 TypeID    mediumINT unsigned, 
 CreatorID    mediumINT unsigned,
 CreateDate DATETIME default NOW()
 );
 
CREATE TABLE Question (
    QuestionID    mediumINT unsigned unsigned AUTO_INCREMENT primary key,
    Content VARCHAR (60) not null unique key, 
    CategoryID    mediumINT unsigned not null unique key,
    TypeID    mediumINT unsigned,
    CreatorID    mediumINT unsigned,
    CreateDate DATETIME default NOW()
 );
 
 CREATE TABLE Answer (
 AnswerID    mediumINT unsigned unsigned AUTO_INCREMENT primary key,
 Content VARCHAR (60) not null unique key,
 QuestionID    mediumINT,
 isCorrect    mediumINT not  null unique key 
 );
 
 CREATE TABLE`Exam`(
 ExamID    mediumINT unsigned AUTO_INCREMENT primary key,
`Code` VARCHAR (60) not null unique key,
Title VARCHAR (60) not null unique key,
Duration    mediumINT unsigned,
CreatorID    mediumINT unsigned,
CreateDate DATETIME default NOW()
);

CREATE TABLE ExamQuestion (
ExamID    mediumINT unsigned unsigned AUTO_INCREMENT primary key,
QuestionID    mediumINT unsigned not null
);







 
 
