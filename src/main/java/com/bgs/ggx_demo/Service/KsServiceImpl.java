package com.bgs.ggx_demo.Service;


import com.bgs.ggx_demo.Mapper.KsMapper;
import com.bgs.ggx_demo.Pojo.Diqu;
import com.bgs.ggx_demo.Pojo.Emp;
import com.bgs.ggx_demo.Pojo.PageBean;
import com.bgs.ggx_demo.Pojo.PageInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KsServiceImpl {

    @Autowired
    private KsMapper ksMapper;


    //地区下拉框查询
    public List<Diqu> diqu() {
        return ksMapper.diqu();
    }

    public PageInfo<Emp>  selectYearHonor(Emp emp,int page, int pageSize)throws Exception{
        //设置分页信息，分别是当前页数和每页显示的总记录数
        // 【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(page, pageSize);
        List<Emp> list = this.ksMapper.jingquechaxun(emp);       //全部
        //返回的是一个PageInfo,包含了分页的所有信息
        PageInfo<Emp> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
