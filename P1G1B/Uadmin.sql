create database Admin1;
use Admin1;
create table usuarios
(
id int (11)auto_increment primary key,
usuario varchar (10),
password varchar (50),
nombre varchar (60),
email varchar (30),
idtipo int (30)
)engine=InnoDB default charset=latin1;

USE Admin1;
Select * From usuarios;