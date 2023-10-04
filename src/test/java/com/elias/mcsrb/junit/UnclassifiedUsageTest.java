package java.com.elias.mcsrb.junit;

import com.elias.mcsrb.entity.TsDeviceBindDetail;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.util.SerializationUtils;

import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
    public void testObjectIsNullTest() {
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
    public void testObjectIsNullThrow() {
//        Integer integer = new Integer(128);
        Integer integer = Integer.valueOf(128);
        Objects.requireNonNull(integer);

        Integer integerNull = null;
//        Objects.requireNonNull(integerNull, "Parameter cannot be empty");
//        Objects.requireNonNull(integerNull, () -> "Parameter cannot be empty");
        assertThrows(NullPointerException.class, () -> Objects.requireNonNull(integerNull, "Parameter cannot be empty"));

    }

    /**
     * @return void
     * @description java.util.Objects / 对象值比较
     * @author OrekiYuta
     * @date 2023/5/29 12:32:03
     */
    @Test
    public void testObjectEquals() {
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
    public void testObjectGetHashCode() {
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
    public void testStringIsNull() {
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
    public void testStringSplit() {
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
    public void testStringIsNumeric() {
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
    public void testStringJoin() {
        List<String> listLeft = Lists.newArrayList("a", "b", "c");
        List<Integer> listRight = Lists.newArrayList(1, 2, 3);
        log.debug("{}", StringUtils.join(listLeft, ","));
        log.debug("{}", StringUtils.join(listRight, " "));
    }

    /**
     * @return void
     * @description org.springframework.util.Assert / 断言抛出异常
     * @author OrekiYuta
     * @date 2023/5/29 15:12:46
     */
    @Test
    public void testAssert() {
        String flag = null;
        String base = "hello";
        Assert.isNull(flag, "flag is null");
        Assert.isNull(flag, () -> "flag is null");
        Assert.notNull(base, "base is not null");
        
        ArrayList<String> arrayList = Lists.newArrayList();
        Map<String, String> map = null;
//        Assert.notEmpty(arrayList, "list is not null");
//        Assert.notEmpty(arrayList, () -> "list is not null");
//        Assert.notEmpty(map, "map is not null");

        assertThrows(IllegalArgumentException.class, () -> Assert.notEmpty(arrayList, "list is not null"));
        assertThrows(IllegalArgumentException.class, () -> Assert.notEmpty(arrayList, () -> "list is not null"));
        assertThrows(IllegalArgumentException.class, () -> Assert.notEmpty(map, "map is not null"));

//        Assert.isTrue(CollectionUtils.isNotEmpty(arrayList), "list is not null");
//        Assert.isTrue(CollectionUtils.isNotEmpty(arrayList), () -> "list is not null");

        assertThrows(IllegalArgumentException.class, () -> Assert.isTrue(CollectionUtils.isNotEmpty(arrayList), "list is not null"));
        assertThrows(IllegalArgumentException.class, () -> Assert.isTrue(CollectionUtils.isNotEmpty(arrayList), () -> "list is not null"));
    }


    /**
     * @return void
     * @description org.springframework.beans.BeanUtils / 对象属性复制
     * @author OrekiYuta
     * @date 2023/5/29 15:42:19
     */
    @Test
    public void testBeanCopy() throws InvocationTargetException, IllegalAccessException {
        TsDeviceBindDetail sourceBean = new TsDeviceBindDetail();
        sourceBean.setId(UUID.randomUUID().toString());
        sourceBean.setDeviceBindId(UUID.randomUUID().toString());
        sourceBean.setDeviceId(UUID.randomUUID().toString());
        sourceBean.setDeviceName("Test");
        sourceBean.setDeviceModel("ADB");
        sourceBean.setCreateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        sourceBean.setDelFlag("Y");

        TsDeviceBindDetail targetBean = new TsDeviceBindDetail();
//        org.apache.commons.beanutils.BeanUtils
//        BeanUtils.copyProperties(targetBean, sourceBean);

//        两个包方法参数位置不同
//        org.springframework.beans.BeanUtils
        BeanUtils.copyProperties(sourceBean, targetBean);
        log.debug("{}", targetBean.getId());
    }


    /**
     * @return void
     * @description org.springframework.beans / BeanUtils 获取类属性操作
     * @author OrekiYuta
     * @date 2023/5/29 16:19:18
     */
    @Test
    public void testBeanHandle() {
//        实例化类
        TsDeviceBindDetail tsDeviceBindDetail = BeanUtils.instantiateClass(TsDeviceBindDetail.class);
        log.debug("{}", tsDeviceBindDetail);

//        获取类指定方法
        Method method = BeanUtils.findDeclaredMethod(TsDeviceBindDetail.class, "getId");
        log.debug("{}", method.getName());

//        获取类指定方法的参数
        PropertyDescriptor propertyForMethod = BeanUtils.findPropertyForMethod(method);
        log.debug("{}", propertyForMethod.getName());

        Method methodB = BeanUtils.findDeclaredMethod(TsDeviceBindDetail.class, "getDeviceName");
        PropertyDescriptor propertyForMethodB = BeanUtils.findPropertyForMethod(methodB);
        log.debug("{}", propertyForMethodB.getName());
    }


    /**
     * @return void
     * @description java.util.Base64 / Base64 encode decode
     * @author OrekiYuta
     * @date 2023/5/29 16:33:26
     */
    @Test
    public void testBase64Encode() throws UnsupportedEncodingException {
        String str = "elias.meta";
        log.debug("{}", "origin：" + str);
//        String encode = new String(Base64Utils.encode(str.getBytes()));
        String encodeToString = Base64.getEncoder().encodeToString(str.getBytes());
        log.debug("{}", "encode：" + encodeToString);

//        String decode = new String(Base64Utils.decode(encode.getBytes()), "utf8");
        byte[] decode = Base64.getDecoder().decode(encodeToString);
//        String decodeToString = new String(decode, "UTF-8");

//        java.nio.charset.StandardCharsets
        String decodeToString = new String(decode, StandardCharsets.UTF_8);
        log.debug("{}", "decode：" + decodeToString);

    }


    /**
     * @return void
     * @description org.apache.commons.codec.digest.DigestUtils / Md5Hex
     * @author OrekiYuta
     * @date 2023/5/29 16:45:12
     */
    @Test
    public void testMd5Hex() {
        String flag = "Metabako";
        String md5Hex = DigestUtils.md5Hex(flag);
        log.debug("{}", md5Hex);
    }

    /**
     * @return void
     * @description org.apache.commons.codec.digest.DigestUtils / Sha256Hex
     * @author OrekiYuta
     * @date 2023/5/29 16:45:32
     */
    @Test
    public void testSha256Hex() {
        String flag = "Metabako";
        String sha256Hex = DigestUtils.sha256Hex(flag);
        log.debug("{}", sha256Hex);
    }


    /**
     * @return void
     * @description org.springframework.util.SerializationUtils / 序列化
     * @author OrekiYuta
     * @date 2023/5/29 17:03:04
     */
    @Test
    public void testSerialize() {
        Map<String, String> map = Maps.newHashMap();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        byte[] serialize = SerializationUtils.serialize(map);
        log.debug("{}", serialize);
        Object deserialize = SerializationUtils.deserialize(serialize);
        log.debug("{}", deserialize);

        Object deserializeApache = org.apache.commons.lang3.SerializationUtils.deserialize(serialize);
        log.debug("{}", deserializeApache);
    }

    //template
    @Test
    public void test() {

    }
}
