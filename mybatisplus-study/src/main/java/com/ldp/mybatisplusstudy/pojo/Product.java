package com.ldp.mybatisplusstudy.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author T-liudp
 * @create 2022-06-30 23:47
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;
}

