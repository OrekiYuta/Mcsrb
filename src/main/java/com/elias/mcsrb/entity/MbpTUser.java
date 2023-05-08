package com.elias.mcsrb.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 *
 * </p>
 *
 * @author OrekiYuta
 * @since 2023-05-08
 */
@TableName("MBP_T_USER")
@ApiModel(value = "MbpTUser对象", description = "")
public class MbpTUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer age;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MbpTUser{" +
                "id = " + id +
                ", name = " + name +
                ", age = " + age +
                ", email = " + email +
                "}";
    }
}
