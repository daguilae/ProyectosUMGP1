USE tienda;

CREATE TABLE usuarios
(
  
  id int(11) auto_increment PRIMARY KEY ,
  usuario varchar(10) ,
  password varchar(45) ,
  nombre varchar(60) ,
  email varchar(30) ,
  idTipo int(11) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
USE  tienda;
SELECT * FROM   usuarios;