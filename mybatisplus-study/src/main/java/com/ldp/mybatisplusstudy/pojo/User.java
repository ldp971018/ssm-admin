package com.ldp.mybatisplusstudy.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.ldp.mybatisplusstudy.enums.SexEnum;
import lombok.*;

/**
 * @author T-liudp
 * @create 2022-06-28 22:23
 */
@Data
//@TableName(value = "user")
public class User {

    //主键注解标识，将属性对应的字段设置为主键，并且设置为自增，默认的是雪花算法生成的主键
    //注意：若设置type为IdType.AUTO，数据库设置的时候必须要定义为自增
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private SexEnum sex;

    @TableLogic
    private Integer isDeleted;

}
