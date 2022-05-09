
create database project;

use project;

create table user (
num int not null auto_increment,
user_id varchar(20),
user_pw varchar(20),
gender varchar(10),
user_name varchar(20),
user_photo varchar(20),
location varchar(20),
job varchar(20),
education varchar(20),
height int,
weight int,
	primary key(num)
    );

alter table user add mbti_type varchar(20);