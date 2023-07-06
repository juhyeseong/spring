drop table homework_board purge;
drop sequence homework_board_seq;

create sequence homework_board_seq
    start with 1
    maxvalue 9999
    increment by 1
    nocache
    nocycle;

create table homework_board(
    idx         number          default homework_board_seq.nextval primary key,
    title       varchar2(200)   not null,
    content     varchar2(3000)  not null,
    writeDate   Date   default sysdate not null,
    password    varchar2(100)   not null
);