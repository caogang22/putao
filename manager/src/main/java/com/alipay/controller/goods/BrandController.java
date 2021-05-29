package com.alipay.controller.goods;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alipay.entity.Result;
import com.alipay.pojo.goods.Brand;
import com.alipay.service.goods.BrandService;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Administrator
 * @date: 2021/5/29
 * @description:
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @GetMapping("/findById")
    public Brand findById(Integer id){
        return brandService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Brand brand){
        brandService.add(brand);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Brand brand){
        brandService.update(brand);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Integer id){
        brandService.delete(id);
        return new Result();
    }
}
