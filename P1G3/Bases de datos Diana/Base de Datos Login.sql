create database pro;
use pro;
create table Login
(
	id int  (50) auto_increment PRIMARY KEY,
	CodigoUsuario varchar (20),
	CodigoContrasenia varchar (20)
) ENGINE=InnoDB;