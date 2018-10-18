set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite3;
create database if not exists ecsite3;
use ecsite3;

drop table if exists login_user_transaction;
create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;
create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists cart;
create table cart(
id int not null primary key auto_increment,
buyItemId varchar(30),
itemName varchar(30),
count int,
itemPrice int,
userId varchar(30),
buyItemConfirmDate datetime
);

INSERT INTO cart(buyItemId,itemName,count,itemPrice,userId) VALUES("1","えんぴつ",1,100,"taro");
INSERT INTO item_info_transaction(item_name,item_price,item_stock) VALUES("ノートBOOK",100,50);
INSERT INTO login_user_transaction(login_id,login_pass,user_name) VALUES("internous","internous01","test");

