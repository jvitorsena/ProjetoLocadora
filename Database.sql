CREATE DATABASE  IF NOT EXISTS `locadora` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `locadora`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: ec2-18-230-57-146.sa-east-1.compute.amazonaws.com    Database: locadora
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `aluguel`
--

DROP TABLE IF EXISTS `aluguel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluguel` (
  `idAluguel` int NOT NULL AUTO_INCREMENT,
  `idCliente` int NOT NULL,
  `idVeiculo` int NOT NULL,
  `Valor` decimal(8,2) NOT NULL,
  `DtAluguel` date NOT NULL,
  `DtDevolucao` date NOT NULL,
  `IsActive` tinyint NOT NULL DEFAULT '1',
  `CreatedAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idAluguel`),
  KEY `idCliente` (`idCliente`),
  KEY `idVeiculo` (`idVeiculo`),
  CONSTRAINT `aluguel_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `aluguel_ibfk_2` FOREIGN KEY (`idVeiculo`) REFERENCES `veiculo` (`idVeiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluguel`
--

LOCK TABLES `aluguel` WRITE;
/*!40000 ALTER TABLE `aluguel` DISABLE KEYS */;
INSERT INTO `aluguel` VALUES (1,1,1,100.00,'2021-06-12','2017-05-22',0,'2021-06-13 23:48:52'),(2,2,2,500.00,'2021-06-12','2021-06-22',0,'2021-06-13 23:48:52'),(3,2,2,500.00,'2021-06-12','2021-06-22',0,'2021-06-13 23:48:52'),(4,2,2,500.00,'2021-06-12','2021-06-22',0,'2021-06-13 23:48:52'),(5,2,1,100.00,'2021-06-12','2021-06-22',0,'2021-06-13 23:48:52'),(6,2,2,500.00,'2021-06-12','2021-06-22',0,'2021-06-13 23:48:52'),(7,19,2,500.00,'2021-06-13','1996-07-01',0,'2021-06-13 23:48:52'),(8,2,2,500.10,'2021-06-13','2021-06-20',0,'2021-06-13 23:48:52'),(9,2,1,3000.00,'2021-06-13','1996-07-21',0,'2021-06-13 23:48:52'),(10,1,2,10000.00,'2021-06-13','2021-07-30',0,'2021-06-13 23:48:52'),(11,1,1,300.00,'2021-06-13','2021-06-30',0,'2021-06-13 23:48:52'),(12,21,6,3000.00,'2021-06-13','2021-06-20',0,'2021-06-13 23:48:52'),(13,20,7,1000.00,'2021-06-13','2021-06-20',0,'2021-06-13 23:48:52'),(14,22,5,1000.00,'2021-06-13','2022-01-01',0,'2021-06-13 23:48:52'),(15,1,7,3000.00,'2021-06-13','2021-01-01',0,'2021-06-13 23:48:52'),(16,23,7,3000.00,'2021-06-13','2021-06-30',0,'2021-06-13 23:48:52'),(17,21,4,3000.00,'2021-06-13','2022-01-01',0,'2021-06-13 23:48:52'),(18,21,7,3000.00,'2021-06-13','2021-01-01',0,'2021-06-13 23:48:52'),(19,22,10,3000.00,'2021-06-13','2026-08-24',0,'2021-06-13 23:48:52'),(20,23,8,3000.00,'2021-06-12','2022-06-21',0,'2021-06-13 23:54:45'),(21,22,9,5000.00,'2021-06-21','2023-10-18',0,'2021-06-13 23:56:26'),(22,23,5,6000.00,'2021-07-27','2023-05-18',0,'2021-06-13 23:57:42'),(23,23,4,6000.00,'2021-09-15','2023-07-18',0,'2021-06-13 23:58:15'),(24,23,7,2000.00,'2021-06-16','2021-01-01',0,'2021-06-16 21:12:13'),(25,21,10,3000.00,'2021-01-01','2022-01-01',0,'2021-06-19 14:44:42'),(26,21,6,1000.00,'2021-01-01','2021-01-01',0,'2021-06-19 17:04:12'),(27,22,7,5000.00,'2021-01-01','2021-01-01',1,'2021-06-19 17:04:42'),(28,21,9,10000.00,'2021-01-01','2021-01-01',1,'2021-06-19 17:05:02'),(29,21,5,5000.00,'2021-01-01','2021-01-01',1,'2021-06-21 19:47:43'),(30,21,6,1234.00,'2021-01-01','2021-01-01',1,'2021-06-21 20:47:31'),(31,21,4,1234.00,'2021-01-01','2021-01-01',1,'2021-06-21 20:48:14'),(32,21,2,3000.00,'2021-07-01','2022-07-01',0,'2021-06-22 21:06:26');
/*!40000 ALTER TABLE `aluguel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `CPF` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `Endereco` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Telefone` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Email` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `CNH` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `IsActive` tinyint DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Valentina Carla Luzia Moraes','76950993331','Rua Pedro Portela','88987993280','valentinacarlaluziamoraes_@nonesiglio.com.br','92238001946',1,'2021-06-08 19:02:25'),(2,'asdasd','12312312333','dsadsadas','dasdadasd','asdasdsa','dadsada',0,'2021-06-08 19:47:03'),(3,'Liz Letícia Giovana Assunção','73728477451','Avenida Magalhães Barata 167','91997893789','lizleticiagiovanaassuncao..lizleticiagiovanaassuncao@mesquita.not.br','49042776385',1,'2021-06-08 16:50:20'),(19,'Liz Letícia Giovana Assunção','73728477451','Avenida Magalhães Barata 167','91997893789','lizleticiagiovanaassuncao..lizleticiagiovanaassuncao@mesquita.not.br','49042776385',1,'2021-06-12 16:32:52'),(20,'Mariane Betina Castro','56576457316','Rua Pedro Portela','88987835627','marianebetinacastro..marianebetinacastro@riguetti.com.br','05031501412',1,'2021-06-13 15:54:04'),(21,'Mariane Betina Castro','56576457316','Rua Pedro Portela','88987835627','marianebetinacastro..marianebetinacastro@riguetti.com.br','05031501412',1,'2021-06-13 15:55:27'),(22,'Mariane Betina Castro','56576457316','Rua Pedro Portela','88987835627','marianebetinacastro..marianebetinacastro@riguetti.com.br','05031501412',1,'2021-06-13 15:56:29'),(23,'Liz Letícia Giovana Assunção','73728477451','Avenida Magalhães Barata 167','91997893789','lizleticiagiovanaassuncao..lizleticiagiovanaassuncao@mesquita.not.br','49042776385',1,'2021-06-13 15:58:33'),(24,'Joao Vitorr','12309318888','Rua Jenipapo','31988888888','aluno.joao.sena@doctum.edu.br','123456',0,'2021-06-13 22:19:32'),(25,'Joao Vitor','12309318888','Rua Jenipapo','31988888888','aluno.joao.sena@doctum.edu.br','123456',1,'2021-06-19 14:38:14');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(70) COLLATE utf8_unicode_ci DEFAULT NULL,
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `IsActive` tinyint NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'joao','$2a$10$.1p5CH4Pt5cXboLuKPYgzueu2dfAWsTGYWtK1GdELqSX5PzTMsswC','2021-06-08 16:57:35',1),(2,'vitor','$2a$10$f7NB.8e9qLyZoGLe/8EkKOBQaow8KSDgeIMa/G82XZA1JBqu5aP3S','2021-06-12 18:01:12',0),(3,'aaa','$2a$10$O4GEdlVbhgg87H3pl7FHqeh6meEShrjh/ULcmvf4x/x47CvOR8hNy','2021-06-13 15:32:18',0),(4,'joaovitor','$2a$10$n7Y6UEgKJGdtx6r4h6m70ug40sOTeWaa5hn22EuOeXQOKcI7XWTnu','2021-06-14 00:03:42',0),(5,'vitorsena','$2a$10$LJZk3FHdz4YG2EZ6N0yl1uXOwRM5iYuZCSwKHJ6e/1s8DrcCzHqEu','2021-06-14 00:41:46',0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `veiculo` (
  `idVeiculo` int NOT NULL AUTO_INCREMENT,
  `Modelo` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Cor` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Placa` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `Descricao` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Chassi` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Fabricante` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Ano` int NOT NULL,
  `IsActive` tinyint NOT NULL DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Disponibilidade` tinyint NOT NULL DEFAULT '1',
  PRIMARY KEY (`idVeiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES (1,'Utility 1.0 8V 53cv  (Furg','Carro verde','HFH7587','Carro completo','9 BW SU19F0 8 B285158','CHANA',2005,1,'2021-06-08 20:39:52',1),(2,'Ram 2500 LARAMIE SLT 6.7 TDI CD 4x4 Dies','Amarelo','GOJ3793','Carro completo','9 BW AB19F0 8 B302158','Dodge',2012,1,'2021-06-08 21:11:46',1),(4,'Utility 1.0 8V 53cv  (Furg','Carro verde','HFH7587','Carro completo','9 BW SU19F0 8 B285158','CHANA',2005,1,'2021-06-13 15:41:25',0),(5,'164 3.0 V6','Prata','HBW4510','Carro feio','9 BW SU21F0 8 B302158','Alfa Romeo',1991,1,'2021-06-13 15:44:05',0),(6,'Utility 1.0 8V 53cv  (Furg','Carro verde','HFH7587','Carro completo','9 BW SU19F0 8 B285158','CHANA',2005,1,'2021-06-13 15:48:11',0),(7,'Ram 2500 LARAMIE SLT 6.7 TDI CD 4x4 Dies','Amarelo','GOJ3793','Carro completo','9 BW AB19F0 8 B302158','Dodge',2012,1,'2021-06-13 15:49:05',0),(8,'Amigo 2.3 4x2/4x4','Preto','GOI2571','Carro completo','9 BW SU19F0 8 B302158','Isuzu',1992,1,'2021-06-13 15:51:00',1),(9,'AIRCROSS Star 1.5 Flex 8V 5p Mec.','Cinza','JPS-1175','Carro completo','AIJSD-2MFI8S2','Citroen',2016,1,'2021-06-13 19:02:56',0),(10,'Stilo 1.8/ 1.8 Connect 8V 103cv 5p','Vermelho','MNN-1173','Completo','AIHKS-283NS-1NS','Fiat',2003,1,'2021-06-13 19:10:39',1);
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-24 10:08:21
