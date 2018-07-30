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

insert into board values(seq_board_id.nextval, 'misha', 'ù ��° �ϱ�', '�� ���ɽð��̴�', sysdate,0,0,0,0);

create table member( 
id varchar2(25) not null,
password varchar2(40) not null,
emain varchar2(50) not null,
point number not null
);