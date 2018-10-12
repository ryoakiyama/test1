set names utf8;
set foreign_key_checks = 0;
create database if not exists e_bookshare;
use e_bookshare;
drop table if exists book_list;

create table book_list(
id int not null primary key auto_increment,
bookname varchar(50),
bookprice varchar(50)
);

INSERT INTO book_list(bookname,bookprice) VALUES("よくわかる料理","20000");
INSERT INTO book_list(bookname,bookprice) VALUES("おいしい牛乳","3000");