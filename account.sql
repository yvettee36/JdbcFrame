/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50540
Source Host           : 127.0.0.1:3306
Source Database       : testbatch

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-10-02 23:30:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `money` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '车村', '100.23');
INSERT INTO `account` VALUES ('2', 'bbb', '900');
INSERT INTO `account` VALUES ('3', 'ccc', '1000');
