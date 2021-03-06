insert into INSTRUMENT (TYPE, PRODUCER, PROD_DATE, PURCH_DATE)
values ('guitar', 'fender', '2013-10-01 15:00:00.000', '2014-10-01 15:00:00.000');
insert into INSTRUMENT (TYPE, PRODUCER, PROD_DATE, PURCH_DATE)
values ('drum', 'yamaha', '2014-05-01 15:00:00.000', '2014-10-01 15:00:00.000');
insert into INSTRUMENT (TYPE, PRODUCER, PROD_DATE, PURCH_DATE)
values ('synthesizer', 'roland', '2014-07-01 15:00:00.000', '2014-10-01 15:00:00.000');

insert into STUDENT(INSTRUMENT_ID, FIRST_NAME, LAST_NAME, BIRTH_DATE)
values (1, 'Angus', 'Young', '1955-03-31 00:00:00.000');
insert into STUDENT(INSTRUMENT_ID, FIRST_NAME, LAST_NAME, BIRTH_DATE)
values (2, 'Ringo', 'Starr', '1940-06-07 00:00:00.000');
insert into STUDENT(INSTRUMENT_ID, FIRST_NAME, LAST_NAME, BIRTH_DATE)
values (3, 'John', 'Lord', '1950-07-30 00:00:00.000');

insert into COMPOSITION (TITLE, AUTHOR) values ('A Day in the Life', 'The Beatles');
insert into COMPOSITION (TITLE, AUTHOR) values ('Back in Black', 'AC/DC');
insert into COMPOSITION (TITLE, AUTHOR) values ('Symphony 9', 'Beethoven');

insert into PERFORMANCE (COMPOSITION_ID) values (1);
insert into PERFORMANCE (COMPOSITION_ID) values (2);
insert into PERFORMANCE (COMPOSITION_ID) values (3);

insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (1, 1);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (1, 2);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (1, 3);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (2, 1);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (2, 2);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (2, 3);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (3, 1);
insert into PERFORMANCE_PARTICIPANTS (PERFORMANCE_ID, STUDENT_ID) values (3, 3);