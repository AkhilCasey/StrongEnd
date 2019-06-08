-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: strongend
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `m_patientdata`
--

DROP TABLE IF EXISTS `m_patientdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `m_patientdata` (
  `m_patientid` int(11) NOT NULL AUTO_INCREMENT,
  `m_patientname` varchar(45) DEFAULT NULL,
  `m_patientage` int(11) DEFAULT NULL,
  `m_patientgender` varchar(45) DEFAULT NULL,
  `m_patientaddress` varchar(45) DEFAULT NULL,
  `m_patientphone` varchar(45) DEFAULT NULL,
  `m_patientemergencycontactname` varchar(45) DEFAULT NULL,
  `m_patientemergencycontactphone` varchar(45) DEFAULT NULL,
  `m_patientdoctor` varchar(45) DEFAULT NULL,
  `m_patientdepartment` varchar(45) DEFAULT NULL,
  `m_patientoldid` int(11) DEFAULT NULL,
  `m_patientemergencyrelation` varchar(45) DEFAULT NULL,
  `m_patientdob` datetime DEFAULT NULL,
  `m_patientrefdoctor` varchar(45) DEFAULT NULL,
  `m_patientrefhospital` varchar(45) DEFAULT NULL,
  `m_created` datetime DEFAULT NULL,
  `m_updated` datetime DEFAULT CURRENT_TIMESTAMP,
  `m_patientdetails` varchar(200) DEFAULT NULL,
  `m_patientstatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`m_patientid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `m_patientdata`
--

LOCK TABLES `m_patientdata` WRITE;
/*!40000 ALTER TABLE `m_patientdata` DISABLE KEYS */;
INSERT INTO `m_patientdata` VALUES (1,'test',18,'test','test','test','test','test','test','test',NULL,NULL,NULL,NULL,NULL,NULL,'2019-06-08 16:13:04',NULL,NULL);
/*!40000 ALTER TABLE `m_patientdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-08 17:44:09
