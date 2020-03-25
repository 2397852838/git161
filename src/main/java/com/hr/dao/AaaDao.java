package com.hr.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.entity.Aaa;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Aaa)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-23 18:14:08
 */
@Mapper
public interface AaaDao extends BaseMapper<Aaa> {

    public List<Aaa> findall();
}