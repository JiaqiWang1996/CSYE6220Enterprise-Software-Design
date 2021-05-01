/*
Navicat MySQL Data Transfer

Source Server         : 本地连接
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : db_score

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-04-13 15:26:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_b_score`
-- ----------------------------
DROP TABLE IF EXISTS `t_b_score`;
CREATE TABLE `t_b_score` (
  `id` varchar(36) NOT NULL,
  `coursename` varchar(15) DEFAULT NULL,
  `score` decimal(10,0) DEFAULT NULL,
  `term` varchar(36) DEFAULT NULL,
  `classname` varchar(20) DEFAULT NULL,
  `teacherid` varchar(36) NOT NULL,
  `studentid` varchar(36) NOT NULL,
  `createTime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_t_b_course_t_b_teacher1` (`teacherid`),
  KEY `fk_t_b_course_t_b_student1` (`studentid`),
  CONSTRAINT `fk_t_b_course_t_b_student1` FOREIGN KEY (`studentid`) REFERENCES `t_b_student` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_b_course_t_b_teacher1` FOREIGN KEY (`teacherid`) REFERENCES `t_b_teacher` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_b_score
-- ----------------------------
INSERT INTO `t_b_score` VALUES ('2c9281be62bdaef60162bdd01b110003', 'Software', '89', '2', '3', '402881e9529aa90b01529aba5b440002', '2c9281be62bdaef60162bdcec2640001', '2018-04-13');
INSERT INTO `t_b_score` VALUES ('2c9281be62bdaef60162bdd44f400008', 'math', '88', '1', '3', '402881e9529aa90b01529aadbf170001', '2c9281be62bdaef60162bdcec2640001', '2018-04-13');
INSERT INTO `t_b_score` VALUES ('2c9281be62bdaef60162bdd44f560009', 'english', '98', '2', '3', '402881e9529aa90b01529aba5b440002', '402880e6528bcdc101528bcfd5df0000', '2018-04-13');
INSERT INTO `t_b_score` VALUES ('402880e752e7bf5d0152e7c340a90000', 'Java', '98', '1', '3', '402881e9529aa90b01529aadbf170001', '402880e6528bcdc101528bcfd5df0000', '2016-02-16');
INSERT INTO `t_b_score` VALUES ('402880e752ed92930152ed9437090001', 'PHP', '98', '2', '3', '402881e9529aa90b01529aba5b440002', '402880e6528bcdc101528bcfd5df0000', '2016-02-17');
INSERT INTO `t_b_score` VALUES ('402880e752edb3ef0152edb6562f0000', 'c', '88', '1', '3', '402881e9529aa90b01529aba5b440002', '402880e6528bcdc101528bcfd5df0000', '2016-02-17');
INSERT INTO `t_b_score` VALUES ('402881e9529b970b01529b98ede20000', 'Java', '95', '1', '1', '402881e9529aa90b01529aadbf170001', '402881e9529aa90b01529aac34640000', '2016-02-01');

-- ----------------------------
-- Table structure for `t_b_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_b_student`;
CREATE TABLE `t_b_student` (
  `id` varchar(36) NOT NULL,
  `studentnum` varchar(15) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `qq` varchar(15) DEFAULT NULL,
  `mobile` varchar(13) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_b_student
-- ----------------------------
INSERT INTO `t_b_student` VALUES ('2c9281be62bdaef60162bdcec2640001', '1004', 'Tom', '1', '2018-04-13', '13656562656', '13656562656', '2018-04-13');
INSERT INTO `t_b_student` VALUES ('2c9281be62bdaef60162bdcf1c140002', '1005', 'Jerry', '2', '2018-04-20', '13235656', '13545455545', '2018-04-13');
INSERT INTO `t_b_student` VALUES ('402880e6528bcdc101528bcfd5df0000', '1001', 'Cat', '1', '2016-01-07', '345665255', '13656562545', '2016-01-29');
INSERT INTO `t_b_student` VALUES ('402880e6528c7fd901528c823a030000', '1002', 'Jimi', '2', '2016-01-14', '66652556', '13556562656', '2016-01-29');
INSERT INTO `t_b_student` VALUES ('402881e9529aa90b01529aac34640000', '1003', 'Lili', '1', '2015-02-02', '123456', '15188888888', '2016-02-01');

-- ----------------------------
-- Table structure for `t_b_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `t_b_teacher`;
CREATE TABLE `t_b_teacher` (
  `id` varchar(36) NOT NULL,
  `teachername` varchar(10) DEFAULT NULL,
  `tittle` varchar(10) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `teachernum` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_b_teacher
-- ----------------------------
INSERT INTO `t_b_teacher` VALUES ('2c9281be62bdaef60162bdd4ec0b000a', 'Robin', 'Senior', '2018-04-01 00:00:00', '2018-04-13 15:07:50', '18888888888', '103');
INSERT INTO `t_b_teacher` VALUES ('402881e9529aa90b01529aadbf170001', 'Dino', 'Professor', '2009-11-18 00:00:00', '2016-02-01 10:33:43', '13588888888', '101');
INSERT INTO `t_b_teacher` VALUES ('402881e9529aa90b01529aba5b440002', 'Ash', 'Professor', '2014-01-16 00:00:00', '2016-02-01 10:47:30', '15166666666', '102');

-- ----------------------------
-- Table structure for `t_s_depart`
-- ----------------------------
DROP TABLE IF EXISTS `t_s_depart`;
CREATE TABLE `t_s_depart` (
  `id` varchar(36) NOT NULL,
  `departname` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `parentid` varchar(36) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_t_s_depart_t_s_depart1` (`parentid`),
  CONSTRAINT `fk_t_s_depart_t_s_depart1` FOREIGN KEY (`parentid`) REFERENCES `t_s_depart` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_s_depart
-- ----------------------------
INSERT INTO `t_s_depart` VALUES ('1', 'test', 'test', '1', null);

-- ----------------------------
-- Table structure for `t_s_resource`
-- ----------------------------
DROP TABLE IF EXISTS `t_s_resource`;
CREATE TABLE `t_s_resource` (
  `id` varchar(36) NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `href` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `order_no` int(11) DEFAULT NULL,
  `resourceType` int(11) DEFAULT NULL,
  `parentid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_t_s_resource_t_s_resource1` (`parentid`),
  CONSTRAINT `fk_t_s_resource_t_s_resource1` FOREIGN KEY (`parentid`) REFERENCES `t_s_resource` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_s_resource
-- ----------------------------
INSERT INTO `t_s_resource` VALUES ('1', '2014-08-27 16:05:40', 'System', '/', 'System', '1', '1', null);
INSERT INTO `t_s_resource` VALUES ('2', null, null, 'userController.do?goUser', 'User_management', '1', '1', '5');
INSERT INTO `t_s_resource` VALUES ('3', null, null, 'roleController.do?goRole', 'Role_Management', '2', '1', '5');
INSERT INTO `t_s_resource` VALUES ('4', null, null, 'resourceController.do?goResource', 'Menu management', '3', '1', '5');
INSERT INTO `t_s_resource` VALUES ('402881e44cb6a685014cb6a840aa0000', '2015-04-14 17:07:19', 'Basic_information_management', '/', 'Information_management', '2', '1', '1');
INSERT INTO `t_s_resource` VALUES ('402881e44cb71ec1014cb723b7f40000', '2015-04-15 13:55:55', 'Student_Basic_Information_Management', 'studentController.do?goStudent', 'Student_Management', '1', '1', '402881e44cb6a685014cb6a840aa0000');
INSERT INTO `t_s_resource` VALUES ('402881e44cbbe87e014cbbea99a80000', '2015-04-15 15:10:56', 'Score_information_management', 'scoreController.do?goScore', 'Score_Management', '2', '1', '402881e44cb6a685014cb6a840aa0000');
INSERT INTO `t_s_resource` VALUES ('402881e54ce5b4be014ce5b838fa0000', '2015-04-23 17:59:57', 'Teacher_Management', 'teacherController.do?goTeacher', 'Teacher_Management', '3', '1', '402881e44cb6a685014cb6a840aa0000');
INSERT INTO `t_s_resource` VALUES ('5', null, null, '/', 'System Management', '9', '1', '1');

-- ----------------------------
-- Table structure for `t_s_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_s_role`;
CREATE TABLE `t_s_role` (
  `id` varchar(36) NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_s_role
-- ----------------------------
INSERT INTO `t_s_role` VALUES ('1', '2015-04-29 15:14:30', 'Super_administrator', 'admin');
INSERT INTO `t_s_role` VALUES ('402881e54c7e34f6014c7e367bfb0000', '2015-04-07 20:08:41', 'Teacher_role', 'Teacher');

-- ----------------------------
-- Table structure for `t_s_role_resource`
-- ----------------------------
DROP TABLE IF EXISTS `t_s_role_resource`;
CREATE TABLE `t_s_role_resource` (
  `role_id` varchar(36) NOT NULL,
  `resource_id` varchar(36) NOT NULL,
  KEY `FK17BAC656127E527` (`role_id`),
  KEY `FK17BAC653B9CBFA7` (`resource_id`),
  CONSTRAINT `FK17BAC653B9CBFA7` FOREIGN KEY (`resource_id`) REFERENCES `t_s_resource` (`id`),
  CONSTRAINT `FK17BAC656127E527` FOREIGN KEY (`role_id`) REFERENCES `t_s_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_s_role_resource
-- ----------------------------
INSERT INTO `t_s_role_resource` VALUES ('1', '1');
INSERT INTO `t_s_role_resource` VALUES ('1', '402881e44cb6a685014cb6a840aa0000');
INSERT INTO `t_s_role_resource` VALUES ('1', '402881e44cb71ec1014cb723b7f40000');
INSERT INTO `t_s_role_resource` VALUES ('1', '402881e44cbbe87e014cbbea99a80000');
INSERT INTO `t_s_role_resource` VALUES ('1', '402881e54ce5b4be014ce5b838fa0000');
INSERT INTO `t_s_role_resource` VALUES ('1', '5');
INSERT INTO `t_s_role_resource` VALUES ('1', '2');
INSERT INTO `t_s_role_resource` VALUES ('1', '3');
INSERT INTO `t_s_role_resource` VALUES ('1', '4');
INSERT INTO `t_s_role_resource` VALUES ('402881e54c7e34f6014c7e367bfb0000', '402881e44cb71ec1014cb723b7f40000');
INSERT INTO `t_s_role_resource` VALUES ('402881e54c7e34f6014c7e367bfb0000', '402881e44cbbe87e014cbbea99a80000');
INSERT INTO `t_s_role_resource` VALUES ('402881e54c7e34f6014c7e367bfb0000', '1');
INSERT INTO `t_s_role_resource` VALUES ('402881e54c7e34f6014c7e367bfb0000', '402881e44cb6a685014cb6a840aa0000');

-- ----------------------------
-- Table structure for `t_s_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_s_user`;
CREATE TABLE `t_s_user` (
  `id` varchar(36) NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `position` varchar(20) DEFAULT NULL,
  `position_desc` varchar(100) DEFAULT NULL,
  `real_name` varchar(10) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `userName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_s_user
-- ----------------------------
INSERT INTO `t_s_user` VALUES ('1', '2015-04-03 14:32:12', 'ser@bjpowernode.com', '21232f297a57a5a743894a0e4a801fc3', '13918621285', 'CEO', 'CEO', 'Jiaqi_Wang', '1', 'admin');
INSERT INTO `t_s_user` VALUES ('2c9281be62bdaef60162bdd93309000c', '2018-04-13 15:12:30', 'llq@qq.com', '5f8591a3d4fe06393cad53edff27ba05', '13656566562', 'Professor', 'research', 'Joe', '2', 't1');

-- ----------------------------
-- Table structure for `t_s_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_s_user_role`;
CREATE TABLE `t_s_user_role` (
  `user_id` varchar(36) NOT NULL,
  `role_id` varchar(36) NOT NULL,
  KEY `FKD0596186127E527` (`role_id`),
  KEY `FKD059618652A907` (`user_id`),
  CONSTRAINT `FKD0596186127E527` FOREIGN KEY (`role_id`) REFERENCES `t_s_role` (`id`),
  CONSTRAINT `FKD059618652A907` FOREIGN KEY (`user_id`) REFERENCES `t_s_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_s_user_role
-- ----------------------------
INSERT INTO `t_s_user_role` VALUES ('2c9281be62bdaef60162bdd93309000c', '402881e54c7e34f6014c7e367bfb0000');
INSERT INTO `t_s_user_role` VALUES ('1', '1');
