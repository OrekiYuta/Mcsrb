/*
 Navicat Premium Data Transfer

 Source Server         : Mcsrb-SQLite
 Source Server Type    : SQLite
 Source Server Version : 3030001
 Source Schema         : main

 Target Server Type    : SQLite
 Target Server Version : 3030001
 File Encoding         : 65001

 Date: 09/05/2023 00:24:38
*/

PRAGMA foreign_keys = false;

-- ----------------------------
-- Table structure for TS_MAGIC_API
-- ----------------------------
DROP TABLE IF EXISTS "TS_MAGIC_API";
CREATE TABLE "TS_MAGIC_API" (
  "id" text(32) NOT NULL,
  "device_bind_id" text(32),
  "device_id" text(50),
  "device_name" text(100),
  "device_model" text(50),
  "create_time" text,
  "del_flag" text(1),
  PRIMARY KEY ("id")
);

PRAGMA foreign_keys = true;
