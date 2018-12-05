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
	(1, '消息', 1543818007),
	(2, '消息2', 1543818020);
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

-- 导出  表 springboot.t_action 结构
CREATE TABLE IF NOT EXISTS `t_action` (
  `action_id` int(11) NOT NULL AUTO_INCREMENT,
  `action_name` varchar(64) DEFAULT NULL,
  `icon` varchar(256) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `list_url` varchar(256) DEFAULT NULL,
  `action_url` varchar(256) DEFAULT NULL,
  `order_index` int(11) DEFAULT '0',
  `role_ids` varchar(256) DEFAULT '0',
  `user_id` int(11) DEFAULT '0',
  `status` int(11) DEFAULT '0',
  `create_user_id` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_user_id` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  springboot.t_action 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `t_action` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_action` ENABLE KEYS */;

-- 导出  表 springboot.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pwd` varchar(50) NOT NULL DEFAULT '0',
  `name` varchar(50) DEFAULT NULL,
  `age` int(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- 正在导出表  springboot.user 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `pwd`, `name`, `age`) VALUES
	(1, '123456', 'wwb', 21);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
