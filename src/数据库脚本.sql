-- 删除数据库
DROP DATABASE IF EXISTS mldn ;
-- 创建数据库
CREATE DATABASE mldn CHARACTER SET UTF8 ;
-- 使用数据库
USE mldn ;
-- 创建数据表
CREATE TABLE message (
	mid	   INT		AUTO_INCREMENT ,
	title   VARCHAR(50) NOT NULL ,
	pubdate DATE ,
	content TEXT ,
	CONSTRAINT pk_mid PRIMARY KEY(mid)
) ;