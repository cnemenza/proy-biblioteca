-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2018 a las 23:31:51
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbbiblioteca`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Alumno` (`pid_alum` BIGINT(20), `pnom_alum` VARCHAR(30), `pape_alum` VARCHAR(30), `pdir_alum` VARCHAR(150), `pcarrera_alum` VARCHAR(30), `pedad_alum` VARCHAR(5), `pcel_alum` CHAR(9), `pdni_alum` CHAR(8))  UPDATE talumno 
SET id_alumno = pid_alum,nom_alum = pnom_alum, ape_alum = pape_alum ,dir_alum = pdir_alum, carrera_alum = pcarrera_alum ,edad_alum = pedad_alum ,cel_alum = pcel_alum ,dni_alum = pdni_alum 
WHERE id_alumno = pid_alum$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Autor` (IN `pid_autor` INT(11), IN `pnom_autor` VARCHAR(30), IN `pape_autor` VARCHAR(20), IN `pnacimiento` VARCHAR(5), IN `pnacion_autor` VARCHAR(30))  UPDATE tautor 
SET id_autor = pid_autor,nom_autor = pnom_autor, ape_autor = pape_autor, nacion_autor = pnacion_autor,nacimiento = pnacimiento
WHERE id_autor = pid_autor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Empleado` (IN `pid_emp` INT(11), IN `pnom_emp` VARCHAR(50), IN `pape_emp` VARCHAR(50), IN `pdni_emp` CHAR(8), IN `pfecha_ing` DATE, IN `pstatus` CHAR(1))  UPDATE templeado 
SET id_empleado = pid_emp,nom_empleado = pnom_emp, ape_empleado = pape_emp, dni_empelado = pdni_emp, fechaing_empleado = pfecha_ing,  status_empleado = pstatus
WHERE id_empleado=pid_emp$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Libro` (IN `pid_libro` INT(11), IN `ptit_libro` VARCHAR(180), IN `pedit_libro` VARCHAR(30), IN `pid_autor` INT(11), IN `pid_genero` INT(11), IN `pfecha_entrada_libro` DATE, IN `pstatus_libro` CHAR(1), IN `pidioma` VARCHAR(30), IN `parea` VARCHAR(30), IN `pstock_libro` VARCHAR(5))  UPDATE tautor 
SET id_libro = pid_libro, tit_libro = ptit_libro, edit_libro = pedit_libro ,id_autor = pid_autor , id_genero = pid_genero,fecha_entrada_libro = pfecha_entrada_libro ,status_libro = pstatus_libro ,idioma = pidioma ,area = parea ,stock_libro = pstock_libro 
WHERE id_libro = pid_libro$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_AlumnoID` (`pid_alumno` BIGINT(20))  SELECT * FROM talumno
WHERE id_alumno=pid_alumno$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_AutorID` (`pid_autor` INT(11))  SELECT * FROM tautor
WHERE id_autor=pid_autor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_AutorNombre` (`pnom_autor` VARCHAR(30))  SELECT * FROM tautor
WHERE nom_autor=pnom_autor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_EmpleadoDni` (IN `pdni_empleado` CHAR(8))  SELECT * FROM templeado
WHERE dni_empelado =pdni_empleado$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_EmpleadoID` (`pid_empleado` INT(11))  SELECT * FROM templeado
WHERE id_empleado=pid_empleado$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_EmpleadoNombre` (`pnom_empleado` VARCHAR(50))  SELECT * FROM templeado
WHERE nom_empleado=pnom_empleado$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_LibroAutor` (`pnom_autor` VARCHAR(30))  select id_libro,tit_libro,edit_libro,nom_autor,nom_genero,fecha_entrada_libro,status_libro ,idioma ,area ,stock_libro "+
                    "from tlibro inner join tautor on tlibro.id_autor = tautor.id_autor inner join tgenero on tlibro.id_genero=tgenero.id_genero where tautor.nom_autor LIKE CONCAT ('%',pnom_autor,'%')$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_LibroID` (IN `pid_libro` INT(11))  select id_libro,tit_libro,edit_libro,nom_autor,nom_genero,fecha_entrada_libro,status_libro ,idioma ,area ,stock_libro "+
                    "from tlibro inner join tautor on tlibro.id_autor = tautor.id_autor inner join tgenero on tlibro.id_genero=tgenero.id_genero
WHERE id_libro=pid_libro$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_LibroNombre` (`ptit_libro` VARCHAR(180))  select id_libro,tit_libro,edit_libro,nom_autor,nom_genero,fecha_entrada_libro,status_libro ,idioma ,area ,stock_libro from tlibro inner join tautor on tlibro.id_autor = tautor.id_autor inner join tgenero on tlibro.id_genero=tgenero.id_genero where tlibro.tit_libro like CONCAT ('%',ptit_libro,'%')$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_Prestamo` (`vidPrestamo` INT(11))  select* from tprestamo where id_prestamo = vidPrestamo$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Alumno` (`pid_alum` CHAR(8))  DELETE FROM talumno
WHERE id_alumno = pid_alum$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Autor` (`pid_autor` CHAR(8))  DELETE FROM tautor
WHERE id_autor = pid_autor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Empleado` (`pid_emp` CHAR(8))  DELETE FROM templeado
WHERE id_empleado= pid_emp$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Libro` (`pid_libro` INT(11))  DELETE FROM tlibro
WHERE id_libro = pid_libro$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Alumno` (`pnom_alum` VARCHAR(30), `pape_alum` VARCHAR(30), `pdir_alum` VARCHAR(150), `pcarrera_alum` VARCHAR(30), `pedad_alum` VARCHAR(5), `pcel_alum` CHAR(9), `pdni_alum` CHAR(8))  INSERT INTO talumno (nom_alum, ape_alum, dir_alum, carrera_alum , edad_alum, cel_alum, dni_alum)VALUES
(pnom_alum, pape_alum, pdir_alum, pcarrera_alum , pedad_alum, pcel_alum, pdni_alum)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Autor` (`pnom_autor` VARCHAR(30), `pape_autor` VARCHAR(20), `pnacimiento` VARCHAR(5), `pnacion_autor` VARCHAR(30))  INSERT INTO tautor(nom_autor, ape_autor, nacimiento, nacion_autor )VALUES
(pnom_autor, pape_autor, pnacimiento, pnacion_autor )$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Empleado` (`pnom_emp` VARCHAR(50), `pape_emp` VARCHAR(50), `pdni_emp` CHAR(8), `pfecha_ing` DATE, `pstatus` CHAR(1))  INSERT INTO templeado (nom_empleado,ape_empleado,dni_empelado,fechaing_empleado,status_empleado)
VALUES (pnom_emp,pape_emp,pdni_emp,pfecha_ing,pstatus)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Libro` (IN `ptit_libro` VARCHAR(180), IN `pedit_libr` VARCHAR(30), IN `pid_autor` INT(11), IN `pid_genero` INT(11), IN `pstatus_libro` CHAR(1), IN `pidioma` VARCHAR(30), IN `parea` VARCHAR(30), IN `pstock_libro` VARCHAR(5))  INSERT INTO tlibro(tit_libro,edit_libro ,id_autor ,id_genero,fecha_entrada_libro ,status_libro ,idioma ,area ,stock_libro )VALUES
(ptit_libro,pedit_libr ,pid_autor ,pid_genero,now() ,pstatus_libro ,pidioma ,parea ,pstock_libro )$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Listar_Alumno` ()  SELECT * FROM talumno$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Listar_Autor` ()  SELECT * FROM tautor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Listar_Empleado` ()  SELECT * FROM templeado$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Listar_Genero` ()  SELECT * FROM tgenero$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Listar_Libro` ()  select id_libro,tit_libro,edit_libro,nom_autor,nom_genero,fecha_entrada_libro,status_libro ,idioma ,area ,stock_libro "+
                    "from tlibro inner join tautor on tlibro.id_autor = tautor.id_autor inner join tgenero on tlibro.id_genero=tgenero.id_genero$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Listar_Prestamos` ()  SELECT id_prestamo, ape_alum,nom_empleado,tit_libro,fecha_prestamo,fecha_devolucion,fecha_devuelto
FROM tprestamo p
inner join talumno a
on p.id_alumno = a.id_alumno
inner join templeado e
on p.id_empleado = e.id_empleado
inner join tlibro l
on p.id_libro = l.id_libro$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Registrar_Devolucion` (IN `vid_prestamo` INT(11))  UPDATE tprestamo set fecha_devuelto = now() where id_prestamo = vid_prestamo$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Registrar_Prestamo` (IN `vid_alumno` INT(11), IN `vid_empleado` INT(11), IN `vid_libro` INT(11))  INSERT INTO tprestamo(
  id_alumno,
  id_empleado,
	id_libro,
	fecha_prestamo,fecha_devolucion)
VALUES(
  vid_alumno,
  vid_empleado,
    vid_libro,
    now(),
    ADDDATE(now(),INTERVAL 	7 DAY)
)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_Login` (IN `vnombre` VARCHAR(50), IN `vdni` CHAR(8))  SELECT
    *
FROM
    templeado where nom_empleado = vnombre AND dni_empelado = vdni$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `talumno`
--

CREATE TABLE `talumno` (
  `id_alumno` bigint(20) UNSIGNED NOT NULL,
  `nom_alum` varchar(30) DEFAULT NULL,
  `ape_alum` varchar(30) DEFAULT NULL,
  `dir_alum` varchar(150) DEFAULT NULL,
  `carrera_alum` varchar(30) DEFAULT NULL,
  `edad_alum` varchar(5) DEFAULT NULL,
  `cel_alum` char(9) DEFAULT NULL,
  `dni_alum` char(8) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `talumno`
--

INSERT INTO `talumno` (`id_alumno`, `nom_alum`, `ape_alum`, `dir_alum`, `carrera_alum`, `edad_alum`, `cel_alum`, `dni_alum`) VALUES
(1, 'Christian', 'Nemenza', 'Av. Javier Prado 1521', 'Software', '20', '952789996', '75141180'),
(2, 'Carlos', 'Alcanatara', 'Av. Aviacion 123', 'Software', '20', NULL, '85321565'),
(3, 'Diego', 'Cabrera', 'Av. Las flores 231', 'Mecanica', '22', '953214568', '54265478'),
(4, 'Sergio', 'Coronado', 'Av. Wiesse 133', 'Mecanica', '21', '963215456', '45215987'),
(5, 'Aldahir', 'Solorzano', 'Margomarca 1023', 'Nutricion', '19', NULL, '75632154'),
(6, 'Carlos', 'Cardenas', 'Los Olvidados de Dios 1420', 'Sistemas', '18', '953215647', '74512365');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tautor`
--

CREATE TABLE `tautor` (
  `id_autor` bigint(20) UNSIGNED NOT NULL,
  `nom_autor` varchar(30) DEFAULT NULL,
  `ape_autor` varchar(20) DEFAULT NULL,
  `nacion_autor` varchar(30) DEFAULT NULL,
  `nacimiento` varchar(5) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tautor`
--

INSERT INTO `tautor` (`id_autor`, `nom_autor`, `ape_autor`, `nacion_autor`, `nacimiento`) VALUES
(1, 'Joanne', 'Rowling', 'Reino Unido', '1540'),
(2, 'Gabriel', 'Garcia Marquez', 'Peru', '1640'),
(3, 'Mario ', 'Vargas Llosa', 'Peru', '1450'),
(4, 'Stephen ', 'King', 'EEUU', '1800'),
(5, 'Edgar Allan', 'Poe', 'EEUU', NULL),
(6, 'Julio ', 'Cortazar', 'Belgica', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `templeado`
--

CREATE TABLE `templeado` (
  `id_empleado` bigint(20) UNSIGNED NOT NULL,
  `nom_empleado` varchar(50) DEFAULT NULL,
  `ape_empleado` varchar(50) DEFAULT NULL,
  `dni_empelado` char(8) DEFAULT NULL,
  `fechaing_empleado` date DEFAULT NULL,
  `status_empleado` char(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `templeado`
--

INSERT INTO `templeado` (`id_empleado`, `nom_empleado`, `ape_empleado`, `dni_empelado`, `fechaing_empleado`, `status_empleado`) VALUES
(1, 'Rosa', 'Angeles', '12345678', '2010-12-14', 'A'),
(2, 'Paolo', 'Guerrero', '75632148', '2018-03-15', 'A'),
(3, 'Christian', 'Nemenza', '75141180', '1996-03-14', 'A'),
(4, 'Juan', 'Quispe', '75215489', '2017-04-01', 'A'),
(5, 'Carlos', 'Enrique', '75142589', '2018-01-10', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tgenero`
--

CREATE TABLE `tgenero` (
  `id_genero` bigint(20) UNSIGNED NOT NULL,
  `nom_genero` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tgenero`
--

INSERT INTO `tgenero` (`id_genero`, `nom_genero`) VALUES
(1, 'Novela'),
(2, 'Cuento'),
(3, 'Ensayo'),
(4, 'Drama'),
(5, 'Leyenda'),
(6, 'Magico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tlibro`
--

CREATE TABLE `tlibro` (
  `id_libro` bigint(20) UNSIGNED NOT NULL,
  `tit_libro` varchar(180) DEFAULT NULL,
  `edit_libro` varchar(30) DEFAULT NULL,
  `id_autor` int(11) NOT NULL,
  `id_genero` int(11) NOT NULL,
  `fecha_entrada_libro` date DEFAULT NULL,
  `status_libro` char(1) DEFAULT NULL,
  `idioma` varchar(30) DEFAULT NULL,
  `area` varchar(30) DEFAULT NULL,
  `stock_libro` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tlibro`
--

INSERT INTO `tlibro` (`id_libro`, `tit_libro`, `edit_libro`, `id_autor`, `id_genero`, `fecha_entrada_libro`, `status_libro`, `idioma`, `area`, `stock_libro`) VALUES
(1, 'Harry Potter y el cáliz de fuego', 'Santallana', 1, 1, '2000-07-08', 'A', 'Catellano', 'Sobrenatural', '23'),
(2, 'La ciudad y los perros', 'Caminos del Inca', 2, 1, '1963-05-03', 'A', 'Castellano', 'Realidad', '14'),
(3, 'El cuervo', 'Tomaroti', 5, 4, '1935-05-03', 'A', 'Castellano', 'Fantasia', '35'),
(4, 'it', 'Coquito', 4, 1, '1986-05-14', 'A', 'Castellano', 'Terror', '30'),
(5, 'El resplandor', 'Coquito Advance', 4, 4, '1977-05-09', 'A', 'Castellano', 'Terror', '21'),
(6, 'La danza de la muerte', 'Advanced', 4, 1, '1978-05-04', 'A', 'Ingles', 'Drama', '15'),
(7, 'Carrie', 'Prophep', 4, 1, '1978-05-10', 'A', 'Ingles', 'Suspenso', '15'),
(8, 'Misery', 'Coquito', 4, 1, '1987-05-03', 'A', 'Ingles', 'Terror', '34'),
(9, 'La niebla', 'Coquito', 4, 4, '1980-05-03', 'A', 'Ingles', 'Terror', '19'),
(10, 'El misterio de Salem\'s Lot', 'Coquito', 4, 4, '1975-05-02', 'A', 'Ingles', 'Terror', '35');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tprestamo`
--

CREATE TABLE `tprestamo` (
  `id_prestamo` bigint(20) UNSIGNED NOT NULL,
  `id_alumno` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `id_libro` int(11) NOT NULL,
  `fecha_prestamo` date DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `fecha_devuelto` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tprestamo`
--

INSERT INTO `tprestamo` (`id_prestamo`, `id_alumno`, `id_empleado`, `id_libro`, `fecha_prestamo`, `fecha_devolucion`, `fecha_devuelto`) VALUES
(1, 1, 1, 1, NULL, NULL, '2018-07-06'),
(2, 2, 3, 4, '2018-07-06', '2018-07-13', '2018-07-06'),
(3, 4, 2, 1, '2018-07-06', '2018-07-13', '2018-07-06'),
(4, 3, 2, 1, '2018-07-06', '2018-07-13', NULL),
(5, 1, 2, 3, '2018-07-06', '2018-07-13', '2018-07-06'),
(6, 2, 3, 4, '2018-07-06', '2018-07-13', '2018-07-06');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `talumno`
--
ALTER TABLE `talumno`
  ADD PRIMARY KEY (`id_alumno`);

--
-- Indices de la tabla `tautor`
--
ALTER TABLE `tautor`
  ADD PRIMARY KEY (`id_autor`);

--
-- Indices de la tabla `templeado`
--
ALTER TABLE `templeado`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `tgenero`
--
ALTER TABLE `tgenero`
  ADD PRIMARY KEY (`id_genero`);

--
-- Indices de la tabla `tlibro`
--
ALTER TABLE `tlibro`
  ADD PRIMARY KEY (`id_libro`),
  ADD KEY `id_autor` (`id_autor`),
  ADD KEY `id_genero` (`id_genero`);

--
-- Indices de la tabla `tprestamo`
--
ALTER TABLE `tprestamo`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `id_alumno` (`id_alumno`),
  ADD KEY `id_empleado` (`id_empleado`),
  ADD KEY `id_libro` (`id_libro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `talumno`
--
ALTER TABLE `talumno`
  MODIFY `id_alumno` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tautor`
--
ALTER TABLE `tautor`
  MODIFY `id_autor` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `templeado`
--
ALTER TABLE `templeado`
  MODIFY `id_empleado` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tgenero`
--
ALTER TABLE `tgenero`
  MODIFY `id_genero` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tlibro`
--
ALTER TABLE `tlibro`
  MODIFY `id_libro` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tprestamo`
--
ALTER TABLE `tprestamo`
  MODIFY `id_prestamo` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
