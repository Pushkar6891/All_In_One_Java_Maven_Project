use mydb;
#Inner Join
select * from mydb.author inner join book on author.author_id = book.author_id;
#Outer Join
select * from mydb.author left join book on author.author_id = book.author_id;
#Outer Join
select * from mydb.author right join book on author.author_id = book.author_id;