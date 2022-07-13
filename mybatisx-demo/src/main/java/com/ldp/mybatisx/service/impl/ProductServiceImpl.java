package com.ldp.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ldp.mybatisx.bean.Product;
import com.ldp.mybatisx.service.ProductService;
import com.ldp.mybatisx.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Service实现
* @createDate 2022-07-02 08:03:01
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




