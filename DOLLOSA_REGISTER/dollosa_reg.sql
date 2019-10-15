-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.26-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for dollosa_reg
CREATE DATABASE IF NOT EXISTS `dollosa_reg` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dollosa_reg`;

-- Dumping structure for table dollosa_reg.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Dumping data for table dollosa_reg.product: ~0 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`, `product`, `quantity`, `price`) VALUES
	(1, 'qw', 1, 12),
	(2, 'qw21', 1111, 2323),
	(3, 'as', 0, 12);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table dollosa_reg.reg
CREATE TABLE IF NOT EXISTS `reg` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` text NOT NULL,
  `password` text NOT NULL,
  `firstname` text NOT NULL,
  `lastname` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Dumping data for table dollosa_reg.reg: ~0 rows (approximately)
/*!40000 ALTER TABLE `reg` DISABLE KEYS */;
INSERT INTO `reg` (`id`, `username`, `password`, `firstname`, `lastname`) VALUES
	(1, 'nier', '2edb025db4bf7875017969eb926c023c', 'dollosa', 'nierizze'),
	(2, '', 'd41d8cd98f00b204e9800998ecf8427e', '', ''),
	(3, 'sus', '1158f5f8d240a731d28068742adea0fd', 'buenabiles', 'mark');
/*!40000 ALTER TABLE `reg` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
