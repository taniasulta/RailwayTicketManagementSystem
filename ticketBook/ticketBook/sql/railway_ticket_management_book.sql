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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `bkash_number` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `passenger_id` varchar(255) DEFAULT NULL,
  `road_code` varchar(255) DEFAULT NULL,
  `road_name` varchar(255) DEFAULT NULL,
  `seat_class` varchar(255) DEFAULT NULL,
  `seat_price` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `total_amount` varchar(255) DEFAULT NULL,
  `train_code` varchar(255) DEFAULT NULL,
  `train_name` varchar(255) DEFAULT NULL,
  `travel_code` varchar(255) DEFAULT NULL,
  `travel_name` varchar(255) DEFAULT NULL,
  `no_of_seats` int DEFAULT NULL,
  `vat` varchar(255) DEFAULT NULL,
  `issue_date` varchar(255) DEFAULT NULL,
  `pay_amount` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (19,'Dhaka','5465654352','2021-09-22','richardanik98@gmail.com','Al-Amin','Hosain','0152648555','1225','1002',' Dhaka to kurigram','AC Seat','750.0','13:00','800','102',' Kurigram Exp','2001','Mrc',1,'10%','2021/09/18',NULL),(20,'Dhaka','1265452','2021-09-22','ta1261354@gmail.com','Tania','Sultana','0152648555','1226','1002',' Dhaka to kurigram','AC Seat','750.0','13:00','1600','102',' Kurigram Exp','2001','Mrc',2,'10%','2021/09/17',NULL),(40,'Dhaka','1265452','2021-09-22','richardanik98@gmail.com','Monia','Sultana','0152648555','1228','1002',' Dhaka to kurigram','AC Seat','750.0','13:00','1200','102',' Kurigram Exp','2001','Mrc',1,'10%','2021/09/21',NULL),(41,'Dhaka','5465654352','2021-09-22','suf212@gmail.com','Sojon','Khan','0184562446','1229','1002',' Dhaka to kurigram','AC Seat','750.0','13:00','1155','102',' Kurigram Exp','2001','Mrc',2,'10%','2021/09/21',NULL),(47,'Dhaka','5465654352','2021-09-22','richardanik98@gmail.com','Ratul','Hasan','0152648555','1230','1002',' Dhaka to kurigram','AC Seat','1050.0','13:00','1155','102',' Kurigram Exp','2001','Mrc',1,'10%','2021/09/18',NULL),(48,'Dhaka','5465654352','2021-09-22','richardanik98@gmail.com','Ratul','Hasan','0152648555','1230','1002',' Dhaka to kurigram','AC Seat','1050.0','13:00','1155','102',' Kurigram Exp','2001','Mrc',1,'10%','2021/09/18',NULL),(56,'Dhaka','5465654352','2021-09-26','richardanik98@gmail.com','Al-Amin','Hosain','0152648555','1235','1005',' Dhaka to Chittagong','AC Birth','1050.0','10:00','2310.0','103',' Titas','2006','Fbc',2,'10%','2021/09/20',NULL),(57,'Dhaka','4454879','2021-09-22','ta1261354@gmail.com','Sila','Actar','0184562446','1275','1005',' Dhaka to Chittagong','AC Seat','750.0','10:00','1650.0','101','Provati','2005','Arc',2,'10%','2021/09/18',NULL),(58,'Dhaka','4454879','2021-09-22','ta1261354@gmail.com','Sila','Actar','0184562446','1275','1005',' Dhaka to Chittagong','AC Birth','1050.0','10:00','2310.0','101','Provati','2005','Arc',2,'10%','2021/09/18',NULL),(63,'Dhaka','6561256','2021-09-26','richardanik98@gmail.com','Ratul','Hosain','0184562446','1238','1005',' Dhaka to Chittagong','Shovon','300.0','10:00','990.0','103',' Titas','2006','Fbc',3,'10%','2021/09/18','990.0'),(64,'Gazipur','4454879','2021-09-22','to1261354@gmail.com','Al-Amin','Hosain','45654689','1225','5002',' Dhaka to Rongpur','AC Seat','750.0','5:00','1650.0','103',' Titas','20025','Mbc',2,'10%','2021/09/18','1650.0'),(65,'Gazipur','4454879','2021-09-22','to1261354@gmail.com','Al-Amin','Hosain','45654689','1225','5002',' Dhaka to Rongpur','AC Seat','750.0','5:00','1650.0','103',' Titas','20025','Mbc',2,'10%','2021/09/18','1650.0'),(66,'Gazipur','4454879','2021-09-22','to1261354@gmail.com','Al-Amin','Hosain','45654689','1225','5002',' Dhaka to Rongpur','AC Seat','750.0','5:00','1650.0','103',' Titas','20025','Mbc',2,'10%','2021/09/18','1650.0'),(67,'Gazipur','4454879','2021-09-22','to1261354@gmail.com','Al-Amin','Hosain','45654689','1225','5002',' Dhaka to Rongpur','AC Seat','750.0','5:00','1650.0','103',' Titas','20025','Mbc',2,'10%','2021/09/18','1650.0');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-19 10:05:50
