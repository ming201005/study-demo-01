/*
 Navicat Premium Data Transfer

 Source Server         : localhost-MAMP
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost
 Source Database       : customer_db

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : utf-8

 Date: 11/06/2019 15:48:23 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `customer_table`
-- ----------------------------
DROP TABLE IF EXISTS `customer_table`;
CREATE TABLE `customer_table` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `tell` varchar(15) DEFAULT NULL,
  `addr` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `customer_table`
-- ----------------------------
BEGIN;
INSERT INTO `customer_table` VALUES ('1', '刘德华', '男', '1883446', '香港'), ('2', '张学友', '男', '151790987', '香港'), ('3', '容祖儿', '女', '138565565', '深圳'), ('4', '范玮琪', '女', '1688654467', '台湾'), ('5', 'uuu', '男', 'uu', 'u'), ('6', 'iii', '男', 'uui', 'uii');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
