package com.hr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hr.entity.Aaa;
import java.util.List;

/**
 * (Aaa)表服务接口
 *
 * @author makejava
 * @since 2020-03-23 18:14:09
 */
public interface AaaService extends IService<Aaa> {

    public List<Aaa> findall();
}