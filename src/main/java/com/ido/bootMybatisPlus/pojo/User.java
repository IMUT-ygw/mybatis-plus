package com.ido.bootMybatisPlus.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;
}