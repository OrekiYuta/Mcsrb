package com.elias.mcsrb.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author OrekiYuta
 * @description Collections Usage
 * @date 2023/5/24 17:59:50
 */
@Slf4j
public class CollectionsUsageTest {

    /**
     * @return void
     * @description java.util.Collections / List 排序
     * @author OrekiYuta
     * @date 2023/5/24 17:55:35
     */
    @Test
    public void testCollectionsSort() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        log.debug("{}", integerList);
        Collections.sort(integerList);
        log.debug("{}", integerList);
        Collections.reverse(integerList);
        log.debug("{}", integerList);
    }

    /**
     * @return void
     * @description java.util.Collections / List 最大值，最小值
     * @author OrekiYuta
     * @date 2023/5/24 23:21:35
     */
    @Test
    public void testCollectionsMaxOrMin() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        Integer max = Collections.max(integerList);
        Integer min = Collections.min(integerList);
        log.debug("Max is {},Min is {}", max, min);
    }

    /**
     * @return void
     * @description java.util.Collections / List 转换成线程安全 List
     * @author OrekiYuta
     * @date 2023/5/24 23:23:48
     */
    @Test
    public void testCollectionsSynchronized() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        List<Integer> integerListSynchronized = Collections.synchronizedList(integerList);
        log.debug("{}", integerListSynchronized);

    }

    /**
     * @return void
     * @description java.util.Collections / 返回空 List
     * @author OrekiYuta
     * @date 2023/5/24 23:29:19
     */
    @Test
    public void testCollectionsReturnEmpty() {
        ArrayList<String> arrayList = new ArrayList<>();

        if (arrayList == null || arrayList.size() == 0) {
            log.debug("{}", Collections.emptyList());
        }
    }

    /**
     * @return void
     * @description java.util.Collections / 二分查找，找到该元素的在 List 中的位置
     * @author OrekiYuta
     * @date 2023/5/24 23:33:11
     */
    @Test
    public void testCollectionsBinarySearch() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        int i = Collections.binarySearch(integerList, 7);
        log.debug("index is {}", i);
    }

    /**
     * @return void
     * @description java.util.Collections / 为了防止后续的程序把某个集合的结果修改了，有时候我们需要把某个集合定义成不可修改的
     * @author OrekiYuta
     * @date 2023/5/24 23:36:29
     */
    @Test
    public void testCollectionsUnmodifiable() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        Collections.unmodifiableList(integerList);
        log.debug("{}", integerList);
        integerList.add(6);
        log.debug("{}", integerList);
    }

    //template
    @Test
    public void testCollections() {

    }
}
