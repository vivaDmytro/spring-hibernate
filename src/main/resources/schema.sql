create table INSTRUMENT (

  ID int not null auto_increment,
  TYPE varchar (15) not null,
  PRODUCER varchar (30) not null,
  PROD_DATE datetime not null,
  PURCH_DATE datetime not null,
  PRIMARY KEY (ID)
);

create table STUDENT (

  ID int not null auto_increment,
  INSTRUMENT_ID int not null,
  FIRST_NAME varchar (40) not null,
  LAST_NAME varchar (40) not null,
  BIRTH_DATE datetime not null,
  PRIMARY KEY (ID)
);

create table PERFORMANCE_PARTICIPANTS (

  PERFORMANCE_ID int not null,
  STUDENT_ID int not null,
  PRIMARY KEY (PERFORMANCE_ID, STUDENT_ID)
);

create table PERFORMANCE (

  ID int not null auto_increment,
  COMPOSITION_ID int not null,
  PRIMARY KEY (ID)
);

create table COMPOSITION (
  ID int not null auto_increment,
  TITLE varchar(25) not null,
  AUTHOR varchar(50) not null,
  PRIMARY KEY (ID)
);