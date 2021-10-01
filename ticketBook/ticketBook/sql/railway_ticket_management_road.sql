-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: railway_ticket_management
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `road`
--

DROP TABLE IF EXISTS `road`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `road` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ending_station_code` varchar(255) DEFAULT NULL,
  `ending_station_name` varchar(255) DEFAULT NULL,
  `road_code` varchar(255) DEFAULT NULL,
  `road_name` varchar(255) DEFAULT NULL,
  `starting_station_code` varchar(255) DEFAULT NULL,
  `starting_station_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `road`
--

LOCK TABLES `road` WRITE;
/*!40000 ALTER TABLE `road` DISABLE KEYS */;
INSERT INTO `road` VALUES (1,'s1009',' Feni','1001','Dhaka To  Ctg','s1003',' Bhairab Bazar'),(2,'s1017',' Kurigram','1002','Dhaka to kurigram','s1007',' Kamalapur'),(3,'s1008',' Laksam','1005','Dhaka to Chittagong','s1007',' Kamalapur'),(4,'s1016',' Rangpur	','5002','Dhaka to Rongpur','s1007',' Kamalapur'),(5,NULL,'','','',NULL,''),(6,'181',' Sylhet Station','1013','Dhaka to Sylhet','s1007',' Kamalapur'),(7,'s1006',' Comilla','1019','Dhaka to Comillah','s1007',' Kamalapur');
/*!40000 ALTER TABLE `road` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-19 10:05:51
