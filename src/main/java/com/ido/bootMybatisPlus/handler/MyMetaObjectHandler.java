package com.ido.bootMybatisPlus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 自动填充字段需要设置添加的内容,可根据字段类型对自动填充类型进行修改
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"createTime", Date.class,new Date());
        this.strictInsertFill(metaObject,"updateTime", Date.class,new Date());
        this.strictInsertFill(metaObject, "deleteFlag", Integer.class, 0);
//        this.strictInsertFill(metaObject,"createTime", String.class,sdf.format(new Date()));
//        this.strictInsertFill(metaObject,"updateTime", String.class,sdf.format(new Date()));
    }

    /**
     * 更新字段
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateTime", Date.class,new Date());
//        this.strictUpdateFill(metaObject,"updateTime", String.class,sdf.format(new Date()));
    }
}
