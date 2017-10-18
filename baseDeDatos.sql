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
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.admin: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aulainf
CREATE TABLE IF NOT EXISTS `aulainf` (
  `id` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `pizzaron` enum('TIZA','BLANCO') NOT NULL,
  `habilitada` binary(1) NOT NULL,
  `cañon` binary(1) NOT NULL,
  `ac` binary(1) NOT NULL,
  `ubicacion` binary(1) NOT NULL,
  `cantPc` int(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Volcando datos para la tabla roomguard.aulainf: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `aulainf` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulainf` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aulamm
CREATE TABLE IF NOT EXISTS `aulamm` (
  `id` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `pizzaron` enum('TIZA','BLANCO') NOT NULL,
  `habilitada` binary(1) NOT NULL,
  `cañon` binary(1) NOT NULL,
  `ac` binary(1) NOT NULL,
  `ubicacion` binary(1) NOT NULL,
  `computadora` binary(1) NOT NULL,
  `televisor` binary(1) NOT NULL,
  `dvd` binary(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.aulamm: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `aulamm` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulamm` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.aulasr
CREATE TABLE IF NOT EXISTS `aulasr` (
  `id` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `pizzaron` enum('TIZA','BLANCO') NOT NULL,
  `habilitada` binary(1) NOT NULL,
  `cañon` binary(1) NOT NULL,
  `ac` binary(1) NOT NULL,
  `ubicacion` binary(1) NOT NULL,
  `ventilador` binary(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Volcando datos para la tabla roomguard.aulasr: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `aulasr` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulasr` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.bedel
CREATE TABLE IF NOT EXISTS `bedel` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `turno` enum('MAÑANA','TARDE','NOCHE') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.bedel: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `bedel` DISABLE KEYS */;
/*!40000 ALTER TABLE `bedel` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.diareserva
CREATE TABLE IF NOT EXISTS `diareserva` (
  `fecha` date NOT NULL,
  `horaInicio` time NOT NULL,
  `horaFin` time NOT NULL,
  PRIMARY KEY (`fecha`,`horaInicio`,`horaFin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.diareserva: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `diareserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `diareserva` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.docente
CREATE TABLE IF NOT EXISTS `docente` (
  `id` int(11) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.docente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.hace
CREATE TABLE IF NOT EXISTS `hace` (
  `idMaster` int(11) NOT NULL,
  `idReserva` int(11) DEFAULT NULL,
  `idBedel` int(11) DEFAULT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_hace_reserva` (`idReserva`),
  KEY `FK_hace_bedel` (`idBedel`),
  CONSTRAINT `FK_hace_bedel` FOREIGN KEY (`idBedel`) REFERENCES `bedel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_hace_reserva` FOREIGN KEY (`idReserva`) REFERENCES `reserva` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.hace: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `hace` DISABLE KEYS */;
/*!40000 ALTER TABLE `hace` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.posee
CREATE TABLE IF NOT EXISTS `posee` (
  `idMaster` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `horaInicio` time NOT NULL,
  `horaFin` time NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_Posee_diareserva` (`fecha`,`horaInicio`,`horaFin`),
  KEY `FK_posee_aulasr` (`id`),
  CONSTRAINT `FK_Posee_aula` FOREIGN KEY (`id`) REFERENCES `aulamm` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Posee_diareserva` FOREIGN KEY (`fecha`, `horaInicio`, `horaFin`) REFERENCES `diareserva` (`fecha`, `horaInicio`, `horaFin`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_posee_aulainf` FOREIGN KEY (`id`) REFERENCES `aulainf` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_posee_aulasr` FOREIGN KEY (`id`) REFERENCES `aulasr` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.posee: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `posee` DISABLE KEYS */;
/*!40000 ALTER TABLE `posee` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.reserva
CREATE TABLE IF NOT EXISTS `reserva` (
  `id` int(11) NOT NULL,
  `tipoAula` enum('MULTIMEDIOS','INFORMATICA','SINRECURSOS') NOT NULL,
  `cantidadAlumnos` int(10) NOT NULL,
  `nombreCurso` varchar(50) NOT NULL,
  `periodo` enum('PRIMERO','SEGUNDO','ANUAL') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.reserva: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.tienediareserva
CREATE TABLE IF NOT EXISTS `tienediareserva` (
  `idMaster` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `horaInicio` time NOT NULL,
  `horaFin` time NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_tiene_reserva` (`id`),
  KEY `FK_tiene_diareserva` (`fecha`,`horaInicio`,`horaFin`),
  CONSTRAINT `FK_tiene_diareserva` FOREIGN KEY (`fecha`, `horaInicio`, `horaFin`) REFERENCES `diareserva` (`fecha`, `horaInicio`, `horaFin`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_tiene_reserva` FOREIGN KEY (`id`) REFERENCES `reserva` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.tienediareserva: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tienediareserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `tienediareserva` ENABLE KEYS */;


-- Volcando estructura para tabla roomguard.tienedocente
CREATE TABLE IF NOT EXISTS `tienedocente` (
  `idMaster` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `idDocente` int(11) NOT NULL,
  PRIMARY KEY (`idMaster`),
  KEY `FK_tienedocente_reserva` (`id`),
  KEY `FK_tienedocente_docente` (`idDocente`),
  CONSTRAINT `FK_tienedocente_docente` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_tienedocente_reserva` FOREIGN KEY (`id`) REFERENCES `reserva` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla roomguard.tienedocente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tienedocente` DISABLE KEYS */;
/*!40000 ALTER TABLE `tienedocente` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
