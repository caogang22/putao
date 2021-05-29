package com.alipay.service.goods;

import com.alipay.pojo.goods.Brand;

public interface BrandService {

    public Brand findById(Integer id);

    public void add(Brand brand);


    public void update(Brand brand);


    public void delete(Integer id);
}
