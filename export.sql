--------------------------------------------------------
--  File created - Friday-March-29-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence ADMINIDSEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MMS"."ADMINIDSEQ"  MINVALUE 1 MAXVALUE 100 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence ADMINSEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MMS"."ADMINSEQ"  MINVALUE 1 MAXVALUE 100 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence BRANCHADMINSEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MMS"."BRANCHADMINSEQ"  MINVALUE 11 MAXVALUE 99 INCREMENT BY 1 START WITH 11 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence HIBERNATE_SEQUENCE
--------------------------------------------------------

   CREATE SEQUENCE  "MMS"."HIBERNATE_SEQUENCE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence MEDICINESEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MMS"."MEDICINESEQ"  MINVALUE 1 MAXVALUE 100 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table ADMIN
--------------------------------------------------------

  CREATE TABLE "MMS"."ADMIN" 
   (	"ADMINID" VARCHAR2(10 BYTE) DEFAULT 1, 
	"FIRST_NAME" VARCHAR2(50 BYTE), 
	"LAST_NAME" VARCHAR2(50 BYTE), 
	"AGE" NUMBER(2,0), 
	"GENDER" VARCHAR2(20 BYTE), 
	"DOB" VARCHAR2(10 BYTE), 
	"CONTACT_NUMBER" NUMBER(10,0), 
	"ALT_CONTACT_NUMBER" NUMBER(10,0), 
	"EMAIL_ID" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table BRANCH_ADMIN
--------------------------------------------------------

  CREATE TABLE "MMS"."BRANCH_ADMIN" 
   (	"BRANCH_ADMIN_ID" VARCHAR2(10 BYTE), 
	"FIRST_NAME" VARCHAR2(50 BYTE), 
	"LAST_NAME" VARCHAR2(50 BYTE), 
	"AGE" NUMBER(2,0), 
	"GENDER" VARCHAR2(20 BYTE), 
	"DOB" VARCHAR2(10 BYTE), 
	"CONTACT_NUMBER" VARCHAR2(10 BYTE), 
	"ALT_CONTACT_NUMBER" VARCHAR2(10 BYTE), 
	"EMAIL_ID" VARCHAR2(50 BYTE), 
	"BRANCH_NAME" VARCHAR2(50 BYTE), 
	"ADDRESS_LINE_1" VARCHAR2(100 BYTE), 
	"ADDRESS_LINE_2" VARCHAR2(100 BYTE), 
	"CITY" VARCHAR2(50 BYTE), 
	"STATE" VARCHAR2(50 BYTE), 
	"ZIP_CODE" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table BRANCH_ADMIN_REQUEST
--------------------------------------------------------

  CREATE TABLE "MMS"."BRANCH_ADMIN_REQUEST" 
   (	"REQUEST_ID" NUMBER(8,0), 
	"BRANCH_ADMIN_ID" VARCHAR2(10 BYTE), 
	"REQUEST_DATE" VARCHAR2(20 BYTE), 
	"MEDICINE_ID_1" NUMBER, 
	"QUANTITY1" NUMBER(3,0), 
	"MEDICINE_ID_2" NUMBER, 
	"QUANTITY2" NUMBER(3,0), 
	"MEDICINE_ID_3" NUMBER, 
	"QUANTITY3" NUMBER(3,0), 
	"MEDICINE_ID_4" NUMBER, 
	"QUANTITY4" NUMBER(3,0), 
	"MEDICINE_ID_5" NUMBER, 
	"QUANTITY5" NUMBER(3,0), 
	"OTHER_INFO" VARCHAR2(200 BYTE), 
	"ADMIN_PROCESS_DATE" VARCHAR2(20 BYTE), 
	"ADMIN_RESPONSE" VARCHAR2(1 BYTE), 
	"ADMIN_REMARKS" VARCHAR2(300 BYTE), 
	"REQUES_DATE" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table MEDICINE
--------------------------------------------------------

  CREATE TABLE "MMS"."MEDICINE" 
   (	"MEDICINE_ID" NUMBER(8,0), 
	"MEDICINE_DESCRIPTION" VARCHAR2(200 BYTE), 
	"CURE_FOR" VARCHAR2(100 BYTE), 
	"MANUFACTURING_COMPANY" VARCHAR2(50 BYTE), 
	"DOSAGE" NUMBER(3,0), 
	"PRESCRIBED_FOR" VARCHAR2(1 BYTE), 
	"QUANTITY" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into MMS.ADMIN
SET DEFINE OFF;
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('1','Mark','Henry',20,'M','21/11/1996',9632587410,null,'abc@xyz.com','abc');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('2','xtz','singh',48,'Male','12/5/1989',7894561233,7410258963,'ps@ers','tree');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('4','vdf','dfdfs',12,'Male','12/2/1996',1234567890,1234567900,'dfgg','dffse');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('3','all','is well',12,'Male','12/34/1212',2124344334,2133433432,'xcvfgv','wsdweqd');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('admin1','sdsds','sdsds',22,'Male','11/02/2018',23232,2323,'ssdsds','sdsdsd');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('admin25','ddd','ddd',34,'Female','11/02/2018',7777777,7777777,'dddddd','333');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('admin26','fdf','dfdf',23,'Female','11/02/2018',2222,2222,'ssss','2222');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('admin27','dvds','vsdvc',21,'Male','1/1/1234',4563456,45345,'gfs','sgsfd');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('admin21','dfd','dscs',12,'Male','12/12/1234',5656,4544,'dfg','dsg');
Insert into MMS.ADMIN (ADMINID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,PASSWORD) values ('admin22','trt','erter',12,'Male','12/12/1234',32434,3434,'dfdsf','dfafdf');
REM INSERTING into MMS.BRANCH_ADMIN
SET DEFINE OFF;
Insert into MMS.BRANCH_ADMIN (BRANCH_ADMIN_ID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,BRANCH_NAME,ADDRESS_LINE_1,ADDRESS_LINE_2,CITY,STATE,ZIP_CODE) values ('1','hbghj','hjghj',65,'Male','12/5/4454','9638527410','5456464646','abjhugh','hghjg','jhjkh','huh','jkhu','hjkghug',54564);
Insert into MMS.BRANCH_ADMIN (BRANCH_ADMIN_ID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,BRANCH_NAME,ADDRESS_LINE_1,ADDRESS_LINE_2,CITY,STATE,ZIP_CODE) values ('2','nitinm','hjghj',65,'Male','12/5/4454','9638527410','5456464646','abjhugh','hghjg','jhjkh','huh','jkhu','hjkghug',54564);
Insert into MMS.BRANCH_ADMIN (BRANCH_ADMIN_ID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,BRANCH_NAME,ADDRESS_LINE_1,ADDRESS_LINE_2,CITY,STATE,ZIP_CODE) values ('3','payia','bathla',22,'Male','22/8/1996','9872860681','7009184485','payush22@gmail.com','cdc','abc','xyz','Abohar','punjab',152116);
Insert into MMS.BRANCH_ADMIN (BRANCH_ADMIN_ID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,BRANCH_NAME,ADDRESS_LINE_1,ADDRESS_LINE_2,CITY,STATE,ZIP_CODE) values ('branch29','nitin','verma',21,'Male','9/11/1997','1212232312','1212121212','nitn@gmail.com','dermatology','navy nagar','colaba','mumbai','mumbai',40005);
Insert into MMS.BRANCH_ADMIN (BRANCH_ADMIN_ID,FIRST_NAME,LAST_NAME,AGE,GENDER,DOB,CONTACT_NUMBER,ALT_CONTACT_NUMBER,EMAIL_ID,BRANCH_NAME,ADDRESS_LINE_1,ADDRESS_LINE_2,CITY,STATE,ZIP_CODE) values ('branch30','nitin','verma',21,'Male','9/11/1997','1231231234','1231232112','nitin@gmail.com','dermatology','navy nagar','colaba','mumbai','maharashtra',400005);
REM INSERTING into MMS.BRANCH_ADMIN_REQUEST
SET DEFINE OFF;
Insert into MMS.BRANCH_ADMIN_REQUEST (REQUEST_ID,BRANCH_ADMIN_ID,REQUEST_DATE,MEDICINE_ID_1,QUANTITY1,MEDICINE_ID_2,QUANTITY2,MEDICINE_ID_3,QUANTITY3,MEDICINE_ID_4,QUANTITY4,MEDICINE_ID_5,QUANTITY5,OTHER_INFO,ADMIN_PROCESS_DATE,ADMIN_RESPONSE,ADMIN_REMARKS,REQUES_DATE) values (54,'45','564',12,31,null,null,null,null,null,null,null,null,null,null,null,null,null);
Insert into MMS.BRANCH_ADMIN_REQUEST (REQUEST_ID,BRANCH_ADMIN_ID,REQUEST_DATE,MEDICINE_ID_1,QUANTITY1,MEDICINE_ID_2,QUANTITY2,MEDICINE_ID_3,QUANTITY3,MEDICINE_ID_4,QUANTITY4,MEDICINE_ID_5,QUANTITY5,OTHER_INFO,ADMIN_PROCESS_DATE,ADMIN_RESPONSE,ADMIN_REMARKS,REQUES_DATE) values (7,'sdd7','12/5/2005',1,12,4,54,3,57,4,54,5,65,'please give discount ',null,null,null,null);
REM INSERTING into MMS.MEDICINE
SET DEFINE OFF;
Insert into MMS.MEDICINE (MEDICINE_ID,MEDICINE_DESCRIPTION,CURE_FOR,MANUFACTURING_COMPANY,DOSAGE,PRESCRIBED_FOR,QUANTITY) values (1,'fas','asgfasd','sdfa',2,'A',34);
Insert into MMS.MEDICINE (MEDICINE_ID,MEDICINE_DESCRIPTION,CURE_FOR,MANUFACTURING_COMPANY,DOSAGE,PRESCRIBED_FOR,QUANTITY) values (3,'Dengue ','Dengue fever','CIPLA',1,'A',45);
Insert into MMS.MEDICINE (MEDICINE_ID,MEDICINE_DESCRIPTION,CURE_FOR,MANUFACTURING_COMPANY,DOSAGE,PRESCRIBED_FOR,QUANTITY) values (2,'egwiahr','gfai','flsa',1,'A',900);
Insert into MMS.MEDICINE (MEDICINE_ID,MEDICINE_DESCRIPTION,CURE_FOR,MANUFACTURING_COMPANY,DOSAGE,PRESCRIBED_FOR,QUANTITY) values (6,'Good medicine','majak','Strepsils',2,'A',123);
Insert into MMS.MEDICINE (MEDICINE_ID,MEDICINE_DESCRIPTION,CURE_FOR,MANUFACTURING_COMPANY,DOSAGE,PRESCRIBED_FOR,QUANTITY) values (45,'FWUIU','ADHIO','SFJASP',7,'A',79860);
--------------------------------------------------------
--  DDL for Index BRANCH_ADMIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MMS"."BRANCH_ADMIN_PK" ON "MMS"."BRANCH_ADMIN" ("BRANCH_ADMIN_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index MEDICINE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MMS"."MEDICINE_PK" ON "MMS"."MEDICINE" ("MEDICINE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index TABLE1_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MMS"."TABLE1_PK" ON "MMS"."ADMIN" ("ADMINID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ADMIN
--------------------------------------------------------

  ALTER TABLE "MMS"."ADMIN" ADD CONSTRAINT "TABLE1_PK" PRIMARY KEY ("ADMINID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MMS"."ADMIN" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("EMAIL_ID" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("CONTACT_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("DOB" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("GENDER" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("AGE" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("LAST_NAME" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("FIRST_NAME" NOT NULL ENABLE);
  ALTER TABLE "MMS"."ADMIN" MODIFY ("ADMINID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BRANCH_ADMIN
--------------------------------------------------------

  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("ZIP_CODE" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("STATE" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("CITY" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("ADDRESS_LINE_1" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("BRANCH_NAME" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("EMAIL_ID" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("CONTACT_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("DOB" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("GENDER" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("AGE" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("LAST_NAME" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" ADD CONSTRAINT "BRANCH_ADMIN_PK" PRIMARY KEY ("BRANCH_ADMIN_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("FIRST_NAME" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN" MODIFY ("BRANCH_ADMIN_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BRANCH_ADMIN_REQUEST
--------------------------------------------------------

  ALTER TABLE "MMS"."BRANCH_ADMIN_REQUEST" MODIFY ("QUANTITY1" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN_REQUEST" MODIFY ("MEDICINE_ID_1" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN_REQUEST" MODIFY ("REQUEST_DATE" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN_REQUEST" MODIFY ("BRANCH_ADMIN_ID" NOT NULL ENABLE);
  ALTER TABLE "MMS"."BRANCH_ADMIN_REQUEST" MODIFY ("REQUEST_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MEDICINE
--------------------------------------------------------

  ALTER TABLE "MMS"."MEDICINE" MODIFY ("QUANTITY" NOT NULL ENABLE);
  ALTER TABLE "MMS"."MEDICINE" ADD CONSTRAINT "MEDICINE_PK" PRIMARY KEY ("MEDICINE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MMS"."MEDICINE" MODIFY ("PRESCRIBED_FOR" NOT NULL ENABLE);
  ALTER TABLE "MMS"."MEDICINE" MODIFY ("DOSAGE" NOT NULL ENABLE);
  ALTER TABLE "MMS"."MEDICINE" MODIFY ("MANUFACTURING_COMPANY" NOT NULL ENABLE);
  ALTER TABLE "MMS"."MEDICINE" MODIFY ("CURE_FOR" NOT NULL ENABLE);
  ALTER TABLE "MMS"."MEDICINE" MODIFY ("MEDICINE_DESCRIPTION" NOT NULL ENABLE);
  ALTER TABLE "MMS"."MEDICINE" MODIFY ("MEDICINE_ID" NOT NULL ENABLE);