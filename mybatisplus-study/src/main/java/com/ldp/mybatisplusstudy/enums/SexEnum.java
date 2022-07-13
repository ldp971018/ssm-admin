package com.ldp.mybatisplusstudy.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @author T-liudp
 * @create 2022-07-01 0:02
 */
@Getter
public enum SexEnum {

    MALE(1,"男"),
    FEMALE(2,"女");

    //使用枚举值需要添加注解  @EnumValue 指定字段的值插入到数据库中
    //还需要配置全局的一个变量，扫描该枚举所在的包
    @EnumValue
    private Integer sex;

    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }



}
