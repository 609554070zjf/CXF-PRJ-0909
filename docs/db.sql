-- 数据库 db_stu_cxf
create db_stu_cxf;
use db_stu_cxf;

-- 学生表 t_student
CREATE TABLE t_student(
	stuNo VARCHAR(10), 						    		-- 学号
	stuName VARCHAR(30) NOT NULL, 						-- 学生姓名
	stuSex CHAR(1) DEFAULT 'M' NOT NULL, 				-- 学生性别
	stuAddress VARCHAR(100) NOT NULL,  					-- 学生地址
	CONSTRAINT T_STU_PK PRIMARY KEY(stuNo), 			-- 主键约束（学号stuNo)
	CONSTRAINT T_STU_SEX_CK CHECK(stuSex IN('M','F')) 	-- 检查约束（学生性别stuSex)
)


-- 测试数据
INSERT INTO t_student VALUE("s001","张三","M","福建师范大学旗山校区1-101");
INSERT INTO t_student VALUE("s002","李四","F","福建师范大学旗山校区1-102");
INSERT INTO t_student VALUE("s003","王五","M","福建师范大学旗山校区1-103");
INSERT INTO t_student VALUE("s004","mary","F","福建师范大学旗山校区1-104");
INSERT INTO t_student VALUE("s005","jack","M","福建师范大学旗山校区1-105");
