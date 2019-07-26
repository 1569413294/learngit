package com.bgs.ggx_demo.Mapper;

import com.bgs.ggx_demo.Pojo.Diqu;
import com.bgs.ggx_demo.Pojo.Emp;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface KsMapper {


    //下拉框地区查询
    @Select("select d_id id,d_nmae dname from d_pei")
    List<Diqu> diqu();
    //精确查询下拉框
    List<Emp> jingquechaxun(Emp emp);

}
