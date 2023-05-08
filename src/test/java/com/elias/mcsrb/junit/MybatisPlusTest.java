package com.elias.mcsrb.junit;


import com.elias.mcsrb.entity.User;
import com.elias.mcsrb.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybatisPlusFirstRun() {
        log.info("Start: Test MybatisPlus first run");
        List<User> userList = userMapper.selectList(null);
        assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        log.info("End: MybatisPlus first run");
    }



}
