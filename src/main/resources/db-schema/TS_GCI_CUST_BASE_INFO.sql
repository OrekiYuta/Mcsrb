/*
 Navicat Premium Data Transfer

 Source Server         : Mcsrb-SQLite
 Source Server Type    : SQLite
 Source Server Version : 3030001
 Source Schema         : main

 Target Server Type    : SQLite
 Target Server Version : 3030001
 File Encoding         : 65001

 Date: 09/05/2023 00:24:52
*/

PRAGMA foreign_keys = false;

-- ----------------------------
-- Table structure for TS_GCI_CUST_BASE_INFO
-- ----------------------------
DROP TABLE IF EXISTS "TS_GCI_CUST_BASE_INFO";
CREATE TABLE "TS_GCI_CUST_BASE_INFO" (
  "ID" integer(11) NOT NULL,
  "CUST_SERVICE_ID" text(255),
  "CUST_NAME" text(255),
  "CODE" text(255),
  "GROUP_CUST_LEVEL" text(100),
  "CUST_ID" text(100),
  "ORGANIZE_ID" integer(20),
  "ORGANIZE_NAME" text(255),
  PRIMARY KEY ("ID")
);

-- ----------------------------
-- Indexes structure for table TS_GCI_CUST_BASE_INFO
-- ----------------------------
CREATE INDEX "INDEX_INFO"
ON "TS_GCI_CUST_BASE_INFO" (
  "ID" ASC
);

PRAGMA foreign_keys = true;
