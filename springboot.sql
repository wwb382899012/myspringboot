-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.53 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 springboot 的数据库结构
CREATE DATABASE IF NOT EXISTS `springboot` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `springboot`;

-- 导出  表 springboot.appuser_message 结构
CREATE TABLE IF NOT EXISTS `appuser_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `message` varchar(50) DEFAULT NULL,
  `sendtime` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  springboot.appuser_message 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `appuser_message` DISABLE KEYS */;
INSERT INTO `appuser_message` (`id`, `message`, `sendtime`) VALUES
	(1, '消息', 121212),
	(2, '消息2', 1232434);
/*!40000 ALTER TABLE `appuser_message` ENABLE KEYS */;

-- 导出  表 springboot.person 结构
CREATE TABLE IF NOT EXISTS `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  springboot.person 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`id`, `name`, `age`) VALUES
	(1, 'wwb', 26),
	(2, 'yyy', 28);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
