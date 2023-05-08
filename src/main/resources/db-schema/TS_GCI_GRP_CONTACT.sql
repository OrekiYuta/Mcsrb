/*
 Navicat Premium Data Transfer

 Source Server         : Mcsrb-SQLite
 Source Server Type    : SQLite
 Source Server Version : 3030001
 Source Schema         : main

 Target Server Type    : SQLite
 Target Server Version : 3030001
 File Encoding         : 65001

 Date: 09/05/2023 00:24:44
*/

PRAGMA foreign_keys = false;

-- ----------------------------
-- Table structure for TS_GCI_GRP_CONTACT
-- ----------------------------
DROP TABLE IF EXISTS "TS_GCI_GRP_CONTACT";
CREATE TABLE "TS_GCI_GRP_CONTACT" (
  "ID" integer(20) NOT NULL,
  "CONT_NAME" text(255),
  "CUST_SERVICE_ID" text(255),
  "CONT_TYPE" integer(20),
  "CONT_MOBILE" text(255),
  "CUST_NAME" text(255),
  PRIMARY KEY ("ID")
);

-- ----------------------------
-- Indexes structure for table TS_GCI_GRP_CONTACT
-- ----------------------------
CREATE INDEX "INDEX_CON"
ON "TS_GCI_GRP_CONTACT" (
  "ID" ASC
);

PRAGMA foreign_keys = true;
