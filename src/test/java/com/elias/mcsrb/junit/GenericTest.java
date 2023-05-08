package com.elias.mcsrb.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

@Slf4j
public class GenericTest {

    @Test
    public void springVersionInfo() {
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        log.info("Spring -v " + springVersion);
        log.info("SpringBoot -v " + springBootVersion);
    }
}