package com.elias.mcsrb.junit;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author OrekiYuta
 * @description Unclassified simple code usage
 * @date 2023/5/29 12:21:05
 */
@Slf4j
public class UnclassifiedUsageTest {

    /**
     * @return void
     * @description java.util.Objects / 非空检验
     * @author OrekiYuta
     * @date 2023/5/29 12:24:04
     */
    @Test
    public void ObjectIsNullTest() {
//        Integer integer = new Integer(1);
        Integer integer = Integer.valueOf(1);
        if (Objects.isNull(integer)) {
            log.debug("Objects is null");
        }

        if (Objects.nonNull(integer)) {
            log.debug("Objects is not null");
        }
    }

    /**
     * @return void
     * @description java.util.Objects / 空值抛出异常
     * @author OrekiYuta
     * @date 2023/5/29 12:28:22
     */
    @Test
    public void ObjectIsNullThrow() {
//        Integer integer = new Integer(128);
        Integer integer = Integer.valueOf(128);
        Objects.requireNonNull(integer);

        Integer integerNull = null;
        Objects.requireNonNull(integerNull, "Parameter cannot be empty");
//        Objects.requireNonNull(integerNull, () -> "Parameter cannot be empty");
    }

    /**
     * @return void
     * @description java.util.Objects / 对象值比较
     * @author OrekiYuta
     * @date 2023/5/29 12:32:03
     */
    @Test
    public void ObjectEquals() {
        Integer integerBase = Integer.valueOf(1);
        Integer integerLeft = Integer.valueOf(3);
        Integer integerRight = Integer.valueOf(1);
        Integer integerBottom = Integer.valueOf(-1);

        boolean flagL = Objects.equals(integerBase, integerLeft);
        boolean flagR = Objects.equals(integerBase, integerRight);
        boolean flagB = Objects.equals(integerBase, integerBottom);

        log.debug("{}", flagL);
        log.debug("{}", flagR);
        log.debug("{}", flagB);
    }

    /**
     * @return void
     * @description java.util.Objects / 获取 hashCode
     * @author OrekiYuta
     * @date 2023/5/29 12:34:12
     */
    @Test
    public void ObjectGetHashCode() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        int hashCode = Objects.hashCode(integerList);
        log.debug("{}", hashCode);
    }

    /**
     * @return void
     * @description org.apache.commons.lang3.StringUtils / 字符串非空检验
     * @author OrekiYuta
     * @date 2023/5/29 13:10:27
     */
    @Test
    public void StringIsNull() {
        String strNull = null;
        String strA = "";
        String strB = " ";
        String strC = "abc";
        log.debug("isEmpty: {},{},{},{}",
                StringUtils.isEmpty(strNull),
                StringUtils.isEmpty(strA),
                StringUtils.isEmpty(strB),
                StringUtils.isEmpty(strC));
        log.debug("isBlank: {},{},{},{}",
                StringUtils.isBlank(strNull),
                StringUtils.isBlank(strA),
                StringUtils.isBlank(strB),
                StringUtils.isBlank(strC));

        log.debug("isNotEmpty: {},{},{},{}",
                StringUtils.isNotEmpty(strNull),
                StringUtils.isNotEmpty(strA),
                StringUtils.isNotEmpty(strB),
                StringUtils.isNotEmpty(strC));
        log.debug("isNotBlank: {},{},{},{}",
                StringUtils.isNotBlank(strNull),
                StringUtils.isNotBlank(strA),
                StringUtils.isNotBlank(strB),
                StringUtils.isNotBlank(strC));

    }

    /**
     * @return void
     * @description org.apache.commons.lang3.StringUtils / 字符串分隔
     * @author OrekiYuta
     * @date 2023/5/29 13:19:51
     */
    @Test
    public void StringSplit() {
        String strBase = null;
//        Implicit call to 'toString()' on array returned by call to 'StringUtils.split(strBase, ",")'
        String[] splitBase = StringUtils.split(strBase, ",");
        log.debug("{}", splitBase);
        log.debug("{}", (Object) splitBase);

//        java.lang.NullPointerException: Cannot invoke "String.split(String)" because "strBase" is null
//        String[] split = strBase.split(",");

        String strLeft = "hello,word";
        String[] splitLeft = StringUtils.split(strLeft, ",");
        log.debug("{}", splitLeft);
        log.debug("{}", (Object) splitLeft);
        log.debug("{}", StringUtils.split(strLeft, ","));
    }

    /***
     * @description org.apache.commons.lang3.StringUtils / 判断字符串是否为纯数字
     *
     * @return void
     * @author OrekiYuta
     * @date 2023/5/29 13:21:35
     */
    @Test
    public void StringIsNumeric() {
        String strA = "123";
        String strB = "123q";
        String strC = "0.33";
        log.debug("{}", StringUtils.isNumeric(strA));
        log.debug("{}", StringUtils.isNumeric(strB));
        log.debug("{}", StringUtils.isNumeric(strC));
    }


    /**
     * @return void
     * @description org.apache.commons.lang3.StringUtils / List 内容拼接组合
     * @author OrekiYuta
     * @date 2023/5/29 13:23:52
     */
    @Test
    public void StringJoin() {
        List<String> listLeft = Lists.newArrayList("a", "b", "c");
        List<Integer> listRight = Lists.newArrayList(1, 2, 3);
        log.debug("{}", StringUtils.join(listLeft, ","));
        log.debug("{}", StringUtils.join(listRight, " "));
    }

    //template
    @Test
    public void test() {

    }
}
