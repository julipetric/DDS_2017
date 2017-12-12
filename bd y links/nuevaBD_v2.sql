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

-- Data exporting was unselected.
-- Dumping structure for table roomguard.aula
CREATE TABLE IF NOT EXISTS `aula` (
  `id` varchar(50) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `pizzaron` enum('TIZA','BLANCO') NOT NULL,
  `habilitada` bit(1) NOT NULL,
  `canion` binary(1) NOT NULL,
  `ac` binary(1) NOT NULL,
  `ubicacion` binary(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.aulainf
CREATE TABLE IF NOT EXISTS `aulainf` (
  `id` varchar(50) NOT NULL,
  `cantPc` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idInf_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.aulamm
CREATE TABLE IF NOT EXISTS `aulamm` (
  `id` varchar(50) NOT NULL,
  `computadora` binary(1) NOT NULL,
  `televisor` binary(1) NOT NULL,
  `dvd` binary(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idMM_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.aulasr
CREATE TABLE IF NOT EXISTS `aulasr` (
  `id` varchar(50) NOT NULL,
  `ventilador` binary(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_idSR_idAulaPadre` FOREIGN KEY (`id`) REFERENCES `aula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.bedel
CREATE TABLE IF NOT EXISTS `bedel` (
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `turno` enum('MAÑANA','TARDE','NOCHE') NOT NULL,
  PRIMARY KEY (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.diareserva
CREATE TABLE IF NOT EXISTS `diareserva` (
  `fecha` varchar(10) NOT NULL,
  `horaInicio` varchar(6) NOT NULL,
  `horaFin` varchar(6) NOT NULL,
  `idReserva` int(11) NOT NULL,
  `idAula` varchar(50) NOT NULL,
  PRIMARY KEY (`fecha`,`horaInicio`,`horaFin`),
  KEY `FK_idReserva_diaReserva` (`idReserva`),
  KEY `FK_idAula_diaReserva` (`idAula`),
  CONSTRAINT `FK_idAula_diaReserva` FOREIGN KEY (`idAula`) REFERENCES `aula` (`id`),
  CONSTRAINT `FK_idReserva_diaReserva` FOREIGN KEY (`idReserva`) REFERENCES `reserva` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.docente
CREATE TABLE IF NOT EXISTS `docente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
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

-- Data exporting was unselected.
-- Dumping structure for table roomguard.posee
CREATE TABLE IF NOT EXISTS `posee` (
  `idMaster` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(50) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `horaInicio` varchar(6) NOT NULL,
  `horaFin` varchar(6) NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_posee_aulasr` (`id`),
  KEY `FK_posee_diareserva` (`fecha`,`horaInicio`,`horaFin`),
  CONSTRAINT `FK_posee_aulainf` FOREIGN KEY (`id`) REFERENCES `aulainf` (`id`),
  CONSTRAINT `FK_posee_aulamm` FOREIGN KEY (`id`) REFERENCES `aulamm` (`id`),
  CONSTRAINT `FK_posee_aulasr` FOREIGN KEY (`id`) REFERENCES `aulasr` (`id`),
  CONSTRAINT `FK_posee_diareserva` FOREIGN KEY (`fecha`, `horaInicio`, `horaFin`) REFERENCES `diareserva` (`fecha`, `horaInicio`, `horaFin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.reserva
CREATE TABLE IF NOT EXISTS `reserva` (
  `id` int(11) NOT NULL,
  `tipoAula` enum('MULTIMEDIOS','INFORMATICA','SINRECURSOS') NOT NULL,
  `cantidadAlumnos` int(10) NOT NULL,
  `nombreCurso` varchar(50) NOT NULL,
  `periodo` enum('PRIMERO','SEGUNDO','ANUAL') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.tienediareserva
CREATE TABLE IF NOT EXISTS `tienediareserva` (
  `idMaster` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `horaInicio` varchar(6) NOT NULL,
  `horaFin` varchar(6) NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_tienediareserva_reserva` (`id`),
  KEY `FK_tienediareserva_diareserva` (`fecha`,`horaInicio`,`horaFin`),
  CONSTRAINT `FK_tienediareserva_diareserva` FOREIGN KEY (`fecha`, `horaInicio`, `horaFin`) REFERENCES `diareserva` (`fecha`, `horaInicio`, `horaFin`),
  CONSTRAINT `FK_tienediareserva_reserva` FOREIGN KEY (`id`) REFERENCES `reserva` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table roomguard.tienedocente
CREATE TABLE IF NOT EXISTS `tienedocente` (
  `idMaster` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) NOT NULL,
  `idDocente` int(11) NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_tienedocente_reserva` (`id`),
  KEY `FK_tienedocente_docente` (`idDocente`),
  CONSTRAINT `FK_tienedocente_docente` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_tienedocente_reserva` FOREIGN KEY (`id`) REFERENCES `reserva` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
