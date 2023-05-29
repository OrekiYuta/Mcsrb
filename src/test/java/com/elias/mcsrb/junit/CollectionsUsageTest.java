package com.elias.mcsrb.junit;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    /**
     * @return void
     * @description org.springframework.util.CollectionUtils / 非空校验
     * @author OrekiYuta
     * @date 2023/5/29 11:17:56
     */
    @Test
    public void testCollectionsEmpty() {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        boolean flag = org.springframework.util.CollectionUtils.isEmpty(integerList);
        log.debug("{}", flag);

    }

    /**
     * @return void
     * @description org.apache.commons.collections.CollectionUtils / List 合并操作
     * @author OrekiYuta
     * @date 2023/5/29 11:28:13
     */
    @Test
    public void testCollectionsHandle() {
        List<Integer> leftList = Arrays.asList(2, 3, 4, 5, 9, 7, 8);
        List<Integer> rightList = Arrays.asList(2, 3, 1, 0);

        //获取并集
        Collection<Integer> unionList = CollectionUtils.union(leftList, rightList);
        log.debug("{}", unionList);

        //获取交集
        Collection<Integer> intersectionList = CollectionUtils.intersection(leftList, rightList);
        log.debug("{}", intersectionList);

        //获取交集的补集
        Collection<Integer> disjunctionList = CollectionUtils.disjunction(leftList, rightList);
        log.debug("{}", disjunctionList);

        //获取差集
        Collection<Integer> subtractList = CollectionUtils.subtract(leftList, rightList);
        log.debug("{}", subtractList);
    }


    /**
     * @return void
     * @description com.google.common.collect.Lists / 大集合分成若干个小集合
     * @author OrekiYuta
     * @date 2023/5/29 11:53:01
     */
    @Test
    public void testCollectionsNewList() {
        ArrayList<Integer> integerArrayList = Lists.newArrayList(2, 3, 1, 0);
        log.debug("{}", integerArrayList);
        List<List<Integer>> partitionFi = Lists.partition(integerArrayList, 2);
        log.debug("{}", partitionFi);
        List<List<Integer>> partitionSe = Lists.partition(integerArrayList, 3);
        log.debug("{}", partitionSe);
        List<List<Integer>> partitionTh = Lists.partition(integerArrayList, 4);
        log.debug("{}", partitionTh);
        List<List<Integer>> partitionFo = Lists.partition(integerArrayList, 5);
        log.debug("{}", partitionFo);
    }


    /**
     * @return void
     * @description com.google.common.collect.Lists / List 按要求转换成需要的 List
     * @author OrekiYuta
     * @date 2023/5/29 12:03:22
     */
    @Test
    public void testCollectionsListTransform() {
        ArrayList<String> stringArrayList = Lists.newArrayList("a", "b", "c", "d");
        log.debug("{}", stringArrayList);
        List<String> stringTransform = Lists.transform(stringArrayList, x -> x.toUpperCase());
        log.debug("{}", stringTransform);

        ArrayList<Integer> integerArrayList = Lists.newArrayList(2, 3, 1, 0);
        log.debug("{}", integerArrayList);
        List<Integer> integerTransform = Lists.transform(integerArrayList, x -> x + 2);
        log.debug("{}", integerTransform);
    }


    /**
     * @return void
     * @description com.google.common.collect.Lists / List 反转顺序
     * @author OrekiYuta
     * @date 2023/5/29 12:05:20
     */
    @Test
    public void testCollectionsReverse() {
        ArrayList<Integer> integerArrayList = Lists.newArrayList(2, 3, 1, 0);
        log.debug("{}", integerArrayList);
        List<Integer> reverseList = Lists.reverse(integerArrayList);
        log.debug("{}", reverseList);
    }

    //template
    @Test
    public void testCollections() {

    }
}
