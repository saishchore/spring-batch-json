DROP TABLE IF EXISTS student;
CREATE TABLE student (
  id SERIAL PRIMARY KEY,  
  roll_number varchar(255) default NULL,
  name varchar(255) default NULL
);