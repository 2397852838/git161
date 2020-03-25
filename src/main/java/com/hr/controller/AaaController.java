package com.hr.controller;

import com.hr.entity.Aaa;
import com.hr.service.AaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Aaa)表控制层
 *
 * @author makejava
 * @since 2020-03-23 18:14:09
 */
@Controller
@RequestMapping("/aaa")
public class AaaController {
    /**
     * 服务对象
     */
    @Autowired
    private AaaService aaaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/find")
    public ModelAndView selectOne(Object id) {
        ModelAndView mv = new ModelAndView("aaa/list");
        List<Aaa> list = aaaService.findall();
        System.out.println(list);
        mv.addObject("list",list);
        return mv;
    }

}