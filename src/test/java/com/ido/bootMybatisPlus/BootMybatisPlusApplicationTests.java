package com.ido.bootMybatisPlus;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.ido.bootMybatisPlus.mapper.TestMybatisPlusUserMapper;
import com.ido.bootMybatisPlus.mapper.UserMapper;
import com.ido.bootMybatisPlus.pojo.TestMybatisPlusUser;
import com.ido.bootMybatisPlus.pojo.UserDiy;
import com.ido.bootMybatisPlus.service.TestMybatisPlusUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;

@SpringBootTest
class BootMybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TestMybatisPlusUserService testMybatisPlusUserService;

    //测试方法
    @Test
    void contextLoads() {
        System.out.println("==========查询所有数据============");
        List<UserDiy> users = userMapper.selectList(null);
        for (UserDiy user : users) {
            System.out.println(user);
        }
    }

    @Test
    void insert(){
        System.out.println("==============测试字段自动填充(添加)================");
        TestMybatisPlusUser user = new TestMybatisPlusUser();
        user.setName("ygw").setAge(23).setEmail("1600034569qq.com");
        if(testMybatisPlusUserService.save(user)){
            testMybatisPlusUserService.list().forEach(System.out::println);
        }else{
            System.out.println("添加数据失败");
        }
    }

    @Test
    void update(){
        System.out.println("==============测试字段自动填充(修改)================");
        TestMybatisPlusUser user = new TestMybatisPlusUser();
        user.setId(1446763897926213633L);
        if(testMybatisPlusUserService.updateById(user)){
            testMybatisPlusUserService.list().forEach(System.out::println);
        }else{
            System.out.println("修改数据失败");
        }
    }



    @Test
    void delete(){
        System.out.println("==============测试逻辑删除字段(数据库物理层面不删除数据，只是查询数据时对逻辑删除的数据进行屏蔽)================");
        TestMybatisPlusUser user = new TestMybatisPlusUser();
        user.setId(1446763897926213633L);
        if(testMybatisPlusUserService.removeById(user)){
            testMybatisPlusUserService.list().forEach(System.out::println);
        }else{
            System.out.println("逻辑删除数据失败");
        }
    }



}
