/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 10.4.24-MariaDB : Database - db_percetakan_xpelita
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_percetakan_xpelita` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db_percetakan_xpelita`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id_customer` varchar(12) NOT NULL,
  `nama_customer` varchar(255) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `customer` */

insert  into `customer`(`id_customer`,`nama_customer`,`no_telp`,`jenis_kelamin`,`email`,`alamat`) values 
('','','',NULL,'',''),
('2123202200','Andi Suciptoa','0878-1234-0989','Laki-laki','andisucipto20@blackmail.com','Jl. Antapani no.228 Bandung'),
('2123202201','Daniel Siregar','0872-1231-0983','Laki-laki','daniel2410@hotmail.com','Jl. Cibogo no.348 Bandung'),
('2123202202','Putut Widianto','0812-1344-0489','Laki-laki','pututwid88@blackmail.com','Jl. Dalam Kaum no.44 Bandung'),
('2123202203','Kadek Wardana','0855-1234-0989','Laki-laki','wardanakadek234@hotmail.com','Jl. Soekarno-Hatta no.423 Bandung'),
('2123202204','Alfon Wijaya','0853-1134-0934','Laki-laki','alfonwid88@newmail.com','Jl. Sumatra no.244 Bandung'),
('2123202205','Juan Pamungkas','0878-5633-2341','Laki-laki','juannnn23@sunmail.com','Jl. Antapani no.111 Bandung'),
('2123202206','Geraldo Setyawan','0878-0000-9997','Laki-laki','geraldoset555@blackmail.com','Jl. Cibogo no.228 Bandung'),
('2123202207','Nina Nuranti','0811-2341-3425','Perempuan','nuranti2324@blackmail.com','Jl. Merdeka no.643 Bandung'),
('2123202208','Felly Hermianti','0878-5423-5674','Perempuan','fellyhermianti@newmail.com','Jl. Antapani no.425 Bandung'),
('2123202209','Nelly Fatmawati','0853-5324-1553','Perempuan','nelly909@hotmail.com','Jl. Buah Batu no.252 Bandung'),
('2123202210','Andi Handono','0878-2536-6543','Laki-laki','handonoandi23@blackmail.com','Jl. Lengkong Kecil no.44 Bandung'),
('2123202211','Julian Draxler','0878-2352-4562','Laki-laki','julain.ali.draxler@hotmail.com','Jl. Naripan no.234 Bandung'),
('2123202212','Felipe Coutinho','0898-2452-1333','Laki-laki','coutinhoooo232@blackmail.com','Jl. BKR no.54 Bandung'),
('2123202213','Jennifer Wijayanto','0878-3455-8887','Perempuan','jennwij99@blackmail.com','Jl. Burangrang no.77 Bandung'),
('2123202214','Caroline Jeane','0851-2252-1112','Perempuan','carolinejeane@blackmail.com','Jl. Otto Iskandardinata no.256 Bandung'),
('2123202215','Felipe Corado','0873-1366-2577','Laki-laki','felipeee.c00@sunmail.com','Jl. Astana Anyar no.773 Bandung'),
('2123202216','Jason Marcel','0828-1414-4443','Laki-laki','jas000nmar21@blackmail.com','Jl. Kalipah Apo no.12 Bandung'),
('2123202217','Angel Brooklyn','0878-2521-2223','Perempuan','angelll.br78@newmail.com','Jl. Mekar Setia no.432 Bandung'),
('2123202218','Via Jessica','0878-4444-1234','Perempuan','jess.via90@hotmail.com','Jl. Rancamanyar no.141 Kab. Bandung'),
('2123202219','John Sucipto','0872-1241-3453','Laki-laki','johnsucipto20@sunmail.com','Jl. Kopo no.44 Bandung'),
('2123202220','Joana Maria','0875-1241-3453','Perempuan','joanagabrielamaria@hotmail.com','Jl. Taman Sari no.134 Bandung'),
('2123202221','Dani Eka','0878-5742-4363','Laki-laki','adweka@gmail.com','JL. Suamatra no.77 Bandung'),
('2123202222','Saih Jamal','0869-3546-2426','Laki-laki','jamaljj@blackmail.com','Jl. Rancaekek no.99 Kab.Bandung');

/*Table structure for table `detail_pemesanan` */

DROP TABLE IF EXISTS `detail_pemesanan`;

CREATE TABLE `detail_pemesanan` (
  `id_produk_pesanan` varchar(12) NOT NULL,
  `id_pemesanan` varchar(12) DEFAULT NULL,
  `jumlah_pemesanan_produk` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_produk_pesanan`),
  KEY `id_pemesanan` (`id_pemesanan`),
  CONSTRAINT `detail_pemesanan_ibfk_1` FOREIGN KEY (`id_pemesanan`) REFERENCES `pemesanan` (`id_pemesanan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `detail_pemesanan` */

insert  into `detail_pemesanan`(`id_produk_pesanan`,`id_pemesanan`,`jumlah_pemesanan_produk`) values 
('2043','202201',200),
('2044','202202',450),
('2045','202203',120),
('2046','202204',230),
('2047','202205',1000),
('2048','202206',190),
('2049','202207',400),
('2050','202208',260),
('2051','202209',440),
('2052','202210',50),
('2053','202211',120),
('2054','202212',220),
('2055','202213',600),
('2056','202214',30),
('2057','202215',330),
('2058','202216',340),
('2059','202217',500),
('2060','202218',100),
('2061','202219',220),
('2062','202220',221),
('2063','202221',100),
('2064','202222',332),
('2065','202223',210),
('2066','202224',475),
('2067','202225',451),
('2068','202226',232),
('2069','202227',222);

/*Table structure for table `pegawai` */

DROP TABLE IF EXISTS `pegawai`;

CREATE TABLE `pegawai` (
  `id_pegawai` varchar(12) NOT NULL,
  `role_id` varchar(12) DEFAULT NULL,
  `nama_pegawai` varchar(255) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `tempat_lahir` varchar(20) DEFAULT NULL,
  `telp_pegawai` varchar(20) DEFAULT NULL,
  `alamat_pegawai` varchar(255) DEFAULT NULL,
  `tanggal_masuk` date DEFAULT NULL,
  `status_pegawai` varchar(20) DEFAULT NULL,
  `agama` varchar(20) DEFAULT NULL,
  `data_jenis_kelamin` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_pegawai`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `pegawai` */

insert  into `pegawai`(`id_pegawai`,`role_id`,`nama_pegawai`,`tgl_lahir`,`tempat_lahir`,`telp_pegawai`,`alamat_pegawai`,`tanggal_masuk`,`status_pegawai`,`agama`,`data_jenis_kelamin`) values 
('1123202200','1000','Hendry Hujana','1995-07-04','Jakarta','0812-2984-2984','Jl.Husen Sastra No.33 Bandung','2015-07-08','Aktif','Kristen Protestan','Laki-Laki'),
('1123202201','1000','Muhammad Hremansah','1997-10-24','Bandung','0812-1332-2566','Jl.Astana Anyar No.313 Bandung','2014-04-02','Aktif','Islam','Laki-Laki'),
('1123202202','4000','Julie Natalie','1992-11-12','Cikarang','0832-2342-6633','Jl.Burangrang No.122 Bandung','2009-04-06','Aktif','Katholik','Perempuan'),
('1123202203','1001','Swnadi Juan','1994-12-24','Bogor','0898-2323-111','Jl.BKR No.32 Bandung','2017-07-03','Aktif','Islam','Laki-Laki'),
('1123202204','1002','Muhammad Raplhy','2000-10-24','Bandung','0892-1231-4343','Jl.Surya Sumantri No.313 Bandung','2019-03-22','Aktif','Islam','Laki-Laki'),
('1123202205','1003','Irwan Barsukoi','1996-12-25','Bandung','0812-2222-1313','Jl.Astana Anyar No.78 Bandung','2013-04-01','Aktif','Buddha','Laki-Laki'),
('1123202206','2000','Agung Jastin','2000-10-24','Semarang','0814-1222-2126','Jl.Sumatra No.344 Bandung','2020-02-01','Aktif','Kristen Protestan','Laki-Laki'),
('1123202207','3000','Juan Agustinus','1989-09-14','Surabaya','0812-1366-2222','Jl.Kalipah Apo No.213 Bandung','2015-04-02','Aktif','Katholik','Laki-Laki'),
('1123202208','1000','Muhammad Iriawan','1997-02-23','Bandung','0834-3332-2566','Jl.Lengkong No.222 Bandung','2016-02-17','Aktif','Islam','Laki-Laki'),
('1123202210','1000','Andi Setyawan','1993-12-21','Bandung','0812-2333-4444','Jl.Batu Nunggal No.122 Bandung','2013-04-11','Aktif','Islam','Perempuan'),
('1123202211','900','Nia Narem','1997-11-12','Jakarta','0812-1231-5552','Jl.BKR No.332 Bandung','2015-07-08','Aktif','Islam','Laki-Laki'),
('1123202212','900','Aristo Anjani','1996-12-23','Bandung','0812-1324-1221','Jl.Buah Batu No.33 Bandung','2015-07-08','Aktif','Islam','Laki-Laki'),
('1123202213','900','Jeki Pratama','1998-07-12','Riau','0854-5321-1456','Jl.Riau No.12 Bandung','2015-07-08','Aktif','Islam','Laki-Laki'),
('1123202214','900','Rian Putra','1996-09-22','Banten','0878-5214-6544','Jl.Ciroyom No.31 Bandung','2015-07-08','Aktif','Islam','Laki-Laki'),
('1123202215','900','Andik Hujana','1995-01-30','Depok','0811-6352-2534','Jl.Saritem No.52 Bandung','2015-07-08','Aktif','Islam','Laki-Laki'),
('1123202216','900','Kadek Pramudita','1995-02-11','Bali','0832-1552-7546','Jl.Husen Sastra No.99 Bandung','2015-07-08','Aktif','Hindu','Laki-Laki'),
('1123202220','1000','Deni Agustinus','1978-10-18','Jakarta','0788-4576-5365','Jl/ Mangga No.25 Bandung','2022-10-21','Aktif','Islam','Laki-laki');

/*Table structure for table `pemesanan` */

DROP TABLE IF EXISTS `pemesanan`;

CREATE TABLE `pemesanan` (
  `id_pemesanan` varchar(12) NOT NULL,
  `tanggal_pemesanan` date DEFAULT NULL,
  `status_pemesanan` varchar(10) DEFAULT NULL,
  `id_customer` varchar(12) DEFAULT NULL,
  `id_pegawai` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_pemesanan`),
  KEY `id_pegawai` (`id_pegawai`),
  KEY `id_customer` (`id_customer`),
  CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`),
  CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `pemesanan` */

insert  into `pemesanan`(`id_pemesanan`,`tanggal_pemesanan`,`status_pemesanan`,`id_customer`,`id_pegawai`) values 
('202201','2022-10-14','Selesai','2123202200','1123202212'),
('202202','2022-10-14','Selesai','2123202201','1123202211'),
('202203','2022-10-15','Selesai','2123202202','1123202211'),
('202204','2022-10-16','Selesai','2123202203','1123202212'),
('202205','2022-10-16','Selesai','2123202204','1123202213'),
('202206','2022-10-16','Selesai','2123202205','1123202214'),
('202207','2022-10-17','Selesai','2123202206','1123202212'),
('202208','2022-10-17','Selesai','2123202207','1123202215'),
('202209','2022-10-17','Selesai','2123202208','1123202216'),
('202210','2022-10-18','Selesai','2123202209','1123202216'),
('202211','2022-10-19','Selesai','2123202210','1123202211'),
('202212','2022-10-19','Selesai','2123202211','1123202213'),
('202213','2022-10-19','Selesai','2123202212','1123202214'),
('202214','2022-10-20','On_Progres','2123202213','1123202212'),
('202215','2022-10-20','On_Progres','2123202214','1123202215'),
('202216','2022-10-20','On_Progres','2123202215','1123202216'),
('202217','2022-10-20','On_Progres','2123202216','1123202212'),
('202218','2022-10-20','On_Progres','2123202217','1123202211'),
('202219','2022-10-21','On_Progres','2123202218','1123202214'),
('202220','2022-10-22','On_Progres','2123202219','1123202213'),
('202221','2022-10-22','On_Progres','2123202220','1123202211'),
('202222','2022-10-22','On_Progres','2123202210','1123202212'),
('202223','2022-10-23','On_Progres','2123202203','1123202215'),
('202224','2022-10-23','On_Progres','2123202201','1123202215'),
('202225','2022-10-24','On_Progres','2123202206','1123202216'),
('202226','2022-10-24','On_Progres','2123202203','1123202216'),
('202227','2022-10-24','On_Progres','2123202201','1123202212');

/*Table structure for table `produksi` */

DROP TABLE IF EXISTS `produksi`;

CREATE TABLE `produksi` (
  `id_produksi` varchar(12) NOT NULL,
  `id_produk_pesanan` varchar(12) DEFAULT NULL,
  `tanggal_produksi` date DEFAULT NULL,
  PRIMARY KEY (`id_produksi`),
  KEY `id_produk_pesanan` (`id_produk_pesanan`),
  CONSTRAINT `produksi_ibfk_1` FOREIGN KEY (`id_produk_pesanan`) REFERENCES `detail_pemesanan` (`id_produk_pesanan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `produksi` */

insert  into `produksi`(`id_produksi`,`id_produk_pesanan`,`tanggal_produksi`) values 
('11110','2043','2022-10-15'),
('11111','2044','2022-10-15'),
('11112','2045','2022-10-15'),
('11113','2046','2022-10-17'),
('11114','2047','2022-10-17'),
('11115','2048','2022-10-17'),
('11116','2049','2022-10-17'),
('11117','2050','2022-10-17'),
('11118','2051','2022-10-18'),
('11119','2052','2022-10-18'),
('11120','2053','2022-10-19'),
('11121','2054','2022-10-19'),
('11122','2055','2022-10-19'),
('11123','2056','2022-10-22'),
('11124','2057','2022-10-22'),
('11125','2058','2022-10-22'),
('11126','2059','2022-10-22'),
('11127','2060','2022-10-23'),
('11128','2061','2022-10-23'),
('11129','2062','2022-10-23'),
('11130','2063','2022-10-23'),
('11131','2064','2022-10-24'),
('11132','2065','2022-10-24'),
('11133','2066','2022-10-24'),
('11134','2067','2022-10-25'),
('11135','2068','2022-10-25'),
('11136','2069','2022-10-25');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` varchar(12) NOT NULL,
  `role_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `role` */

insert  into `role`(`role_id`,`role_desc`) values 
('1000','Productions'),
('1001','Warehouse'),
('1002','Logistics'),
('1003','Procurement'),
('2000','Accounting'),
('3000','Mechanics'),
('4000','Supervisor'),
('900','Pelayan');

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(12) NOT NULL,
  `id_customer` varchar(12) NOT NULL,
  `total_harga` int(10) DEFAULT NULL,
  `tanggal_transaksi` date DEFAULT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_customer` (`id_customer`),
  CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `transaksi` */

insert  into `transaksi`(`id_transaksi`,`id_customer`,`total_harga`,`tanggal_transaksi`) values 
('00001','2123202200',900000,'2022-10-14'),
('00002','2123202201',1900000,'2022-10-14'),
('00003','2123202202',500000,'2022-10-15'),
('00004','2123202203',1210000,'2022-10-16'),
('00005','2123202204',7000000,'2022-10-16'),
('00006','2123202205',840000,'2022-10-16'),
('00007','2123202206',3200000,'2022-10-17'),
('00008','2123202207',2300000,'2022-10-17'),
('00009','2123202208',4050000,'2022-10-17'),
('00010','2123202209',240000,'2022-10-18'),
('00011','2123202210',1320000,'2022-10-19'),
('00012','2123202211',3000000,'2022-10-19'),
('00013','2123202212',5740000,'2022-10-19'),
('00014','2123202213',150000,'2022-10-20'),
('00015','2123202214',1200000,'2022-10-20'),
('00016','2123202215',2390000,'2022-10-20'),
('00017','2123202216',2465000,'2022-10-20'),
('00018','2123202217',4440000,'2022-10-20'),
('00019','2123202218',459000,'2022-10-21'),
('00020','2123202219',2200000,'2022-10-22'),
('00021','2123202220',870000,'2022-10-22'),
('00022','2123202210',3005000,'2022-10-22'),
('00023','2123202203',2009000,'2022-10-23'),
('00024','2123202201',4536000,'2022-10-23'),
('00025','2123202206',4441000,'2022-10-24'),
('00026','2123202203',2201000,'2022-10-24'),
('00027','2123202201',2000002,'2022-10-24');

/* Procedure structure for procedure `getAllCustomer` */

/*!50003 DROP PROCEDURE IF EXISTS  `getAllCustomer` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllCustomer`()
BEGIN
    SELECT * FROM Customer;
END */$$
DELIMITER ;

/* Procedure structure for procedure `getAllPegawai` */

/*!50003 DROP PROCEDURE IF EXISTS  `getAllPegawai` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllPegawai`()
BEGIN
    SELECT * FROM Pegawai;
END */$$
DELIMITER ;

/* Procedure structure for procedure `getProductionRole` */

/*!50003 DROP PROCEDURE IF EXISTS  `getProductionRole` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getProductionRole`()
BEGIN
    SELECT * FROM Pegawai
    WHERE role_id = 1000;
END */$$
DELIMITER ;

/* Procedure structure for procedure `getStatusDone` */

/*!50003 DROP PROCEDURE IF EXISTS  `getStatusDone` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getStatusDone`()
BEGIN
    SELECT * FROM Pemesanan
    WHERE status_pemesanan = 'selesai';
END */$$
DELIMITER ;

/*Table structure for table `agama_pegawai1` */

DROP TABLE IF EXISTS `agama_pegawai1`;

/*!50001 DROP VIEW IF EXISTS `agama_pegawai1` */;
/*!50001 DROP TABLE IF EXISTS `agama_pegawai1` */;

/*!50001 CREATE TABLE  `agama_pegawai1`(
 `id_pegawai` varchar(12) ,
 `role_id` varchar(12) ,
 `nama_pegawai` varchar(255) ,
 `tgl_lahir` date ,
 `tempat_lahir` varchar(20) ,
 `telp_pegawai` varchar(20) ,
 `alamat_pegawai` varchar(255) ,
 `tanggal_masuk` date ,
 `status_pegawai` varchar(20) ,
 `agama` varchar(20) ,
 `data_jenis_kelamin` varchar(20) 
)*/;

/*Table structure for table `agama_pegawai2` */

DROP TABLE IF EXISTS `agama_pegawai2`;

/*!50001 DROP VIEW IF EXISTS `agama_pegawai2` */;
/*!50001 DROP TABLE IF EXISTS `agama_pegawai2` */;

/*!50001 CREATE TABLE  `agama_pegawai2`(
 `id_pegawai` varchar(12) ,
 `role_id` varchar(12) ,
 `nama_pegawai` varchar(255) ,
 `tgl_lahir` date ,
 `tempat_lahir` varchar(20) ,
 `telp_pegawai` varchar(20) ,
 `alamat_pegawai` varchar(255) ,
 `tanggal_masuk` date ,
 `status_pegawai` varchar(20) ,
 `agama` varchar(20) ,
 `data_jenis_kelamin` varchar(20) 
)*/;

/*Table structure for table `nama_depan_cust` */

DROP TABLE IF EXISTS `nama_depan_cust`;

/*!50001 DROP VIEW IF EXISTS `nama_depan_cust` */;
/*!50001 DROP TABLE IF EXISTS `nama_depan_cust` */;

/*!50001 CREATE TABLE  `nama_depan_cust`(
 `id_customer` varchar(12) ,
 `nama_customer` varchar(255) ,
 `no_telp` varchar(20) ,
 `jenis_kelamin` varchar(20) ,
 `email` varchar(30) ,
 `alamat` varchar(255) 
)*/;

/*Table structure for table `nama_depan_pegawai` */

DROP TABLE IF EXISTS `nama_depan_pegawai`;

/*!50001 DROP VIEW IF EXISTS `nama_depan_pegawai` */;
/*!50001 DROP TABLE IF EXISTS `nama_depan_pegawai` */;

/*!50001 CREATE TABLE  `nama_depan_pegawai`(
 `id_pegawai` varchar(12) ,
 `role_id` varchar(12) ,
 `nama_pegawai` varchar(255) ,
 `tgl_lahir` date ,
 `tempat_lahir` varchar(20) ,
 `telp_pegawai` varchar(20) ,
 `alamat_pegawai` varchar(255) ,
 `tanggal_masuk` date ,
 `status_pegawai` varchar(20) ,
 `agama` varchar(20) ,
 `data_jenis_kelamin` varchar(20) 
)*/;

/*Table structure for table `no_hp_cust` */

DROP TABLE IF EXISTS `no_hp_cust`;

/*!50001 DROP VIEW IF EXISTS `no_hp_cust` */;
/*!50001 DROP TABLE IF EXISTS `no_hp_cust` */;

/*!50001 CREATE TABLE  `no_hp_cust`(
 `id_customer` varchar(12) ,
 `nama_customer` varchar(255) ,
 `no_telp` varchar(20) ,
 `jenis_kelamin` varchar(20) ,
 `email` varchar(30) ,
 `alamat` varchar(255) 
)*/;

/*Table structure for table `role_pegawai` */

DROP TABLE IF EXISTS `role_pegawai`;

/*!50001 DROP VIEW IF EXISTS `role_pegawai` */;
/*!50001 DROP TABLE IF EXISTS `role_pegawai` */;

/*!50001 CREATE TABLE  `role_pegawai`(
 `id_pegawai` varchar(12) ,
 `role_id` varchar(12) ,
 `nama_pegawai` varchar(255) ,
 `tgl_lahir` date ,
 `tempat_lahir` varchar(20) ,
 `telp_pegawai` varchar(20) ,
 `alamat_pegawai` varchar(255) ,
 `tanggal_masuk` date ,
 `status_pegawai` varchar(20) ,
 `agama` varchar(20) ,
 `data_jenis_kelamin` varchar(20) 
)*/;

/*View structure for view agama_pegawai1 */

/*!50001 DROP TABLE IF EXISTS `agama_pegawai1` */;
/*!50001 DROP VIEW IF EXISTS `agama_pegawai1` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `agama_pegawai1` AS select `pegawai`.`id_pegawai` AS `id_pegawai`,`pegawai`.`role_id` AS `role_id`,`pegawai`.`nama_pegawai` AS `nama_pegawai`,`pegawai`.`tgl_lahir` AS `tgl_lahir`,`pegawai`.`tempat_lahir` AS `tempat_lahir`,`pegawai`.`telp_pegawai` AS `telp_pegawai`,`pegawai`.`alamat_pegawai` AS `alamat_pegawai`,`pegawai`.`tanggal_masuk` AS `tanggal_masuk`,`pegawai`.`status_pegawai` AS `status_pegawai`,`pegawai`.`agama` AS `agama`,`pegawai`.`data_jenis_kelamin` AS `data_jenis_kelamin` from `pegawai` where `pegawai`.`agama` = 'Islam' */;

/*View structure for view agama_pegawai2 */

/*!50001 DROP TABLE IF EXISTS `agama_pegawai2` */;
/*!50001 DROP VIEW IF EXISTS `agama_pegawai2` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `agama_pegawai2` AS select `pegawai`.`id_pegawai` AS `id_pegawai`,`pegawai`.`role_id` AS `role_id`,`pegawai`.`nama_pegawai` AS `nama_pegawai`,`pegawai`.`tgl_lahir` AS `tgl_lahir`,`pegawai`.`tempat_lahir` AS `tempat_lahir`,`pegawai`.`telp_pegawai` AS `telp_pegawai`,`pegawai`.`alamat_pegawai` AS `alamat_pegawai`,`pegawai`.`tanggal_masuk` AS `tanggal_masuk`,`pegawai`.`status_pegawai` AS `status_pegawai`,`pegawai`.`agama` AS `agama`,`pegawai`.`data_jenis_kelamin` AS `data_jenis_kelamin` from `pegawai` where `pegawai`.`agama` = 'Kristen' */;

/*View structure for view nama_depan_cust */

/*!50001 DROP TABLE IF EXISTS `nama_depan_cust` */;
/*!50001 DROP VIEW IF EXISTS `nama_depan_cust` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `nama_depan_cust` AS select `customer`.`id_customer` AS `id_customer`,`customer`.`nama_customer` AS `nama_customer`,`customer`.`no_telp` AS `no_telp`,`customer`.`jenis_kelamin` AS `jenis_kelamin`,`customer`.`email` AS `email`,`customer`.`alamat` AS `alamat` from `customer` where `customer`.`nama_customer` like 'a%' */;

/*View structure for view nama_depan_pegawai */

/*!50001 DROP TABLE IF EXISTS `nama_depan_pegawai` */;
/*!50001 DROP VIEW IF EXISTS `nama_depan_pegawai` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `nama_depan_pegawai` AS select `pegawai`.`id_pegawai` AS `id_pegawai`,`pegawai`.`role_id` AS `role_id`,`pegawai`.`nama_pegawai` AS `nama_pegawai`,`pegawai`.`tgl_lahir` AS `tgl_lahir`,`pegawai`.`tempat_lahir` AS `tempat_lahir`,`pegawai`.`telp_pegawai` AS `telp_pegawai`,`pegawai`.`alamat_pegawai` AS `alamat_pegawai`,`pegawai`.`tanggal_masuk` AS `tanggal_masuk`,`pegawai`.`status_pegawai` AS `status_pegawai`,`pegawai`.`agama` AS `agama`,`pegawai`.`data_jenis_kelamin` AS `data_jenis_kelamin` from `pegawai` where `pegawai`.`nama_pegawai` like 'muhhamad%' */;

/*View structure for view no_hp_cust */

/*!50001 DROP TABLE IF EXISTS `no_hp_cust` */;
/*!50001 DROP VIEW IF EXISTS `no_hp_cust` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `no_hp_cust` AS select `customer`.`id_customer` AS `id_customer`,`customer`.`nama_customer` AS `nama_customer`,`customer`.`no_telp` AS `no_telp`,`customer`.`jenis_kelamin` AS `jenis_kelamin`,`customer`.`email` AS `email`,`customer`.`alamat` AS `alamat` from `customer` where `customer`.`no_telp` like '0878%' */;

/*View structure for view role_pegawai */

/*!50001 DROP TABLE IF EXISTS `role_pegawai` */;
/*!50001 DROP VIEW IF EXISTS `role_pegawai` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `role_pegawai` AS select `pegawai`.`id_pegawai` AS `id_pegawai`,`pegawai`.`role_id` AS `role_id`,`pegawai`.`nama_pegawai` AS `nama_pegawai`,`pegawai`.`tgl_lahir` AS `tgl_lahir`,`pegawai`.`tempat_lahir` AS `tempat_lahir`,`pegawai`.`telp_pegawai` AS `telp_pegawai`,`pegawai`.`alamat_pegawai` AS `alamat_pegawai`,`pegawai`.`tanggal_masuk` AS `tanggal_masuk`,`pegawai`.`status_pegawai` AS `status_pegawai`,`pegawai`.`agama` AS `agama`,`pegawai`.`data_jenis_kelamin` AS `data_jenis_kelamin` from `pegawai` where `pegawai`.`role_id` = '900' */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
