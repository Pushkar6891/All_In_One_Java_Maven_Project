use mydb;
create table Author(author_id int(10) NOT NULL PRIMARY KEY,first_name VARCHAR(20),last_name VARCHAR(20));
create table Book(book_id int(10) NOT NULL PRIMARY KEY,author_id int(10),book_title VARCHAR(20),ISBN VARCHAR(20),version VARCHAR(20),FOREIGN KEY(author_id) REFERENCES Author(author_id));
insert into Author(author_id,first_name,last_name) values(1,'Trevor','Page');
insert into Author(author_id,first_name,last_name) values(2,'Jane','Doe');
insert into Author(author_id,first_name,last_name) values(3,'Jack','Johnson');
insert into Book(book_id,author_id,book_title) values(1,1,'Programming in Java');
insert into Book(book_id,author_id,book_title) values(2,1,'Programming in .Net');
insert into Book(book_id,author_id,book_title) values(3,3,'Programming in Ruby');