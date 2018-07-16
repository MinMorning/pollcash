create table board(
id number primary key,
u_id varchar2(25) not null,
title varchar2(60) not null,
content varchar2(600) not null,
regdate date,
hit number,
ref number,
step number,
depth number
);
create sequence seq_board_id;
select * from board;

insert into board values(seq_board_id.nextval, 'misha', '첫 번째 일기', '곧 점심시간이다', sysdate,0,0,0,0);