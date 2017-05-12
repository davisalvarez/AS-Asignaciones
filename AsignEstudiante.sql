CREATE DATABASE AsignEstudiante;
USE AsignEstudiante;
CREATE TABLE Estudiante(
	idUsuaio INT AUTO_INCREMENT,
	nombreP VARCHAR(64),
	carne INT,
	nombreU VARCHAR(32),
	passU VARCHAR(32),
	correo VARCHAR(32),
	telefono INT,
	PRIMARY KEY(idUsuaio)
);
