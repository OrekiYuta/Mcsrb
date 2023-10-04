package com.elias.mcsrb.junit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author OrekiYuta
 * @description Stream Usage
 * @return
 * @date 2023/5/24 18:09:37
 */
@SpringBootTest
public class StreamUsageTest {

    @Test
    public void test() {

    }


    /***
     * @description anyMatch / allMatch / noneMatch
     *
     * @return void
     * @author OrekiYuta
     * @date 2023/10/5 00:58:09
     */
    @Test
    public void testMatch() {

//        test usage
        List<String> list = new ArrayList<>();
        boolean result1 = list.stream().anyMatch("A"::equals);
        boolean result2 = list.stream().allMatch("B"::equals);
        boolean result3 = list.stream().noneMatch("C"::equals);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        
//        generic usage
        List<String> stringList = Arrays.asList("aBC", "ddd");
        boolean result4 = stringList.stream()
                .filter(string -> string.startsWith("D"))
                .allMatch(string -> string.contains("Z"));

        System.out.println("result4: " + result4);
    }

}
