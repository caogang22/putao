package com.alipay.pojo.goods;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: Administrator
 * @date: 2021/5/29
 * @description:
 */
@Data
@Table(name = "tb_brand")
public class Brand implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String image;

    private String letter;

    private Integer seq;
}
