--------------------------------------------------------
--  ������ ������ - �����-6��-29-2023   
--------------------------------------------------------
DROP SEQUENCE "C##ITBANK"."YOUTUBE_LIST_SEQ";
DROP TABLE "C##ITBANK"."YOUTUBE_LIST" cascade constraints;
DROP TABLE "C##ITBANK"."YOUTUBE_LIST" cascade constraints;
--------------------------------------------------------
--  DDL for Sequence YOUTUBE_LIST_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "C##ITBANK"."YOUTUBE_LIST_SEQ"  MINVALUE 1 MAXVALUE 99999 INCREMENT BY 1 START WITH 18 NOCACHE  NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table YOUTUBE_LIST
--------------------------------------------------------

  CREATE TABLE "C##ITBANK"."YOUTUBE_LIST" 
   (	"IDX" NUMBER DEFAULT "C##ITBANK"."YOUTUBE_LIST_SEQ"."NEXTVAL", 
	"TITLE" VARCHAR2(500 BYTE), 
	"CHANNEL" VARCHAR2(100 BYTE), 
	"THUMBNAIL" VARCHAR2(500 BYTE), 
	"IFRAME" VARCHAR2(500 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table YOUTUBE_LIST
--------------------------------------------------------

  CREATE TABLE "C##ITBANK"."YOUTUBE_LIST" 
   (	"IDX" NUMBER DEFAULT "C##ITBANK"."YOUTUBE_LIST_SEQ"."NEXTVAL", 
	"TITLE" VARCHAR2(500 BYTE), 
	"CHANNEL" VARCHAR2(100 BYTE), 
	"THUMBNAIL" VARCHAR2(500 BYTE), 
	"IFRAME" VARCHAR2(500 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##ITBANK.YOUTUBE_LIST
SET DEFINE OFF;
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (1,'������ź �����̶�?','ħ����','https://i.ytimg.com/vi/8ApNfUJwobs/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBHxL440ij_VqKcDsM-DVjdvYO_7w','<iframe width="704" height="396" src="https://www.youtube.com/embed/8ApNfUJwobs" title="������ź �����̶�?" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (2,'[�ڸ�����] �ڷγ� Ư�� ������... ','JTBC News','https://i.ytimg.com/vi/GH9--zGwqbo/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAwKh0_I0s_5AyjtBez4dGR82Y-mw','<iframe width="704" height="396" src="https://www.youtube.com/embed/GH9--zGwqbo" title="[�ڸ�����] �ڷγ� Ư�� �����١��� ���� ���ݿ� ���� &#39;����&#39; Ȯ�� / JTBC News" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (16,'�׸��� ��ȥ 5�� ��','�̱ۺ���','https://i.ytimg.com/vi/WguqoJrCh8A/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBvnMUkj6a_buYgChE6j0hy-1gMlA','<iframe width="651" height="366" src="https://www.youtube.com/embed/WguqoJrCh8A" title="�׸��� ��ȥ 5�� ��" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (17,'������ �ζ� 1� ��÷�ƴ� (SUB)','�̱ۺ���','https://i.ytimg.com/vi/KkAEGlUN-yo/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC-sw4OaOKG-YB6tGaeaFrcmPTPmw','<iframe width="651" height="366" src="https://www.youtube.com/embed/KkAEGlUN-yo" title="������ �ζ� 1� ��÷�ƴ� (SUB)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (3,'[#������Ÿ]��2�� �� ��� ��ġ�� ��¥ ?�� ���?���� ��2�� �ΰ��� ȫ��ȣ?��ȣ�� ��ȥ �����ؿ䤻����ȣ�� ��ȥ �����ؿ䤻��|#ȫ��ȣ #���ѷ縶�ѷ� MBC230524���','���ѷ縶�ѷ� : MBC ���� ���� ä��','https://i.ytimg.com/vi/lJz7jB-jO44/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCnVFiBl8aor11EzBI6UeX47QQ5zw','<iframe width="651" height="366" src="https://www.youtube.com/embed/lJz7jB-jO44" title="[#������Ÿ]��2�� �� ��� ��ġ�� ��¥ ?�� ���?���� ��2�� �ΰ��� ȫ��ȣ?��ȣ�� ��ȥ �����ؿ䤻����ȣ�� ��ȥ �����ؿ䤻��|#ȫ��ȣ #���ѷ縶�ѷ� MBC230524���" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (4,'[#���ѵ���] ���� ������ ������ ���� �־��??? | ���ѵ���?���м��� MBC120721���','���м���','https://i.ytimg.com/vi/mgHs6DKDJe4/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB-ARVgdvQwekQw_JEPIxeg4EiN3w','<iframe width="651" height="366" src="https://www.youtube.com/embed/mgHs6DKDJe4" title="[#���ѵ���] ���� ������ ������ ���� �־��??? | ���ѵ���?���м��� MBC120721���" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (5,'�¿�(TAEYEON)�� ų�����̽��� ���̺��! - I,�״��� ��,���࿡,11:11,Blue,Time Lapse,Weekend,��Ƽ,���,Gravity,INVU,�ʸ� �׸��� �ð�','���� ���� / dingo music','https://i.ytimg.com/vi/5ch94AaPZRQ/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDKXegtqEJNBkDGRRZwCB1zxajRqg','<iframe width="651" height="366" src="https://www.youtube.com/embed/5ch94AaPZRQ" title="�¿�(TAEYEON)�� ų�����̽��� ���̺��! - I,�״��� ��,���࿡,11:11,Blue,Time Lapse,Weekend,��Ƽ,���,Gravity,INVU,�ʸ� �׸��� �ð�" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (6,'ħ���ǿ��� ����Խ��ϴ� �ø��� 1ź : ���̺�� ��� (ft. �ſ�ȣ �����)','ä�� �ʿ���','https://i.ytimg.com/vi/u63sNj7YeA8/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB33l2dL7LNK-kCTGBhzoPrciQ-zA','<iframe width="651" height="366" src="https://www.youtube.com/embed/u63sNj7YeA8" title="ħ���ǿ��� ����Խ��ϴ� �ø��� 1ź : ���̺�� ��� (ft. �ſ�ȣ �����)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (7,'�濵������:�� ��������','�濵�ڵ�','https://i.ytimg.com/vi/obFRJ2RA-JA/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC0aPhw48koMdRgAiSwdVOpnXXjSA','<iframe width="651" height="366" src="https://www.youtube.com/embed/obFRJ2RA-JA" title="�濵������:�� ��������" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (8,'��ȭ ���� �Ⱓ�� 6��...������ �� �ۿ� ���� ������3�� ��ģ ���� �����ε�','B Man �߸�','https://i.ytimg.com/vi/j_nSUgd8c7w/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBGOklDIBnuIv-PjSOy3fFJRjTEeA','<iframe width="651" height="366" src="https://www.youtube.com/embed/j_nSUgd8c7w" title="��ȭ ���� �Ⱓ�� 6��...������ �� �ۿ� ���� ������3�� ��ģ ���� �����ε�" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (9,'[#���׽�ŸK3] ���츮 �� ���� �׾�?�� ? Spicy�� ���̺�� ��� ���� �� ������ ������ | EP.5','��� :Diggle','https://i.ytimg.com/vi/Spo6kHEYUN8/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCxG2daknXgE8cr7ekVWE9bvvaFmA','<iframe width="651" height="366" src="https://www.youtube.com/embed/Spo6kHEYUN8" title="[#���׽�ŸK3] ���츮 �� ���� �׾�?�� ? Spicy�� ���̺�� ��� ���� �� ������ ������ | EP.5" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (10,'&quot;�پ���� �ϱ淡&quot;���������� �°��� ���� ���� ���Դ�/���¹��� ħ�� ���� ū ��� ���ơ�/[�̽�] 2023�� 5�� 28��(��)KBS','KBS News','https://i.ytimg.com/vi/HX__xunp7CA/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAfmXixyD6UvmOxrV7hzwdrAPmVsg','<iframe width="651" height="366" src="https://www.youtube.com/embed/HX__xunp7CA" title="&quot;�پ���� �ϱ淡&quot;���������� �°��� ���� ���� ���Դ�/���¹��� ħ�� ���� ū ��� ���ơ�/[�̽�] 2023�� 5�� 28��(��)KBS" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (11,'Ż��� ����ȸ','ħ����','https://i.ytimg.com/vi/fZvdBUhHlAY/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCOvkNK5AXJUn6llvMLacSMqp1Exw','<iframe width="651" height="366" src="https://www.youtube.com/embed/fZvdBUhHlAY" title="Ż��� ����ȸ" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (12,'[�ƹ�����] �������� �̷��� ���� �ž�. �� ����� ����. ������� �����Ƶ飾 ��ȸ�� TOP 5 �� ���� �����̸� ã�ƶ�?������� �����Ƶ��JTBC 221127 ��� ��','Drama Voyage','https://i.ytimg.com/vi/cUdG343T6BI/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCwgxN8vFWmSn8ww57UnUNupb54PQ','<iframe width="651" height="366" src="https://www.youtube.com/embed/cUdG343T6BI" title="[�ƹ�����] �������� �̷��� ���� �ž�. �� ����� ����. ������� �����Ƶ飾 ��ȸ�� TOP 5 �� ���� �����̸� ã�ƶ�?������� �����Ƶ��JTBC 221127 ��� ��" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (13,'20230515 �輺���� �� with : ������ ī����, �״� (���εེ 1077) FULL.ver','���Ƹ޸�ī��','https://i.ytimg.com/vi/Mx7nSCSlUdY/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCjJomvvdUd8ebmDx_qUD5OlNYnzw','<iframe width="651" height="366" src="https://www.youtube.com/embed/Mx7nSCSlUdY" title="20230515 �輺���� �� with : ������ ī����, �״� (���εེ 1077) FULL.ver" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (14,'[SUB] ���� ���ȴ��� �������� �� ���� ���̰� �� �ǿ� ���Ͽ�..?  [������ ��Ե� ������] EP.15 #�̿��� #������ (ENG/JPN/SPA/IND)','������ ��Ե� ������','https://i.ytimg.com/vi/i3jpejz-PPc/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBd1U7x9hMT0K1XkkBGWZ0MnzrnPw','<iframe width="651" height="366" src="https://www.youtube.com/embed/i3jpejz-PPc" title="[SUB] ���� ���ȴ��� �������� �� ���� ���̰� �� �ǿ� ���Ͽ�..?  [������ ��Ե� ������] EP.15 #�̿��� #������ (ENG/JPN/SPA/IND)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
Insert into C##ITBANK.YOUTUBE_LIST (IDX,TITLE,CHANNEL,THUMBNAIL,IFRAME) values (15,'[SUB] �� ������ ����� ���ܴ�? �ǿ��� YOUNG����?  [������ ��Ե� ������] EP.14 #�̿��� #���� (ENG/JPN/SPA/IND)','������ ��Ե� ������','https://i.ytimg.com/vi/ZMYR5s9DoTs/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCDo08pI2PUkKB4D335_3VJzaVnIQ','<iframe width="651" height="366" src="https://www.youtube.com/embed/ZMYR5s9DoTs" title="[SUB] �� ������ ����� ���ܴ�? �ǿ��� YOUNG����?  [������ ��Ե� ������] EP.14 #�̿��� #���� (ENG/JPN/SPA/IND)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>');
commit;
--------------------------------------------------------
--  DDL for Index SYS_C008482
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##ITBANK"."SYS_C008482" ON "C##ITBANK"."YOUTUBE_LIST" ("IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table YOUTUBE_LIST
--------------------------------------------------------

  ALTER TABLE "C##ITBANK"."YOUTUBE_LIST" MODIFY ("TITLE" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."YOUTUBE_LIST" MODIFY ("CHANNEL" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."YOUTUBE_LIST" MODIFY ("THUMBNAIL" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."YOUTUBE_LIST" MODIFY ("IFRAME" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."YOUTUBE_LIST" ADD PRIMARY KEY ("IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
