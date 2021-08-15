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

/*Table structure for table `sca_almacen` */

DROP TABLE IF EXISTS `sca_almacen`;

CREATE TABLE `sca_almacen` (
  `id_almacen` bigint(60) NOT NULL AUTO_INCREMENT,
  `id_periodo` bigint(60) NOT NULL,
  `cantidad_total` int(60) NOT NULL,
  PRIMARY KEY (`id_almacen`),
  KEY `sca_periodo_sca_almacen_fk` (`id_periodo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_almacen` */

/*Table structure for table `sca_campaña` */

DROP TABLE IF EXISTS `sca_campaña`;

CREATE TABLE `sca_campaña` (
  `id_campaña` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_campaña`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `sca_campaña` */

insert  into `sca_campaña`(`id_campaña`,`nombre`,`descripcion`) values (1,'Campaña Verano','Campaña'),(2,'Campaña Invierno','Campaña'),(6,'Campaña Otoño','Campaña');

/*Table structure for table `sca_comprobante` */

DROP TABLE IF EXISTS `sca_comprobante`;

CREATE TABLE `sca_comprobante` (
  `id_comprobante` bigint(60) NOT NULL AUTO_INCREMENT,
  `total` double NOT NULL,
  `id_tipo_comprobante` bigint(60) NOT NULL,
  `serie` varchar(100) NOT NULL,
  `numero` varchar(60) NOT NULL,
  `id_persona` bigint(60) NOT NULL,
  `subtotal` double NOT NULL,
  `igv` double NOT NULL,
  `fecha` datetime NOT NULL,
  `estado` varchar(1) NOT NULL,
  `id_detalle_actividad` bigint(60) NOT NULL,
  PRIMARY KEY (`id_comprobante`),
  KEY `tipo_comprobante_comprobante_fk` (`id_tipo_comprobante`),
  KEY `sca_persona_comprobante_fk` (`id_persona`),
  KEY `detalle_actividad_comprobante_fk` (`id_detalle_actividad`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_comprobante` */

/*Table structure for table `sca_departamento` */

DROP TABLE IF EXISTS `sca_departamento`;

CREATE TABLE `sca_departamento` (
  `id_departamento` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `id_filial` bigint(10) NOT NULL,
  PRIMARY KEY (`id_departamento`),
  KEY `sca_filial_sca_departamento_fk` (`id_filial`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `sca_departamento` */

insert  into `sca_departamento`(`id_departamento`,`nombre`,`descripcion`,`estado`,`id_filial`) values (1,'admision','admision','1',1);

/*Table structure for table `sca_detalle_actividad` */

DROP TABLE IF EXISTS `sca_detalle_actividad`;

CREATE TABLE `sca_detalle_actividad` (
  `id_detalle_actividad` bigint(60) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL,
  `id_actividad` bigint(60) NOT NULL,
  `dia` varchar(10) NOT NULL,
  `importe` double NOT NULL,
  PRIMARY KEY (`id_detalle_actividad`),
  KEY `sca_actividad_detalle_actividad_fk` (`id_actividad`)
) ENGINE=MyISAM AUTO_INCREMENT=64 DEFAULT CHARSET=latin1;

/*Data for the table `sca_detalle_actividad` */

insert  into `sca_detalle_actividad`(`id_detalle_actividad`,`descripcion`,`id_actividad`,`dia`,`importe`) values (63,'pasaje de juli',159,'2013-07-16',30),(62,'paasje de pedro',159,'2013-07-01',20),(61,'PASAJE A TACNA ORIENTACION VOCACIONAL COLEGIO 28 DE JULIO',158,'2013-07-04',100),(59,'PASAJE VIAJE A PUERTO MALDONADO',158,'2013-07-03',100),(60,'PASAJES VARIOS PARA ORIENTACION VOCACIONAL COLEGIO CATA',158,'2013-07-04',30);

/*Table structure for table `sca_detalle_almacen` */

DROP TABLE IF EXISTS `sca_detalle_almacen`;

CREATE TABLE `sca_detalle_almacen` (
  `id_detalle_almacen` bigint(60) NOT NULL,
  `id_producto` bigint(60) NOT NULL,
  `cantidad_entrada` int(60) NOT NULL,
  `cantidad_salida` int(60) NOT NULL,
  `id_almacen` bigint(60) NOT NULL,
  `id_detalle_actividad` bigint(60) NOT NULL,
  PRIMARY KEY (`id_almacen`),
  KEY `sca_producto_sca_almacen_fk` (`id_producto`),
  KEY `detalle_actividad_sca_detalle_almacen_fk` (`id_detalle_actividad`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_detalle_almacen` */

/*Table structure for table `sca_detalle_comprobante` */

DROP TABLE IF EXISTS `sca_detalle_comprobante`;

CREATE TABLE `sca_detalle_comprobante` (
  `id_detalle_comprobante` bigint(60) NOT NULL AUTO_INCREMENT,
  `id_comprobante` bigint(60) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `precio_unit` double NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_detalle_comprobante`),
  KEY `comprobante_detalle_comprobante_fk` (`id_comprobante`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_detalle_comprobante` */

/*Table structure for table `sca_facultad` */

DROP TABLE IF EXISTS `sca_facultad`;

CREATE TABLE `sca_facultad` (
  `id_facultad` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `id_filial` bigint(10) NOT NULL,
  PRIMARY KEY (`id_facultad`),
  KEY `sca_filial_sca_facultad_fk` (`id_filial`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `sca_facultad` */

insert  into `sca_facultad`(`id_facultad`,`nombre`,`descripcion`,`estado`,`id_filial`) values (1,'Faculta de Ingenieria','Facultad','1',1),(2,'Facultad de Ciencias Empresariales','Facultad','1',1),(3,'Facultad de Ciencias de la Salud','Facultad','1',1),(4,'Facultad de Educacion','Facultad','1',1);

/*Table structure for table `sca_filial` */

DROP TABLE IF EXISTS `sca_filial`;

CREATE TABLE `sca_filial` (
  `id_filial` bigint(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `email` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `id_institucion` bigint(10) NOT NULL,
  PRIMARY KEY (`id_filial`),
  KEY `sca_institucion_sca_filial_fk` (`id_institucion`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `sca_filial` */

insert  into `sca_filial`(`id_filial`,`nombre`,`estado`,`direccion`,`telefono`,`email`,`descripcion`,`id_institucion`) values (1,'Filial Juliaca','1','Chullunquiani km 6 Arequipa','345465','admisionjuliaca@upeu.pe','Filial',1);

/*Table structure for table `sca_institucion` */

DROP TABLE IF EXISTS `sca_institucion`;

CREATE TABLE `sca_institucion` (
  `id_institucion` bigint(10) NOT NULL AUTO_INCREMENT,
  `razon_social` varchar(60) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `ruc` varchar(60) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `telefono` varchar(60) NOT NULL,
  `fax` varchar(10) NOT NULL,
  `email` varchar(60) NOT NULL,
  `pagina` varchar(60) NOT NULL,
  PRIMARY KEY (`id_institucion`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `sca_institucion` */

insert  into `sca_institucion`(`id_institucion`,`razon_social`,`estado`,`ruc`,`direccion`,`descripcion`,`telefono`,`fax`,`email`,`pagina`) values (1,'Universidad Peruana Union','1','20234354561','Chullunquiani km 6 Arequipa','Sede','345465','345456','admision@upeu.pe','http://www.upeu.edu.pe');

/*Table structure for table `sca_periodo` */

DROP TABLE IF EXISTS `sca_periodo`;

CREATE TABLE `sca_periodo` (
  `id_periodo` bigint(60) NOT NULL AUTO_INCREMENT,
  `tipo_periodo` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `fecha_inicio` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL,
  `estado` varchar(1) NOT NULL,
  `id_periodo_anual` bigint(60) NOT NULL,
  `id_campaña` bigint(60) NOT NULL,
  PRIMARY KEY (`id_periodo`),
  KEY `sca_campaña_sca_periodo_fk` (`id_campaña`),
  KEY `sca_periodo_anual_sca_periodo_fk` (`id_periodo_anual`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `sca_periodo` */

insert  into `sca_periodo`(`id_periodo`,`tipo_periodo`,`nombre`,`fecha_inicio`,`fecha_fin`,`estado`,`id_periodo_anual`,`id_campaña`) values (1,'periodo campania','Periodo Campaña Verano','2013-01-01 00:00:00','0000-00-00 00:00:00','1',1,1),(2,'periodo campania','Periodo Campaña Verano','2011-01-01 00:00:00','2011-12-31 00:00:00','0',3,1);

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

/*Table structure for table `sca_presupuesto` */

DROP TABLE IF EXISTS `sca_presupuesto`;

CREATE TABLE `sca_presupuesto` (
  `id_presupuesto` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `saldo_final` double NOT NULL,
  `saldo_inicial` double NOT NULL,
  `tipo_moneda` varchar(10) NOT NULL,
  `estado` varchar(1) NOT NULL,
  `fecha_inicio` datetime NOT NULL,
  `fecha_fin` datetime NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `id_periodo` bigint(60) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `id_sede` bigint(60) NOT NULL,
  `id_presupuesto_anual` bigint(60) NOT NULL,
  PRIMARY KEY (`id_presupuesto`),
  KEY `sca_presupuesto_anual_sca_presupuesto_fk` (`id_presupuesto_anual`),
  KEY `sca_periodo_sca_presupuesto_fk` (`id_periodo`),
  KEY `sca_sede_sca_presupuesto_fk` (`id_sede`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `sca_presupuesto` */

insert  into `sca_presupuesto`(`id_presupuesto`,`nombre`,`saldo_final`,`saldo_inicial`,`tipo_moneda`,`estado`,`fecha_inicio`,`fecha_fin`,`tipo`,`id_periodo`,`descripcion`,`id_sede`,`id_presupuesto_anual`) values (1,'presupuesto para tacna',0,2000,'soles','1','2013-12-12 00:00:00','2013-12-12 00:00:00','prespuesto',1,'presupuesto',1,1),(2,'presupuesto para puerto maldonado',0,3000,'soles','1','2013-12-12 00:00:00','2013-12-12 00:00:00','presupuest',1,'presupuesto',3,1),(3,'presupuesto para juliaca',0,5000,'soles','1','2013-12-12 00:00:00','2013-12-12 00:00:00','presupuest',1,'presupuesto',2,1),(4,'presupuesto para ilo',0,2000,'soles','1','2013-12-12 00:00:00','2013-12-12 00:00:00','presupuest',1,'presupuesto',4,1);

/*Table structure for table `sca_presupuesto_anual` */

DROP TABLE IF EXISTS `sca_presupuesto_anual`;

CREATE TABLE `sca_presupuesto_anual` (
  `id_presupuesto_anual` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `monto` double NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `id_periodo_anual` bigint(60) NOT NULL,
  `estado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id_presupuesto_anual`),
  KEY `sca_periodo_anual_sca_presupuesto_anual_fk` (`id_periodo_anual`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `sca_presupuesto_anual` */

insert  into `sca_presupuesto_anual`(`id_presupuesto_anual`,`nombre`,`monto`,`descripcion`,`id_periodo_anual`,`estado`) values (1,'Presupuesto Anual Juliaca 2013',30000,'Presupusto anual',1,'1'),(2,'Presupuesto Anual Juliaca 2012',4000,'Presupuesto anual',2,'0'),(3,'Presupuesto Anual Juliaca 2011',30000,'Presupuesto Anual',3,'0');

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

/*Table structure for table `sca_sede` */

DROP TABLE IF EXISTS `sca_sede`;

CREATE TABLE `sca_sede` (
  `id_sede` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `tipo_sede` varchar(60) NOT NULL,
  `id_filial` bigint(10) NOT NULL,
  PRIMARY KEY (`id_sede`),
  KEY `sca_filial_sca_sede_fk` (`id_filial`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `sca_sede` */

insert  into `sca_sede`(`id_sede`,`nombre`,`descripcion`,`direccion`,`tipo_sede`,`id_filial`) values (1,'Sede Tacna','Sede','Calle Miller 184','Secundaria',1),(2,'Sede Juliaca','Sede','Chullunquiani km 6 Arequipa','Principal',1),(3,'Sede Puerto Maldonado','Sede','Madre de Dios','Secundaria',1),(4,'Sede Ilo','Sede','Ilo','Secundaria',1);

/*Table structure for table `sca_tipo_comprobante` */

DROP TABLE IF EXISTS `sca_tipo_comprobante`;

CREATE TABLE `sca_tipo_comprobante` (
  `id_tipo_comprobante` bigint(60) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  PRIMARY KEY (`id_tipo_comprobante`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `sca_tipo_comprobante` */

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
