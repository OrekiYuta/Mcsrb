package com.elias.mcsrb;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class QuickTest {
    public static void main(String[] args) {

//        log.debug("debug");
//        log.info("info");

        String timeStr1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String timeStr2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println("当前时间为:" + timeStr1);
        System.out.println("当前时间为:" + timeStr2);
    }
}
