/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2019-09-06 14:57:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_meeting_room
-- ----------------------------
DROP TABLE IF EXISTS `t_meeting_room`;
CREATE TABLE `t_meeting_room` (
  `Room_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Room_No` varchar(50) DEFAULT NULL,
  `Room_Name` varchar(50) DEFAULT NULL,
  `Capacity` int(11) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `enabled` int(11) DEFAULT NULL,
  `Remark` varchar(255) DEFAULT NULL,
  `Create_User_Id` int(11) DEFAULT NULL,
  `Create_Time` datetime DEFAULT NULL,
  `Update_Time` datetime DEFAULT NULL,
  PRIMARY KEY (`Room_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_meeting_room
-- ----------------------------
INSERT INTO `t_meeting_room` VALUES ('1', '', '501会议室', '15', '5楼东侧', '修改信息', '1', '修改可容纳人员为15', '1', '2019-04-05 15:36:32', '2019-04-07 12:40:33');
INSERT INTO `t_meeting_room` VALUES ('2', '', '401会议室', '5', '4楼', '', '0', '', '1', '2019-04-05 15:38:49', '2019-04-06 15:08:55');
INSERT INTO `t_meeting_room` VALUES ('3', '', '缥缈峰', '20', '西区', '该会议室可以容纳20人使用，请提前预定', '1', '请提前预定', '1', '2019-04-06 20:26:50', '2019-04-06 20:28:13');
INSERT INTO `t_meeting_room` VALUES ('4', null, '聚贤庄', '30', '科学实验室大楼西侧', '由于会议室比较紧张，请提前预订', '1', '会议室设备请妥善保管', '1', '2019-04-07 12:08:28', '2019-04-07 12:08:28');

-- ----------------------------
-- Table structure for t_meeting_room_order
-- ----------------------------
DROP TABLE IF EXISTS `t_meeting_room_order`;
CREATE TABLE `t_meeting_room_order` (
  `Order_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Order_No` varchar(255) DEFAULT NULL,
  `User_Id` int(11) DEFAULT NULL,
  `Room_Id` int(11) DEFAULT NULL,
  `Order_Date` datetime DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Star_Date_Plan` datetime DEFAULT NULL,
  `End_Date_Plan` datetime DEFAULT NULL,
  `Star_Date_Actual` datetime DEFAULT NULL,
  `End_Date_Actual` datetime DEFAULT NULL,
  `Status_Id` int(11) DEFAULT NULL,
  `Remark` varchar(255) DEFAULT NULL,
  `Create_User_Id` int(11) DEFAULT NULL,
  `Create_Time` datetime DEFAULT NULL,
  `Update_Time` datetime DEFAULT NULL,
  PRIMARY KEY (`Order_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_meeting_room_order
-- ----------------------------
INSERT INTO `t_meeting_room_order` VALUES ('1', null, '1', '1', '2019-04-08 00:00:00', '1212', '1970-01-01 08:00:00', '1970-01-01 13:00:00', null, null, '1', '测试', '1', '2019-04-06 13:03:34', '2019-04-06 13:03:34');
INSERT INTO `t_meeting_room_order` VALUES ('2', null, '1', '1', '2019-04-08 00:00:00', '测试一下', '1970-01-01 13:30:00', '1970-01-01 15:30:00', null, null, '1', '', '1', '2019-04-06 13:31:00', '2019-04-06 13:31:00');
INSERT INTO `t_meeting_room_order` VALUES ('3', null, '30', '1', '2019-04-08 00:00:00', '大街上开发加的咖啡', '1970-01-01 16:00:00', '1970-01-01 18:30:00', '1970-01-01 16:00:00', '1970-01-01 18:30:00', '2', '', '30', '2019-04-06 13:32:38', '2019-04-06 14:33:55');
INSERT INTO `t_meeting_room_order` VALUES ('4', null, '30', '2', '2019-04-08 00:00:00', '第三方发给发给', '1970-01-01 18:00:00', '1970-01-01 19:00:00', null, null, '3', '', '30', '2019-04-06 14:43:07', '2019-04-06 15:02:14');
INSERT INTO `t_meeting_room_order` VALUES ('5', null, '30', '2', '2019-04-08 00:00:00', '测试', '1970-01-01 15:00:00', '1970-01-01 16:00:00', null, null, '3', '', '30', '2019-04-06 15:04:05', '2019-04-06 15:04:27');
INSERT INTO `t_meeting_room_order` VALUES ('6', null, '30', '2', '2019-04-08 00:00:00', '', '1970-01-01 15:06:00', '1970-01-01 16:00:00', null, null, '3', '', '30', '2019-04-06 15:07:05', '2019-04-06 15:07:11');
INSERT INTO `t_meeting_room_order` VALUES ('7', null, '30', '2', '2019-04-08 00:00:00', '121', '1970-01-01 18:00:00', '1970-01-01 19:00:00', null, null, '3', '212', '30', '2019-04-06 15:51:00', '2019-04-06 16:05:31');
INSERT INTO `t_meeting_room_order` VALUES ('8', null, '30', '2', '2019-04-09 00:00:00', '', '1970-01-01 13:00:00', '1970-01-01 18:00:00', '1970-01-01 13:00:00', '1970-01-01 18:00:00', '2', '', '30', '2019-04-06 16:09:43', '2019-04-06 17:17:37');
INSERT INTO `t_meeting_room_order` VALUES ('9', null, '30', '2', '2019-04-10 00:00:00', '', '1970-01-01 13:00:00', '1970-01-01 18:00:00', null, null, '1', '', '30', '2019-04-06 16:09:57', '2019-04-06 16:09:57');
INSERT INTO `t_meeting_room_order` VALUES ('10', null, '30', '2', '2019-04-11 00:00:00', '', '1970-01-01 13:00:00', '1970-01-01 18:00:00', null, null, '1', '', '30', '2019-04-06 16:10:06', '2019-04-06 16:10:06');
INSERT INTO `t_meeting_room_order` VALUES ('11', null, '30', '2', '2019-04-11 00:00:00', '', '1970-01-01 08:00:00', '1970-01-01 12:00:00', null, null, '1', '', '30', '2019-04-06 18:52:53', '2019-04-06 18:52:53');
INSERT INTO `t_meeting_room_order` VALUES ('12', null, '30', '2', '2019-04-11 00:00:00', '', '1970-01-01 19:00:00', '1970-01-01 20:00:00', null, null, '1', '', '30', '2019-04-06 18:54:54', '2019-04-06 18:54:54');
INSERT INTO `t_meeting_room_order` VALUES ('13', null, '30', '2', '2019-04-12 00:00:00', '', '1970-01-01 08:00:00', '1970-01-01 12:00:00', null, null, '1', '', '30', '2019-04-06 18:56:03', '2019-04-06 18:56:03');
INSERT INTO `t_meeting_room_order` VALUES ('14', null, '30', '2', '2019-04-12 00:00:00', '', '1970-01-01 14:00:00', '1970-01-01 17:00:00', null, null, '1', '', '30', '2019-04-06 18:56:48', '2019-04-06 19:00:32');
INSERT INTO `t_meeting_room_order` VALUES ('15', null, '37', '3', '2019-04-01 00:00:00', '召开董事会', '1970-01-01 13:00:00', '1970-01-01 18:00:00', '1970-01-01 13:00:00', '1970-01-01 18:00:00', '2', '共30人', '37', '2019-04-06 20:39:39', '2019-04-06 20:45:32');
INSERT INTO `t_meeting_room_order` VALUES ('16', null, '37', '3', '2019-04-01 00:00:00', '', '1970-01-01 08:00:00', '1970-01-01 12:00:00', '1970-01-01 08:00:00', '1970-01-01 12:00:00', '2', '', '37', '2019-04-06 20:42:22', '2019-04-06 20:53:13');
INSERT INTO `t_meeting_room_order` VALUES ('17', null, '37', '1', '2019-04-15 00:00:00', '开会开会', '1970-01-01 08:00:00', '1970-01-01 12:00:00', null, null, '3', '', '37', '2019-04-06 20:48:41', '2019-04-06 21:16:56');
INSERT INTO `t_meeting_room_order` VALUES ('18', null, '37', '1', '2019-04-15 00:00:00', '', '1970-01-01 13:00:00', '1970-01-01 14:00:00', null, null, '3', '', '37', '2019-04-06 20:49:15', '2019-04-06 21:17:27');
INSERT INTO `t_meeting_room_order` VALUES ('19', null, '37', '1', '2019-04-15 00:00:00', '', '1970-01-01 08:00:00', '1970-01-01 18:00:00', null, null, '4', '', '37', '2019-04-06 21:20:02', '2019-04-06 21:20:07');
INSERT INTO `t_meeting_room_order` VALUES ('20', null, '37', '1', '2019-04-09 00:00:00', '', '1970-01-01 01:00:00', '1970-01-01 01:00:00', null, null, '4', '', '37', '2019-04-06 21:45:33', '2019-04-06 21:45:37');
INSERT INTO `t_meeting_room_order` VALUES ('21', null, '38', '3', '2019-03-31 00:00:00', '早会', '1970-01-01 08:00:00', '1970-01-01 12:00:00', null, null, '3', '早会使用', '38', '2019-04-07 13:18:32', '2019-04-07 19:07:32');
INSERT INTO `t_meeting_room_order` VALUES ('22', null, '38', '4', '2019-04-08 00:00:00', '财务部门召开例会', '1970-01-01 13:00:00', '1970-01-01 15:00:00', null, null, '1', '请勿打扰', '38', '2019-04-07 14:32:23', '2019-04-07 15:01:01');
INSERT INTO `t_meeting_room_order` VALUES ('23', null, '38', '1', '2019-04-01 00:00:00', '召开董事会', '1970-01-01 08:00:00', '1970-01-01 12:00:00', null, null, '3', '召开董事会', '38', '2019-04-07 14:54:33', '2019-04-07 15:05:09');
INSERT INTO `t_meeting_room_order` VALUES ('24', null, '38', '3', '2019-04-08 00:00:00', '开会', '1970-01-01 08:00:00', '1970-01-01 12:00:00', null, null, '4', '开会', '38', '2019-04-07 18:23:00', '2019-04-07 18:23:53');
INSERT INTO `t_meeting_room_order` VALUES ('25', null, '38', '3', '2019-04-09 00:00:00', '临时会议', '1970-01-01 10:00:00', '1970-01-01 11:30:00', '1970-01-01 10:00:00', '1970-01-01 11:30:00', '2', '临时会议', '38', '2019-04-07 18:26:41', '2019-04-07 18:29:32');
INSERT INTO `t_meeting_room_order` VALUES ('26', null, '38', '3', '2019-04-10 00:00:00', '开会使用', '1970-01-01 16:00:00', '1970-01-01 18:00:00', null, null, '1', '开会使用', '38', '2019-04-07 18:41:40', '2019-04-07 18:41:40');
INSERT INTO `t_meeting_room_order` VALUES ('27', null, '38', '4', '2019-04-11 00:00:00', '例会', '1970-01-01 10:00:00', '1970-01-01 10:40:00', null, null, '1', '例会', '38', '2019-04-07 18:41:59', '2019-04-07 18:41:59');
INSERT INTO `t_meeting_room_order` VALUES ('28', null, '38', '1', '2019-04-03 00:00:00', '紧急会议', '1970-01-01 13:00:00', '1970-01-01 14:00:00', null, null, '4', '紧急会议', '38', '2019-04-07 19:08:56', '2019-04-07 19:23:03');

-- ----------------------------
-- Table structure for t_order_status
-- ----------------------------
DROP TABLE IF EXISTS `t_order_status`;
CREATE TABLE `t_order_status` (
  `Status_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Status_Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Status_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_status
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `Role_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Role_Name` varchar(255) DEFAULT NULL,
  `Create_User_Id` int(255) DEFAULT NULL,
  `Create_Time` datetime DEFAULT NULL,
  `Update_Time` datetime DEFAULT NULL,
  `enabled` int(11) DEFAULT NULL,
  `Remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Role_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '系统管理员', '1', '2019-04-05 12:03:08', '2019-04-06 19:31:10', '1', null);
INSERT INTO `t_role` VALUES ('2', '用户', '1', '2019-04-05 12:04:45', '2019-04-05 12:04:45', '1', null);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `User_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_No` varchar(20) DEFAULT NULL,
  `User_Name` varchar(255) DEFAULT NULL,
  `Role_ID` int(11) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Sex` varchar(20) DEFAULT NULL,
  `User_Account` varchar(255) DEFAULT NULL,
  `User_Pwd` varchar(255) DEFAULT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` int(11) DEFAULT NULL,
  `Create_UserId` int(11) DEFAULT NULL,
  `Create_Time` datetime DEFAULT NULL,
  `Update_Time` datetime DEFAULT NULL,
  `Remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '001', 'admin', '1', null, null, 'admin', '123456', null, null, '1', null, null, null, null);
INSERT INTO `t_user` VALUES ('19', '013', '凯丽', '2', null, '男', 'kaili', null, '13991625678', 'kaili@162.com', '1', null, '2019-03-24 16:06:24', '2019-04-14 22:06:37', '');
INSERT INTO `t_user` VALUES ('23', '017', '王可可', '2', null, '男', 'wangkeke', null, '18634235678', 'wangkeke@sz.com', '1', null, '2019-03-24 16:06:24', '2019-04-14 22:05:42', '');
INSERT INTO `t_user` VALUES ('25', '019', '逍遥', '2', null, '男', '逍遥', null, '13591642295', '13591642295@qq.com', '1', null, '2019-03-24 16:06:24', '2019-04-14 22:04:12', '');
INSERT INTO `t_user` VALUES ('26', '020', '李梅梅', '2', null, '男', 'limeimei', null, '13567654532', 'limm@163.com', '1', null, '2019-03-24 16:06:24', '2019-04-14 22:06:10', '');
INSERT INTO `t_user` VALUES ('28', '022', '王武', '2', null, '男', 'wangwu', null, '13512129897', '13512129897@qq.com', '1', null, '2019-03-24 16:06:24', '2019-04-14 22:05:04', '');
INSERT INTO `t_user` VALUES ('37', '', '张三三', '2', null, '男', 'zhangsansan', '111111', '18809167584', '18809167584@163.com', '0', '1', '2019-04-06 20:25:31', '2019-04-14 22:04:31', '');
INSERT INTO `t_user` VALUES ('38', null, '张敏', '2', null, '男', 'zhangmin', '123456', '15534567895', '123456789@163.com', '1', '1', '2019-04-07 09:46:14', '2019-04-14 22:04:45', '');
