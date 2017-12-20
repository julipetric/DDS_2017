-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.10-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para roomguard
CREATE DATABASE IF NOT EXISTS `roomguard` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `roomguard`;


-- Volcando estructura para tabla roomguard.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.admin: ~0 rows (aproximadamente)
DELETE FROM `admin`;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`id`, `nombre`, `apellido`, `password`) VALUES
	(1, 'Tomas', 'Fleitas', '123456789');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aula
CREATE TABLE IF NOT EXISTS `aula` (
  `id` varchar(50) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `pizzaron` enum('TIZA','BLANCO') NOT NULL,
  `habilitada` bit(1) NOT NULL,
  `canion` bit(1) NOT NULL,
  `ac` bit(1) NOT NULL,
  `ubicacion` varchar(50) NOT NULL,
  `tipo` enum('MULTIMEDIOS','INFORMATICA','SINRECURSOS') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.aula: ~0 rows (aproximadamente)
DELETE FROM `aula`;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` (`id`, `capacidad`, `pizzaron`, `habilitada`, `canion`, `ac`, `ubicacion`, `tipo`) VALUES
	('1', 20, 'TIZA', b'1', b'1', b'1', 'piso 1', 'MULTIMEDIOS');
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aulainf
CREATE TABLE IF NOT EXISTS `aulainf` (
  `id` varchar(50) NOT NULL,
  `cantPc` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idInf_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Volcando datos para la tabla roomguard.aulainf: ~0 rows (aproximadamente)
DELETE FROM `aulainf`;
/*!40000 ALTER TABLE `aulainf` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulainf` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aulamm
CREATE TABLE IF NOT EXISTS `aulamm` (
  `id` varchar(50) NOT NULL,
  `computadora` bit(1) NOT NULL,
  `televisor` bit(1) NOT NULL,
  `dvd` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idMM_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Volcando datos para la tabla roomguard.aulamm: ~0 rows (aproximadamente)
DELETE FROM `aulamm`;
/*!40000 ALTER TABLE `aulamm` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulamm` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aulasr
CREATE TABLE IF NOT EXISTS `aulasr` (
  `id` varchar(50) NOT NULL,
  `ventilador` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idSR_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Volcando datos para la tabla roomguard.aulasr: ~0 rows (aproximadamente)
DELETE FROM `aulasr`;
/*!40000 ALTER TABLE `aulasr` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulasr` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.bedel
CREATE TABLE IF NOT EXISTS `bedel` (
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `turno` enum('MAÑANA','TARDE','NOCHE') NOT NULL,
  `fecha` varchar(50) NOT NULL,
  PRIMARY KEY (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.bedel: ~9 rows (aproximadamente)
DELETE FROM `bedel`;
/*!40000 ALTER TABLE `bedel` DISABLE KEYS */;
INSERT INTO `bedel` (`nombre`, `apellido`, `nombreUsuario`, `password`, `turno`, `fecha`) VALUES
	('terce', 'ahorasiPerro', '1245', '1597538522', 'TARDE', '19/12/2017'),
	('TomasAndres', 'Fleitas', 'aewqd1', '789456123', 'NOCHE', '16/12/2017'),
	('nuevonuevo', 'nuevonuevo', 'Ejeje', '1234567892222', 'MAÑANA', '16/12/2017'),
	('Tomas', 'Andres', 'ElCoco', 'ahoraanda', 'MAÑANA', '16/12/2017'),
	('ElTomaa', 'Fleitas', 'ElTomaa', '123456789', 'MAÑANA', '16/12/2017'),
	('ElTomaaGG', 'Fleitas', 'ElTomaa2', '1234567892', 'MAÑANA', '16/12/2017'),
	('asdsad', 'adasd', 'ElTomaaa', '123456789', 'MAÑANA', '16/12/2017'),
	('Jose', 'Rodriguez', 'Jose', '123456789', 'MAÑANA', '16/12/2017'),
	('JulianSabe', 'Patriarca', 'Julian', '789456123', 'NOCHE', '16/12/2017'),
	('tomas', 'fleitas', 'TomasFleitas', '1234567892', 'MAÑANA', '19/12/2017');
/*!40000 ALTER TABLE `bedel` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.diareserva
CREATE TABLE IF NOT EXISTS `diareserva` (
  `fecha` varchar(10) NOT NULL,
  `horaInicio` varchar(6) NOT NULL,
  `horaFin` varchar(6) NOT NULL,
  `idReserva` int(11) NOT NULL,
  `idAula` varchar(50) NOT NULL,
  PRIMARY KEY (`fecha`,`horaInicio`,`horaFin`,`idReserva`),
  KEY `FK_idReserva_diaReserva` (`idReserva`),
  KEY `FK_idAula_diaReserva` (`idAula`),
  CONSTRAINT `FK_idAula_diaReserva` FOREIGN KEY (`idAula`) REFERENCES `aula` (`id`),
  CONSTRAINT `FK_idReserva_diaReserva` FOREIGN KEY (`idReserva`) REFERENCES `reserva` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.diareserva: ~0 rows (aproximadamente)
DELETE FROM `diareserva`;
/*!40000 ALTER TABLE `diareserva` DISABLE KEYS */;
INSERT INTO `diareserva` (`fecha`, `horaInicio`, `horaFin`, `idReserva`, `idAula`) VALUES
	('01/12/2017', '08:00', '08:30', 1, '1'),
	('01/12/2017', '08:00', '08:30', 2, '1'),
	('02/12/2017', '08:00', '08:30', 1, '1'),
	('03/12/2017', '08:00', '08:30', 1, '1'),
	('04/12/2017', '08:00', '08:30', 1, '1'),
	('05/12/2017', '08:00', '08:30', 1, '1'),
	('14/12/2017', '08:00', '08:30', 2, '1'),
	('16/12/2017', '08:00', '08:30', 2, '1'),
	('22/12/2017', '08:30', '09:30', 2, '1'),
	('22/12/2017', '10:00', '11:00', 2, '1'),
	('23/12/2017', '08:30', '09:30', 2, '1'),
	('24/12/2017', '08:30', '09:30', 2, '1');
/*!40000 ALTER TABLE `diareserva` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.docente
CREATE TABLE IF NOT EXISTS `docente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.docente: ~0 rows (aproximadamente)
DELETE FROM `docente`;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` (`id`, `apellido`, `nombre`, `email`) VALUES
	(1, 'Fleitas', 'Tomas', 'tomas_federal@hotmail.com');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.hace
CREATE TABLE IF NOT EXISTS `hace` (
  `idMaster` int(11) NOT NULL AUTO_INCREMENT,
  `idReserva` int(11) NOT NULL,
  `idBedel` varchar(50) NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_hace_reserva` (`idReserva`),
  KEY `FK_hace_bedel` (`idBedel`),
  CONSTRAINT `FK_hace_bedel` FOREIGN KEY (`idBedel`) REFERENCES `bedel` (`nombreUsuario`),
  CONSTRAINT `FK_hace_reserva` FOREIGN KEY (`idReserva`) REFERENCES `reserva` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.hace: ~0 rows (aproximadamente)
DELETE FROM `hace`;
/*!40000 ALTER TABLE `hace` DISABLE KEYS */;
/*!40000 ALTER TABLE `hace` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.historialdecontrasenia
CREATE TABLE IF NOT EXISTS `historialdecontrasenia` (
  `nombreUsuario` varchar(50) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `value` varchar(50) NOT NULL,
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`),
  KEY `FKaBedel` (`nombreUsuario`),
  CONSTRAINT `FKaBedel` FOREIGN KEY (`nombreUsuario`) REFERENCES `bedel` (`nombreUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.historialdecontrasenia: ~25 rows (aproximadamente)
DELETE FROM `historialdecontrasenia`;
/*!40000 ALTER TABLE `historialdecontrasenia` DISABLE KEYS */;
INSERT INTO `historialdecontrasenia` (`nombreUsuario`, `fecha`, `value`, `ID`) VALUES
	('ElTomaa', '16/12/2017', '123456789', 1),
	('ElTomaa', '16/12/2017', '1234567892', 2),
	('ElCoco', '16/12/2017', '123456789', 3),
	('ElCoco', '16/12/2017', '1234567892', 4),
	('ElCoco', '16/12/2017', 'ahoraanda', 11),
	('ElTomaa', '16/12/2017', 'ahoraanda', 12),
	('1245', '16/12/2017', 'ahoraanda', 13),
	('1245', '16/12/2017', '123456789', 14),
	('Jose', '16/12/2017', '123456789', 15),
	('Ejeje', '16/12/2017', '123456789', 16),
	('1245', '16/12/2017', 'sisisisisi', 17),
	('ElTomaaa', '16/12/2017', '123456789', 18),
	('aewqd1', '16/12/2017', '159753654', 19),
	('aewqd1', '16/12/2017', '111111111', 20),
	('aewqd1', '16/12/2017', '789456123', 21),
	('ElTomaa2', '16/12/2017', '123456789', 22),
	('ElTomaa2', '16/12/2017', '789456123', 23),
	('ElTomaa2', '16/12/2017', '1234567892', 24),
	('1245', '16/12/2017', '159753852', 25),
	('Julian', '16/12/2017', '123456789', 26),
	('Julian', '16/12/2017', '789456123', 27),
	('Ejeje', '16/12/2017', '1234567892', 28),
	('Ejeje', '16/12/2017', '12345678922', 29),
	('Ejeje', '16/12/2017', '123456789222', 30),
	('Ejeje', '16/12/2017', '1234567892222', 31),
	('TomasFleitas', '19/12/2017', '123456789', 32),
	('TomasFleitas', '19/12/2017', '1234567892', 33),
	('1245', '19/12/2017', '1597538522', 34);
/*!40000 ALTER TABLE `historialdecontrasenia` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.politicaseguridad
CREATE TABLE IF NOT EXISTS `politicaseguridad` (
  `longmin` int(11) DEFAULT NULL,
  `longmax` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.politicaseguridad: ~0 rows (aproximadamente)
DELETE FROM `politicaseguridad`;
/*!40000 ALTER TABLE `politicaseguridad` DISABLE KEYS */;
INSERT INTO `politicaseguridad` (`longmin`, `longmax`, `id`) VALUES
	(8, 32, 1);
/*!40000 ALTER TABLE `politicaseguridad` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.reserva
CREATE TABLE IF NOT EXISTS `reserva` (
  `id` int(11) NOT NULL,
  `idDocente` int(11) NOT NULL,
  `tipoAula` enum('MULTIMEDIOS','INFORMATICA','SINRECURSOS') NOT NULL,
  `cantidadAlumnos` int(10) NOT NULL,
  `nombreCurso` varchar(50) NOT NULL,
  `periodo` enum('PRIMERO','SEGUNDO','ANUAL','ESPORADICA') NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_idDocente_idReserva` (`idDocente`),
  CONSTRAINT `FK_idDocente_idReserva` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.reserva: ~0 rows (aproximadamente)
DELETE FROM `reserva`;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` (`id`, `idDocente`, `tipoAula`, `cantidadAlumnos`, `nombreCurso`, `periodo`) VALUES
	(1, 1, 'MULTIMEDIOS', 1, 'adad', 'ESPORADICA'),
	(2, 1, 'MULTIMEDIOS', 1, 'adadsa', 'ESPORADICA');
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
