/*
SQLyog Community v8.81 
MySQL - 5.5.16 : Database - db_sccu
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_sccu` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_sccu`;

DROP TABLE IF EXISTS `sca_campa�a`;

CREATE TABLE `sca_campa�a` (
  `id_campa�a` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_campa�a`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `sca_campa�a` */

insert  into `sca_campa�a`(`id_campa�a`,`nombre`,`descripcion`) values (1,'Campa�a Verano','Campa�a'),(2,'Campa�a Invierno','Campa�a'),(6,'Campa�a Oto�o','Campa�a');


DROP TABLE IF EXISTS `sca_periodo`;

CREATE TABLE `sca_periodo` (
  `id_periodo` bigint(60) NOT NULL AUTO_INCREMENT,
  `tipo_periodo` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `fecha_inicio` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL,
  `estado` varchar(1) NOT NULL,
  `id_periodo_anual` bigint(60) NOT NULL,
  `id_campa�a` bigint(60) NOT NULL,
  PRIMARY KEY (`id_periodo`),
  KEY `sca_campa�a_sca_periodo_fk` (`id_campa�a`),
  KEY `sca_periodo_anual_sca_periodo_fk` (`id_periodo_anual`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `sca_periodo` */

insert  into `sca_periodo`(`id_periodo`,`tipo_periodo`,`nombre`,`fecha_inicio`,`fecha_fin`,`estado`,`id_periodo_anual`,`id_campa�a`) values (1,'periodo campania','Periodo Campa�a Verano','2013-01-01 00:00:00','0000-00-00 00:00:00','1',1,1),(2,'periodo campania','Periodo Campa�a Verano','2011-01-01 00:00:00','2011-12-31 00:00:00','0',3,1);

/*Table structure for table `sca_periodo_anual` */

DROP TABLE IF EXISTS `sca_periodo_anual`;

CREATE TABLE `sca_periodo_anual` (
  `id_periodo_anual` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre_periodo_anual` varchar(100) NOT NULL,
  `fecha_inicio` varchar(10) NOT NULL,
  `fecha_fin` varchar(10) NOT NULL,
  `id_filial` bigint(10) NOT NULL,
  `estado` varchar(1) NOT NULL,
  PRIMARY KEY (`id_periodo_anual`),
  KEY `sca_filial_sca_periodo_anual_fk` (`id_filial`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `sca_periodo_anual` */

insert  into `sca_periodo_anual`(`id_periodo_anual`,`nombre_periodo_anual`,`fecha_inicio`,`fecha_fin`,`id_filial`,`estado`) values (1,'Periodo Anual 2013','2013-05-06','2013-05-31',1,'1'),(2,'Periodo Anual 2012','2014-01-01','2014-12-31',1,'0'),(3,'Periodo Anual 2011','2011-01-01','2011-12-31',1,'0');

/*Table structure for table `sca_actividad` */

DROP TABLE IF EXISTS `sca_actividad`;

CREATE TABLE `sca_actividad` (
  `id_actividad` bigint(60) NOT NULL AUTO_INCREMENT,
  `costo` double DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `tipo` varchar(60) DEFAULT NULL,
  `id_presupuesto` bigint(60) DEFAULT NULL,
  `id_usuario` bigint(60) DEFAULT NULL,
  `id_departamento` bigint(60) DEFAULT NULL,
  `id_facultad` bigint(60) DEFAULT NULL,
  `codigo` varchar(60) DEFAULT NULL,
  `mes` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_actividad`),
  KEY `sca_usuario_sca_actividad_fk` (`id_usuario`),
  KEY `sca_departamento_sca_actividad_fk` (`id_departamento`),
  KEY `sca_facultad_sca_actividad_fk` (`id_facultad`),
  KEY `sca_presupuesto_sca_actividad_fk` (`id_presupuesto`)
) ENGINE=MyISAM AUTO_INCREMENT=161 DEFAULT CHARSET=latin1;

/*Data for the table `sca_actividad` */

insert  into `sca_actividad`(`id_actividad`,`costo`,`estado`,`nombre`,`descripcion`,`fecha`,`tipo`,`id_presupuesto`,`id_usuario`,`id_departamento`,`id_facultad`,`codigo`,`mes`) values (159,50,'1','pasaje','pasaje','2013-07-11','pasaje',3,1,1,3,'2009','12'),(158,230,'1','GASTOS EN PASAJES','CATEGORIA PASAJES','2013-07-05','pasaje',1,1,1,1,'2013-1','9');


/*Table structure for table `sca_persona` */

DROP TABLE IF EXISTS `sca_persona`;

CREATE TABLE `sca_persona` (
  `id_persona` bigint(60) NOT NULL AUTO_INCREMENT,
  `ruc` varchar(11) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `sexo` varbinary(1) NOT NULL,
  `celular` varchar(10) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `nombres` varchar(60) NOT NULL,
  `apell_patern` varchar(60) NOT NULL,
  `apell_matern` varchar(60) NOT NULL,
  `dni` varchar(8) NOT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `sca_persona` */

insert  into `sca_persona`(`id_persona`,`ruc`,`direccion`,`sexo`,`celular`,`estado`,`nombres`,`apell_patern`,`apell_matern`,`dni`) values (1,'1046537040','juliaca','M','980123465','1','Jose','Limachi','Chavez','45653412');

/*Table structure for table `sca_producto` */

DROP TABLE IF EXISTS `sca_producto`;

CREATE TABLE `sca_producto` (
  `id_producto` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `stock` int(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_producto` */

/*Table structure for table `sca_rol` */

DROP TABLE IF EXISTS `sca_rol`;

CREATE TABLE `sca_rol` (
  `id_rol` bigint(60) NOT NULL AUTO_INCREMENT,
  `estado` varchar(1) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_rol` */

/*Table structure for table `sca_usuario` */

DROP TABLE IF EXISTS `sca_usuario`;

CREATE TABLE `sca_usuario` (
  `id_usuario` bigint(60) NOT NULL AUTO_INCREMENT,
  `username` varchar(60) NOT NULL,
  `cargo` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `id_persona` bigint(60) NOT NULL,
  `estado` varchar(1) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `sca_persona_sca_usuario_fk` (`id_persona`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `sca_usuario` */

insert  into `sca_usuario`(`id_usuario`,`username`,`cargo`,`password`,`id_persona`,`estado`) values (1,'admin','Gerente','LmAJembXM+g=',1,'1');

/*Table structure for table `sca_usuario_rol` */

DROP TABLE IF EXISTS `sca_usuario_rol`;

CREATE TABLE `sca_usuario_rol` (
  `id_usuario_rol` bigint(60) NOT NULL AUTO_INCREMENT,
  `id_rol` bigint(60) NOT NULL,
  `id_usuario` bigint(60) NOT NULL,
  PRIMARY KEY (`id_usuario_rol`),
  KEY `sca_rol_sca_usuario_rol_fk` (`id_rol`),
  KEY `sca_usuario_sca_usuario_rol_fk` (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_usuario_rol` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

