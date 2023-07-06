drop table upload1 purge;

create table upload1 (
    idx         int             generated always as identity primary key,
    title       varchar2(100)   not null,
    filePath    varchar2(255)   not null
);

insert into upload1(title, filePath) values('아이유', '1.jpg');
insert into upload1(title, filePath) values('단비', '단비.jpg');
insert into upload1(title, filePath) values('청하', '청하.jpg');

commit;

select * from upload1;