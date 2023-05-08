/*
 Navicat Premium Data Transfer

 Source Server         : Mcsrb-sqlite
 Source Server Type    : SQLite
 Source Server Version : 3030001
 Source Schema         : main

 Target Server Type    : SQLite
 Target Server Version : 3030001
 File Encoding         : 65001

 Date: 08/05/2023 16:33:09
*/

PRAGMA foreign_keys = false;

-- ----------------------------
-- Table structure for MP_T_USER
-- ----------------------------
DROP TABLE IF EXISTS "MP_T_USER";
CREATE TABLE "MP_T_USER" (
  "id" BIGINT(20) NOT NULL,
  "name" VARCHAR(30) DEFAULT NULL,
  "age" INT(11) DEFAULT NULL,
  "email" VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of MP_T_USER
-- ----------------------------
INSERT INTO "MP_T_USER" VALUES (1, 'Jone', 18, 'test1@baomidou.com');
INSERT INTO "MP_T_USER" VALUES (2, 'Jack', 20, 'test2@baomidou.com');
INSERT INTO "MP_T_USER" VALUES (3, 'Tom', 28, 'test3@baomidou.com');
INSERT INTO "MP_T_USER" VALUES (4, 'Sandy', 21, 'test4@baomidou.com');
INSERT INTO "MP_T_USER" VALUES (5, 'Billie', 24, 'test5@baomidou.com');

PRAGMA foreign_keys = true;
