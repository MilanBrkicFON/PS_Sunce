/*
SQLyog Community v12.4.1 (64 bit)
MySQL - 5.6.17 : Database - pssunce
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pssunce` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pssunce`;

/*Table structure for table `clan` */

DROP TABLE IF EXISTS `clan`;

CREATE TABLE `clan` (
  `clanID` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) DEFAULT NULL,
  `prezime` varchar(50) DEFAULT NULL,
  `imeRoditelja` varchar(50) DEFAULT NULL,
  `datumRodjenja` date DEFAULT NULL,
  `pol` char(1) DEFAULT NULL,
  `godinaUpisa` int(4) DEFAULT NULL,
  `ptt` int(11) DEFAULT NULL,
  PRIMARY KEY (`clanID`),
  KEY `ptt` (`ptt`),
  CONSTRAINT `clan_ibfk_1` FOREIGN KEY (`ptt`) REFERENCES `mesto` (`ptt`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1041 DEFAULT CHARSET=latin1;

/*Data for the table `clan` */

insert  into `clan`(`clanID`,`ime`,`prezime`,`imeRoditelja`,`datumRodjenja`,`pol`,`godinaUpisa`,`ptt`) values 
(1003,'Dragan','Brkic','Zdravko','1961-12-15','M',2017,11000),
(1004,'Zorica','Brkic','Tomislav','1961-07-27','Z',2017,11000),
(1005,'Nina','Stevic','Dragan','1994-05-19','Z',2017,21000),
(1006,'Milanko','Brkic','Dragan','1995-08-07','M',2017,21000),
(1028,'Milena','Brkic','Zorica','1994-08-07','Z',2014,11000),
(1029,'Ana','Stavlic','Zorica','1983-11-04','Z',2017,11000),
(1030,'Stefan','Krstic','Marija','1993-08-25','M',2016,11000),
(1031,'Ivan','Dmitrovic','Bane','1994-08-10','M',2016,11000),
(1032,'Zika','Pavlovic','Pera','1998-12-08','M',2016,21000),
(1033,'Marija','Milovanovic','Dragana','1994-08-02','Z',2016,11000),
(1034,'Sanja','Raickovic','Goran','1994-08-12','Z',2018,11000),
(1035,'Gordan','Zivanovic','Marko','1995-03-02','M',2016,11000),
(1036,'Nemanja','Slavic','Bane','1994-03-15','M',2013,11271),
(1038,'Milan','Brkic','Sa','1995-09-08','M',2010,11271),
(1039,'Marko','Markovic','Gagi','1998-02-15','M',2016,11271);

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `ptt` int(6) NOT NULL,
  `naziv` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ptt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mesto` */

insert  into `mesto`(`ptt`,`naziv`) values 
(11000,'Beograd'),
(11070,'Novi Beograd'),
(11080,'Zemun'),
(11271,'Surcin'),
(21000,'Novi Sad'),
(37000,'Krusevac');

/*Table structure for table `sport` */

DROP TABLE IF EXISTS `sport`;

CREATE TABLE `sport` (
  `sportID` int(11) NOT NULL,
  `naziv` varchar(20) DEFAULT NULL,
  `maxBrClanova` int(11) DEFAULT NULL,
  PRIMARY KEY (`sportID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sport` */

insert  into `sport`(`sportID`,`naziv`,`maxBrClanova`) values 
(1,'Kosarka',20),
(2,'Mali fudbal',25),
(3,'Odbojka',22),
(123,'123',123);

/*Table structure for table `tclan` */

DROP TABLE IF EXISTS `tclan`;

CREATE TABLE `tclan` (
  `clanid` int(11) NOT NULL,
  `vremeOd` time NOT NULL,
  `vremeDo` time NOT NULL,
  `datum` date NOT NULL,
  PRIMARY KEY (`clanid`,`vremeOd`,`vremeDo`,`datum`),
  KEY `vremeOd` (`vremeOd`,`vremeDo`,`datum`),
  CONSTRAINT `tclan_ibfk_1` FOREIGN KEY (`vremeOd`, `vremeDo`, `datum`) REFERENCES `trening` (`vremeOd`, `vremeDo`, `datum`),
  CONSTRAINT `tclan_ibfk_2` FOREIGN KEY (`clanid`) REFERENCES `clan` (`clanID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tclan` */

insert  into `tclan`(`clanid`,`vremeOd`,`vremeDo`,`datum`) values 
(1006,'10:00:00','11:00:00','2017-04-07'),
(1030,'10:00:00','11:00:00','2017-04-07'),
(1035,'10:00:00','11:00:00','2017-04-07'),
(1038,'10:00:00','11:00:00','2017-04-07'),
(1030,'13:20:00','14:00:00','2017-04-05'),
(1031,'13:20:00','14:00:00','2017-04-05'),
(1035,'13:20:00','14:00:00','2017-04-05'),
(1003,'13:20:00','14:00:00','2017-04-06'),
(1004,'13:20:00','14:00:00','2017-04-06'),
(1005,'13:20:00','14:00:00','2017-04-06'),
(1035,'13:20:00','14:00:00','2017-04-07'),
(1036,'13:20:00','14:00:00','2017-04-07');

/*Table structure for table `trener` */

DROP TABLE IF EXISTS `trener`;

CREATE TABLE `trener` (
  `trenerID` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) DEFAULT NULL,
  `prezime` varchar(50) DEFAULT NULL,
  `datumRodjenja` date DEFAULT NULL,
  `godineRada` int(11) DEFAULT NULL,
  `kratakCV` varchar(150) DEFAULT NULL,
  `sportID` int(11) DEFAULT NULL,
  PRIMARY KEY (`trenerID`),
  KEY `sportID` (`sportID`),
  CONSTRAINT `trener_ibfk_1` FOREIGN KEY (`sportID`) REFERENCES `sport` (`sportID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `trener` */

insert  into `trener`(`trenerID`,`ime`,`prezime`,`datumRodjenja`,`godineRada`,`kratakCV`,`sportID`) values 
(1,'Zoran','Dragicevic','1970-01-29',4,'Zavrsio dif sa prosecnom ocenom 9. Radio 2 godine u Italiji za klub OKS.',3),
(2,'Ana ','Stavlic','1983-11-04',5,'Isla sam u Francusku....',1),
(3,'Dusko ','Petrovic','2017-04-30',5,'Dusko je vodio najvece timove po evropi',1);

/*Table structure for table `trening` */

DROP TABLE IF EXISTS `trening`;

CREATE TABLE `trening` (
  `vremeOd` time NOT NULL,
  `vremeDo` time NOT NULL,
  `datum` date NOT NULL,
  PRIMARY KEY (`vremeOd`,`vremeDo`,`datum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `trening` */

insert  into `trening`(`vremeOd`,`vremeDo`,`datum`) values 
('10:00:00','11:00:00','2017-04-07'),
('10:30:00','12:30:00','2017-01-28'),
('13:20:00','14:00:00','2017-04-05'),
('13:20:00','14:00:00','2017-04-06'),
('13:20:00','14:00:00','2017-04-07');

/*Table structure for table `tt` */

DROP TABLE IF EXISTS `tt`;

CREATE TABLE `tt` (
  `trenerID` int(11) NOT NULL,
  `vremeOd` time NOT NULL,
  `vremeDo` time NOT NULL,
  `datum` date NOT NULL,
  PRIMARY KEY (`trenerID`,`vremeOd`,`vremeDo`,`datum`),
  KEY `vremeOd` (`vremeOd`,`vremeDo`,`datum`),
  CONSTRAINT `tt_ibfk_2` FOREIGN KEY (`vremeOd`, `vremeDo`, `datum`) REFERENCES `trening` (`vremeOd`, `vremeDo`, `datum`),
  CONSTRAINT `tt_ibfk_3` FOREIGN KEY (`trenerID`) REFERENCES `trener` (`trenerID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tt` */

insert  into `tt`(`trenerID`,`vremeOd`,`vremeDo`,`datum`) values 
(1,'10:00:00','11:00:00','2017-04-07'),
(3,'10:30:00','12:30:00','2017-01-28'),
(2,'13:20:00','14:00:00','2017-04-05'),
(1,'13:20:00','14:00:00','2017-04-06'),
(3,'13:20:00','14:00:00','2017-04-07');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
