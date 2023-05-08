package com.elias.mcsrb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author OrekiYuta
 * @since 2023-05-08
 */
@RestController
@RequestMapping("/mbpTUser")
public class MbpTUserController {

    @GetMapping("hello")
    public String testMybatisPlusResponse(){
        return "Hello Mybatis Plus";
    }
}
