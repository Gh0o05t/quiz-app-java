create table level_3
(
	Qnum int Not NULL,
	Ques text,
	Opt1 varchar(100) default NULL,
	Opt2 varchar(100) default NULL,
	Opt3 varchar(100) default NULL,
	Opt4 varchar(100) default NULL,
	answer varchar(100) default NULL,
	primary key(Qnum)
);

create table if not exists scorecard(username varchar(15),subject varchar(10) , score int, foreign key(username) references logins(userid) on delete cascade)

insert into level_1 values(6,'','','','','','')
insert into level_2 values(1,'','','','','','')
insert into level_3 values(1,'','','','','','')

select * from level_1;
select * from level_2;
select * from level_3;
select * from logins;
select * from logint;
select * from scorecard;

delete from level_1 where qnum = 4

truncate table logins;
truncate table logint;
truncate table level_1;
truncate table level_2;
truncate table level_3;