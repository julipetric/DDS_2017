-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.28-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for roomguard
CREATE DATABASE IF NOT EXISTS `roomguard` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `roomguard`;

-- Dumping structure for table roomguard.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table roomguard.admin: ~0 rows (approximately)
DELETE FROM `admin`;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table roomguard.aula
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

-- Dumping data for table roomguard.aula: ~0 rows (approximately)
DELETE FROM `aula`;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;

-- Dumping structure for table roomguard.aulainf
CREATE TABLE IF NOT EXISTS `aulainf` (
  `id` varchar(50) NOT NULL,
  `cantPc` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idInf_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Dumping data for table roomguard.aulainf: ~0 rows (approximately)
DELETE FROM `aulainf`;
/*!40000 ALTER TABLE `aulainf` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulainf` ENABLE KEYS */;

-- Dumping structure for table roomguard.aulamm
CREATE TABLE IF NOT EXISTS `aulamm` (
  `id` varchar(50) NOT NULL,
  `computadora` bit(1) NOT NULL,
  `televisor` bit(1) NOT NULL,
  `dvd` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idMM_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Dumping data for table roomguard.aulamm: ~0 rows (approximately)
DELETE FROM `aulamm`;
/*!40000 ALTER TABLE `aulamm` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulamm` ENABLE KEYS */;

-- Dumping structure for table roomguard.aulasr
CREATE TABLE IF NOT EXISTS `aulasr` (
  `id` varchar(50) NOT NULL,
  `ventilador` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idSR_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Dumping data for table roomguard.aulasr: ~0 rows (approximately)
DELETE FROM `aulasr`;
/*!40000 ALTER TABLE `aulasr` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulasr` ENABLE KEYS */;

-- Dumping structure for table roomguard.bedel
CREATE TABLE IF NOT EXISTS `bedel` (
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `turno` enum('MAÑANA','TARDE','NOCHE') NOT NULL,
  PRIMARY KEY (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table roomguard.bedel: ~4 rows (approximately)
DELETE FROM `bedel`;
/*!40000 ALTER TABLE `bedel` DISABLE KEYS */;
INSERT INTO `bedel` (`nombre`, `apellido`, `nombreUsuario`, `password`, `turno`) VALUES
	('asdasdasd', 'asdasd', 'asdas', '123456789', 'MAÑANA'),
	('asdasdasd', 'asdasd', 'asdasd', '123456789', 'MAÑANA'),
	('Tomas', 'Fleitas', 'ElTomaa', '123456789', 'MAÑANA'),
	('adasd', 'dsadas', 'pepe', '123456789', 'MAÑANA');
/*!40000 ALTER TABLE `bedel` ENABLE KEYS */;

-- Dumping structure for table roomguard.diareserva
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

-- Dumping data for table roomguard.diareserva: ~0 rows (approximately)
DELETE FROM `diareserva`;
/*!40000 ALTER TABLE `diareserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `diareserva` ENABLE KEYS */;

-- Dumping structure for table roomguard.docente
CREATE TABLE IF NOT EXISTS `docente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table roomguard.docente: ~0 rows (approximately)
DELETE FROM `docente`;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;

-- Dumping structure for table roomguard.hace
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

-- Dumping data for table roomguard.hace: ~0 rows (approximately)
DELETE FROM `hace`;
/*!40000 ALTER TABLE `hace` DISABLE KEYS */;
/*!40000 ALTER TABLE `hace` ENABLE KEYS */;

-- Dumping structure for table roomguard.historialdecontrasenia
CREATE TABLE IF NOT EXISTS `historialdecontrasenia` (
  `nombreUsuario` varchar(50) DEFAULT NULL,
  `fecha` int(11) DEFAULT NULL,
  `value` int(11) NOT NULL,
  `actual` int(11) DEFAULT NULL,
  PRIMARY KEY (`value`),
  KEY `FKaBedel` (`nombreUsuario`),
  CONSTRAINT `FKaBedel` FOREIGN KEY (`nombreUsuario`) REFERENCES `bedel` (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table roomguard.historialdecontrasenia: ~0 rows (approximately)
DELETE FROM `historialdecontrasenia`;
/*!40000 ALTER TABLE `historialdecontrasenia` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialdecontrasenia` ENABLE KEYS */;

-- Dumping structure for table roomguard.politicaseguridad
CREATE TABLE IF NOT EXISTS `politicaseguridad` (
  `longmin` int(11) DEFAULT NULL,
  `longmax` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table roomguard.politicaseguridad: ~0 rows (approximately)
DELETE FROM `politicaseguridad`;
/*!40000 ALTER TABLE `politicaseguridad` DISABLE KEYS */;
INSERT INTO `politicaseguridad` (`longmin`, `longmax`, `id`) VALUES
	(8, 32, 1);
/*!40000 ALTER TABLE `politicaseguridad` ENABLE KEYS */;

-- Dumping structure for table roomguard.reserva
CREATE TABLE IF NOT EXISTS `reserva` (
  `id` int(11) NOT NULL,
  `idDocente` int(11) NOT NULL,
  `tipoAula` enum('MULTIMEDIOS','INFORMATICA','SINRECURSOS') NOT NULL,
  `cantidadAlumnos` int(10) NOT NULL,
  `nombreCurso` varchar(50) NOT NULL,
  `periodo` enum('PRIMERO','SEGUNDO','ANUAL') NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_idDocente_idReserva` (`idDocente`),
  CONSTRAINT `FK_idDocente_idReserva` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table roomguard.reserva: ~0 rows (approximately)
DELETE FROM `reserva`;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
