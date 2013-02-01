/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     01.02.2013 12:49:42                          */
/*==============================================================*/


drop table if exists ROLE cascade;

drop table if exists "USER" cascade;

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE (
   ID                   NUMERIC(18)          not null,
   ROLE                 VARCHAR(18)          null,
   constraint PK_ROLE primary key (ID)
);

/*==============================================================*/
/* Table: "USER"                                                */
/*==============================================================*/
create table "USER" (
   NAME                 VARCHAR(20)          not null,
   PASSWORD             VARCHAR(10)          null,
   IDROLE               NUMERIC(18)          null,
   constraint PK_USER primary key (NAME)
);

alter table "USER"
   add constraint FK_USER_REFERENCE_ROLE foreign key (IDROLE)
      references ROLE (ID)
      on delete restrict on update restrict;

