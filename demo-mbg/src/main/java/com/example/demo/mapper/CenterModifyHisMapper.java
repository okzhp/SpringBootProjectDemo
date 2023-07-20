package com.example.demo.mapper;

import com.example.demo.model.CenterModifyHis;
import com.example.demo.model.CenterModifyHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterModifyHisMapper {
    long countByExample(CenterModifyHisExample example);

    int deleteByExample(CenterModifyHisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterModifyHis row);

    int insertSelective(CenterModifyHis row);

    List<CenterModifyHis> selectByExampleWithBLOBs(CenterModifyHisExample example);

    List<CenterModifyHis> selectByExample(CenterModifyHisExample example);

    CenterModifyHis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterModifyHis row, @Param("example") CenterModifyHisExample example);

    int updateByExampleWithBLOBs(@Param("row") CenterModifyHis row, @Param("example") CenterModifyHisExample example);

    int updateByExample(@Param("row") CenterModifyHis row, @Param("example") CenterModifyHisExample example);

    int updateByPrimaryKeySelective(CenterModifyHis row);

    int updateByPrimaryKeyWithBLOBs(CenterModifyHis row);

    int updateByPrimaryKey(CenterModifyHis row);
}