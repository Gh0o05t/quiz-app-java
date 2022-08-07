create table LoginS
(
	Userid varchar(15) primary key,
	passwords varchar(20)
);
select * From LoginS;

create table RegS
(
	UseridR varchar(15) primary key,
	passwordr varchar(20)
);
select * From RegS;

create table questions
(
	Qnum int Not NULL,
	Ques text,
	Opt1 varchar(30) default NULL,
	Opt2 varchar(30) default NULL,
	Opt3 varchar(30) default NULL,
	Opt4 varchar(30) default NULL,
	answer varchar(30) default NULL,
	primary key(Qnum)
);
select * From Level_1

create table Level_2
(
	Qnum int Not NULL,
	Ques text,
	Opt1 varchar(30) default NULL,
	Opt2 varchar(30) default NULL,
	Opt3 varchar(30) default NULL,
	Opt4 varchar(30) default NULL,
	answer varchar(30) default NULL,
	primary key(Qnum)
);
select * From Level_2

create table Level_3
(
	Qnum int Not NULL,
	Ques text,
	Opt1 varchar(30) default NULL,
	Opt2 varchar(30) default NULL,
	Opt3 varchar(30) default NULL,
	Opt4 varchar(30) default NULL,
	answer varchar(30) default NULL,
	primary key(Qnum)
);
select * From Level_3

