package com.example.demo.mapper;

import com.example.demo.model.CenterSupplyProductTag;
import com.example.demo.model.CenterSupplyProductTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplyProductTagMapper {
    long countByExample(CenterSupplyProductTagExample example);

    int deleteByExample(CenterSupplyProductTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplyProductTag row);

    int insertSelective(CenterSupplyProductTag row);

    List<CenterSupplyProductTag> selectByExample(CenterSupplyProductTagExample example);

    CenterSupplyProductTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplyProductTag row, @Param("example") CenterSupplyProductTagExample example);

    int updateByExample(@Param("row") CenterSupplyProductTag row, @Param("example") CenterSupplyProductTagExample example);

    int updateByPrimaryKeySelective(CenterSupplyProductTag row);

    int updateByPrimaryKey(CenterSupplyProductTag row);
}