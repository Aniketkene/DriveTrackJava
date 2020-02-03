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
-- Table structure for table `drive_stud_track`
--

DROP TABLE IF EXISTS `drive_stud_track`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drive_stud_track` (
  `dsr_id` int(11) NOT NULL AUTO_INCREMENT,
  `did1` int(11) DEFAULT NULL,
  `stid` int(11) DEFAULT NULL,
  `tpoid1` int(11) DEFAULT NULL,
  `survived_status` tinyint(4) DEFAULT NULL,
  `creation_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`dsr_id`),
  KEY `dd_frk_idx` (`did1`),
  KEY `tp_frk_idx` (`tpoid1`),
  KEY `stud_frk_idx` (`stid`),
  CONSTRAINT `dd_frk` FOREIGN KEY (`did1`) REFERENCES `drive` (`d_id`),
  CONSTRAINT `stud_frk` FOREIGN KEY (`stid`) REFERENCES `drive_stud` (`st_id`),
  CONSTRAINT `tp_frk` FOREIGN KEY (`tpoid1`) REFERENCES `tpo` (`tpo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drive_stud_track`
--

LOCK TABLES `drive_stud_track` WRITE;
/*!40000 ALTER TABLE `drive_stud_track` DISABLE KEYS */;
/*!40000 ALTER TABLE `drive_stud_track` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-25  1:06:38
