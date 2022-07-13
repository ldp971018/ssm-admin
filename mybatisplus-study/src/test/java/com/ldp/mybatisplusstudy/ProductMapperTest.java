package com.ldp.mybatisplusstudy;

import com.ldp.mybatisplusstudy.mapper.ProductMapper;
import com.ldp.mybatisplusstudy.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author T-liudp
 * @create 2022-06-30 23:49
 */
@SpringBootTest
public class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;


    @Test
    public void selectProduct(){

        Product productLi = productMapper.selectById(1L);
        System.out.println("productLi.getPrice() = " + productLi.getPrice());
        Product productWang = productMapper.selectById(1L);
        System.out.println("productWang.getPrice() = " + productWang.getPrice());
        //小李加+50
        productLi.setPrice(productLi.getPrice()+50);
        productMapper.updateById(productLi);

        //小wang加-30
        productWang.setPrice(productWang.getPrice()-30);
        int result = productMapper.updateById(productWang);
        if (result == 0){
            Product productWangNew = productMapper.selectById(1L);
            productWangNew.setPrice(productWangNew.getPrice()-30);
             productMapper.updateById(productWangNew);
        }

        //老板查询价格
        Product productBoss = productMapper.selectById(1L);
        System.out.println("productBoss.getPrice() = " + productBoss.getPrice());
    }
}
