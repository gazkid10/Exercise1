create table table1(id integer, value integer);
insert into table1 values(1, -56);
insert into table1 values(2, 76);
insert into table1 values(3, -84);
insert into table1 values(4, 96);
insert into table1 values(5, -57);

update table1 set value = (value*-1);

create table table2("Division id" integer, Year integer, Revenue integer);
insert into table2 values(1, 2018, 60);
insert into table2 values(1, 2021, 40);
insert into table2 values(1, 2020, 70);
insert into table2 values(2, 2021, -10);
insert into table2 values(3, 2018, 20);
insert into table2 values(3, 2016, 40);
insert into table2 values(4, 2021, 50);

select "Division id" from "table2" where year = 2021 and revenue > 0;

create table table3(id integer, Year integer);
insert into table3 values(1, 1776);
insert into table3 values(2, 2001);
insert into table3 values(3, 1643);
insert into table3 values(4, 1865);
insert into table3 values(5, 1969);

alter table table3 add column Century int;
update table3 set century = (("year" / 100) + 1);

create table table4(id integer, Value integer);
insert into table4 values(1, 4);
insert into table4 values(2, 11);
insert into table4 values(3, 57);
insert into table4 values(4, 24);
insert into table4 values(5, 47);
select case when Value%2 = 0 then 'Even' when Value/2 != 0 then 'Odd' end as EvenTheOdds from table4;


create table table5(id integer, Name varchar, Age integer);
insert into table5 values(1, 'Bob', 21);
insert into table5 values(2, 'Sam', 19);
insert into table5 values(3, 'Jill', 18);
insert into table5 values(4, 'Jim', 21);
insert into table5 values(5, 'Sally', 19);
insert into table5 values(6, 'Jess', 20);
insert into table5 values(7, 'Will', 21);

select age, count(*) from table5 group by age order by age;

create table table6(id integer, Name varchar);
insert into table6 values(1, 'Bob');
insert into table6 values(2, 'Sam');
insert into table6 values(3, 'Jill');
insert into table6 values(4, 'Jim');
insert into table6 values(5, 'Sally');
insert into table6 values(6, 'Jess');
insert into table6 values(7, 'Will');
select concat('Hi ', Name, '! How are you today?') from table6;

create table table7(id integer, Name varchar, "Amount Sold" integer);
insert into table7 values(1, 'Cup', 11);
insert into table7 values(2, 'Saucer', 22);
insert into table7 values(3, 'Plate', 46);
insert into table7 values(4, 'Fork', 34);
insert into table7 values(5, 'Spoon', 45);
insert into table7 values(6, 'Knife', 78);
insert into table7 values(7, 'Mug', 23);
insert into table7 values(8, 'Glass', 64);
insert into table7 values(9, 'Tumbler', 24);
select name from table7 order by "Amount Sold" desc limit 5;

create table table8(id integer, Name varchar, Country varchar);
insert into table8 values(1, 'Bob Smith', 'United States');
insert into table8 values(2, 'Jim Jones', 'China');
insert into table8 values(3, 'Sam White', 'Japan');
insert into table8 values(4, 'Jess Black', 'Canada');
insert into table8 values(5, 'Will Wilson', 'Germany');
insert into table8 values(6, 'Wilson Scott', 'England');
insert into table8 values(7, 'Scott Daniels', 'France');
insert into table8 values(8, 'Daniel Jackson', 'Canada');
insert into table8 values(9, 'Jack Jackson', 'United States');
select Country from table8 where Country != 'United States' and Country != 'Canada';

create table table9(id integer, Name varchar, Age integer);
insert into table9 values(1, 'Bob', 21);
insert into table9 values(2, 'Sam', 19);
insert into table9 values(3, 'Jill', 18);
insert into table9 values(4, 'Jim', 21);
insert into table9 values(5, 'Sally', 19);
insert into table9 values(6, 'Jess', 20);
insert into table9 values(7, 'Will', 21);
select distinct Age from table9 order by age;

create table table10(id integer, Name varchar, Age integer);
insert into table10 values(1, 'Bob', 21);
insert into table10 values(2, 'Sam', 19);
insert into table10 values(3, 'Jill', 18);
insert into table10 values(4, 'Jim', 21);
insert into table10 values(5, 'Sally', 19);
insert into table10 values(6, 'Jess', 20);
insert into table10 values(7, 'Wll', 21);
select SUM(Age) FROM table10;
