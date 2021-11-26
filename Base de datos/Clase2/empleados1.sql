-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 16-10-2021 a las 19:41:11
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejercicio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `id_emp` int(8) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `trabajo` varchar(40) NOT NULL,
  `edad` int(3) NOT NULL,
  `salario` int(8) NOT NULL,
  `mail` varchar(40) NOT NULL,
  PRIMARY KEY (`id_emp`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`nombre`, `trabajo`) VALUES
('Juan', 'Programador Senior'),
('Gonzalo', 'Programador Senior'),
('Ana', 'Desarrollador Web'),
('Alfred', 'Programador'),
('Maria', 'Desarrollador Web'),
('Eduardo', 'Programador'),
('Juan', 'Programador'),
('Alejandro', 'Programador'),
('Hernan', 'Especialista Multimedia'),
('Paublo', 'Especialista Multimedia'),
('Arturo', 'Especialista Multimedia'),
('Jimena', 'Diseñador Web Senior'),
('Roberto', 'Administrador de Sistemas'),
('Daniel', 'Administrador de Sistemas'),
('Miguel', 'Ejecutivo de Ventas Senior'),
('Monica', 'Ejecutivo de Ventas'),
('Alicia', 'Ejecutivo de Ventas'),
('Jose', 'Ejecutivo de Ventas'),
('Sabrina', 'Gerente de Soporte Tecnico'),
('Pedro', 'Gerente de Finanzas'),
('Mariano', 'Presidente');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
