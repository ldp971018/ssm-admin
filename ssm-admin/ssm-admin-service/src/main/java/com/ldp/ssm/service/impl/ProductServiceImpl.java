package com.ldp.ssm.service.impl;

import com.ldp.ssm.dao.IProductDao;
import com.ldp.ssm.domain.Product;
import com.ldp.ssm.service.IProductService;
import com.ldp.ssm.domain.Product;
import com.ldp.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }
}
