drop database if exists testdb;
create database testdb;
use testdb;

create table test_table(
No int,name varchar(50),age int,Mail varchar(50));

insert into test_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into test_table values(2,"Sato",39,"yyy@google.com");
insert into test_table values(3,"Harada",44,"zzz@yahoo.co.jp");