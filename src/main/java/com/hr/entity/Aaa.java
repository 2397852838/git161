package com.hr.entity;

import java.io.Serializable;

/**
 * (Aaa)实体类
 *
 * @author makejava
 * @since 2020-03-23 18:14:07
 */
public class Aaa implements Serializable {
    private static final long serialVersionUID = -57954466091490786L;
    /**
    * 主键
    */
    private Object id;
    /**
    * 姓名
    */
    private String name;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}