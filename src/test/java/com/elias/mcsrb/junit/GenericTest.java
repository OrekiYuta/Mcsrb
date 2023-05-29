package com.elias.mcsrb.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

/**
 * @author OrekiYuta
 * @description Generic
 * @date 2023/5/24 18:04:06
 */
@Slf4j
public class GenericTest {

    /**
     * @return void
     * @description spring / springboot version
     * @author OrekiYuta
     * @date 2023/5/24 18:07:58
     */
    @Test
    public void springVersionInfo() {
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        log.info("Spring -v " + springVersion);
        log.info("SpringBoot -v " + springBootVersion);
    }
}
