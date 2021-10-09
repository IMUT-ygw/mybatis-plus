package com.ido.bootMybatisPlus;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.ido.bootMybatisPlus.mapper.UserMapper;
import com.ido.bootMybatisPlus.pojo.UserDiy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootMybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //测试方法
    @Test
    void contextLoads() {
        System.out.println("==========查询所有数据============");
        List<UserDiy> users = userMapper.selectList(null);
        for (UserDiy user : users) {
            System.out.println(user);
        }
    }


}
