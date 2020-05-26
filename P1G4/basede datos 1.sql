CREATE DATABASE umg4;
Use umg4;
CREATE TABLE alumnos
(
carnet_Alumno varchar(15) PRIMARY KEY,
nombre_Alumno Varchar (45) ,
direccion_Alumno  VARCHAR (45) ,
telefono_Alumno Varchar (45),
email_Alumno varchar (20),
Estatus_Alumno varchar (1)
)Engine = InnoDB ;
CREATE TABLE maestros
(
codigo_maestros varchar(5) PRIMARY KEY,
nombre_maestros Varchar(45) ,
direccion_maestros  VARCHAR(45) ,
telefono_maestros Varchar(45),
email_maestros varchar(20),
estatus_maestros varchar(1)
)Engine = InnoDB ;

CREATE TABLE facultad
(
codigo_Facultad varchar(5) PRIMARY KEY,
nombre_Facultad Varchar (45) ,
Estado_Facultad varchar (1),
foreign key (codigo_Facultad) references alumnos (carnet_Alumno)

)Engine = InnoDB ;

CREATE TABLE Cursos
(
codido_Cursos varchar(5) PRIMARY KEY,
nombre_Cursos Varchar (45) ,
Estatus_Cursos varchar (1),
foreign key (codido_Cursos) references alumnos (carnet_Alumno)
)Engine = InnoDB ;

CREATE TABLE Carreras
(
codigo_Carreras varchar(5) PRIMARY KEY,
nombre_Carreras Varchar (45) ,
Estatus_Carreras varchar (1),
foreign key (codigo_Carreras) references alumnos (carnet_Alumno)

)Engine = InnoDB ;
CREATE TABLE Secciones 
(
codigo_Secciones varchar(5) PRIMARY KEY,
nombre_Secciones Varchar (45) ,
Estatus_Secciones varchar (1),
foreign key (codigo_Secciones) references alumnos (carnet_Alumno)

)Engine = InnoDB ;

CREATE TABLE sedes
(
codigo_Sedes varchar(5) PRIMARY KEY,
nombre_Sedes Varchar (45) ,
Estatus_Sedes varchar (1),
foreign key (codigo_Sedes) references alumnos (carnet_Alumno)

)Engine = InnoDB ;
CREATE TABLE Jornada
(
codigo_jornada varchar(5) PRIMARY KEY,
nombre_jornada Varchar (45) ,
Estatus_jornada varchar (1),
foreign key (codigo_jornada) references alumnos (carnet_Alumno)

)Engine = InnoDB ;
CREATE TABLE aulas
(
codigo_aulas varchar(5) PRIMARY KEY,
nombre_aulas Varchar (45) ,
Estatus_aulas varchar (1),
foreign key (codigo_aulas) references alumnos (carnet_Alumno)

)Engine = InnoDB ;
CREATE TABLE asignacionalumnos
(
codico_carrera varchar(15) PRIMARY KEY,
condigo_sede Varchar (45) ,
codigo_jornada  VARCHAR (45) ,
codigo_seccion Varchar (45),
codigo_aula varchar (20),
carnet_curso varchar (19),
carnet_alumno varchar (19),
nota_asignacionalumon float (10,2)
)Engine = InnoDB ;


CREATE TABLE asignacionamaestros
(
codigo_carrera varchar(5) PRIMARY KEY,
codigo_sede varchar(5) ,
codigo_jornada  VARCHAR(5),
codigo_seccion Varchar(5),
codigo_aula varchar(5),
codigo_curso varchar(5),
codigo_maestrolumno varchar(5),
foreign key (codigo_Carreras) references Carreras(codigo_Carreras),
foreign key (codigo_Sedes) references sedes(codigo_Sedes),
foreign key (codigo_jornada) references jornadas(codigo_jornada),
foreign key (codigo_seccion) references secciones(codigo_seccion),
foreign key (codigo_aulas) references aulas(codigo_aulas),
foreign key (codigo_Cursos) references Cursos(codigo_Cursos),
foreign key (codigo_maestros) references maestros(codigo_maestros)
)Engine = InnoDB ;




