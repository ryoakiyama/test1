set names utf8;
set foreign_key_checks = 0;
drop database if exists oden;

create database if not exists oden;
use oden;

drop table if exists oden;

create table oden(
oden_id int primary key auto_increment,
oden_name varchar(255),
oden_price varchar(255)
);

INSERT INTO oden VALUES(1,"もち巾着",200);