package com.bgs.ggx_demo.controller;

import com.bgs.ggx_demo.Pojo.Diqu;
import com.bgs.ggx_demo.Pojo.Emp;
import com.bgs.ggx_demo.Pojo.PageBean;
import com.bgs.ggx_demo.Pojo.PageInfo;
import com.bgs.ggx_demo.Service.KsServiceImpl;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 控制
 * @Author: 高贵鑫
 * @date: 2019-07-19 11:16
 */
@Controller
public class KsController {

    @Autowired
    private KsServiceImpl ksService;
    //地区名称查询
    @RequestMapping("xialakuang")
    @ResponseBody
    public List<Diqu> xialakuang(){
        return ksService.diqu();
    }


    /*
     * @author Mr.Gao
     * @date 2019/7/24 20:43
     * @param [emp, page, pageSize]
     * @return com.bgs.ggx_demo.Pojo.PageInfo<com.bgs.ggx_demo.Pojo.Emp>
     */
    @ResponseBody
    @RequestMapping("/selectYearHonor")
    public PageInfo<Emp> selectYearHonor(Emp emp,@RequestParam(required = true, defaultValue = "1") int page, @RequestParam(required = true, defaultValue = "2") int pageSize) throws Exception {
        return this.ksService.selectYearHonor(emp,page, pageSize);
    }

}
