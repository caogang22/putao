package com.alipay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alipay.dao.BrandMapper;
import com.alipay.pojo.goods.Brand;
import com.alipay.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: Administrator
 * @date: 2021/5/29
 * @description:
 */
@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Brand brand) {
        brandMapper.insert(brand);
    }

    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    @Override
    public void delete(Integer id) {
        brandMapper.deleteByPrimaryKey(id);
    }
}
