package com.ido.bootMybatisPlus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan("xxx.mapper") 扫描也可以写在这里，我们在启动类已经写了 所以这注释掉
public class MyConfig {


    /**
     * mybatis-plus分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
