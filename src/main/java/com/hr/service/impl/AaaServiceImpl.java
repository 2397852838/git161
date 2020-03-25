package com.hr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hr.entity.Aaa;
import com.hr.dao.AaaDao;
import com.hr.service.AaaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Aaa)表服务实现类
 *
 * @author makejava
 * @since 2020-03-23 18:14:09
 */
@Service
public class AaaServiceImpl extends ServiceImpl<AaaDao,Aaa> implements AaaService {

    @Override
    public List<Aaa> findall() {
        return this.getBaseMapper().findall();
    }

}