drop table review_Img purge;
drop table review purge;

drop sequence review_seq;
drop sequence review_Img_seq;


create sequence review_seq
    start with 1
    maxvalue 9999999
    increment by 1
    nocache
    nocycle;


create sequence review_Img_seq
    start with 1
    maxvalue 9999999
    increment by 1
    nocache
    nocycle;

create table review(
    idx         number              default review_seq.nextval primary key,
    title       varchar2(500)       not null,
    writer      varchar2(200)              not null,
    content     varchar2(4000)      ,
    writeDate   date                default sysdate not null
);

create table review_Img(
    idx         number              default review_Img_seq.nextval primary key,
    filePath    varchar2(255)       not null,
    review      number              not null,
    
    constraint review_Img_fk
        foreign key(review)
        references review(idx)
        on delete cascade
);