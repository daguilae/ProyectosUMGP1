CREATE DATABASE umg4;
Use umg4;
CREATE TABLE aulas
(
id int (20) auto_increment  primary key,
codigo_aulas varchar(10) ,
nombre_aulas Varchar (45) ,
estatus_aulas varchar (20)
)Engine = InnoDB ;
USE  umg4;
SELECT * FROM   aulas;