package com.elias.mcsrb;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class QuickTest {
    public static void main(String[] args) {

//        log.debug("debug");
//        log.info("info");

//        String timeStr1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        String timeStr2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
//        System.out.println("当前时间为:" + timeStr1);
//        System.out.println("当前时间为:" + timeStr2);

        String no = "no";
        String email = "email";
        List<String> list = Arrays.asList(Optional.ofNullable(no).orElse(null), Optional.ofNullable(email).orElse(null));
//        log.debug("{}", list);
        log.debug("{}", list.stream().filter(Objects::nonNull).collect(Collectors.joining(",")));


        String nullName = "hello";
        String name = Optional.ofNullable(nullName).orElse("");
        System.out.println(name);

    }
}
