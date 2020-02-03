-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: drivetrackerjune
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `drive`
--

DROP TABLE IF EXISTS `drive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drive` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(45) DEFAULT NULL,
  `no_of_rsrcs` int(11) DEFAULT NULL,
  `exp_req` tinyint(5) DEFAULT NULL,
  `ctc` float DEFAULT NULL,
  `join_crt` tinyint(2) DEFAULT NULL,
  `bond` float DEFAULT NULL,
  `position` tinyint(4) DEFAULT NULL,
  `follow_up` date DEFAULT NULL,
  `edu_crt` tinyint(3) DEFAULT NULL,
  `cur_status` tinyint(6) DEFAULT NULL,
  `nxt_act` tinyint(5) DEFAULT NULL,
  `nxt_date` date DEFAULT NULL,
  `ps_yr_req` int(11) DEFAULT NULL,
  `gap_req` tinyint(2) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `tpoid` int(11) DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drive`
--

LOCK TABLES `drive` WRITE;
/*!40000 ALTER TABLE `drive` DISABLE KEYS */;
INSERT INTO `drive` VALUES (7,'greenlight',10,1,3,1,5,3,'2020-01-22',1,0,0,'2020-01-24',2018,1,'2020-01-17',222554),(8,'XXR Tech',10,1,2.5,1,1,3,'2020-01-18',1,1,2,'2020-01-23',2016,1,'2020-01-19',7778);
/*!40000 ALTER TABLE `drive` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-25  1:06:39
