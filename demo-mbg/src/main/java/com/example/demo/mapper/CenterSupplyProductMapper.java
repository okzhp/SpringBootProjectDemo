package com.example.demo.mapper;

import com.example.demo.model.CenterSupplyProduct;
import com.example.demo.model.CenterSupplyProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplyProductMapper {
    long countByExample(CenterSupplyProductExample example);

    int deleteByExample(CenterSupplyProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplyProduct row);

    int insertSelective(CenterSupplyProduct row);

    List<CenterSupplyProduct> selectByExampleWithBLOBs(CenterSupplyProductExample example);

    List<CenterSupplyProduct> selectByExample(CenterSupplyProductExample example);

    CenterSupplyProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplyProduct row, @Param("example") CenterSupplyProductExample example);

    int updateByExampleWithBLOBs(@Param("row") CenterSupplyProduct row, @Param("example") CenterSupplyProductExample example);

    int updateByExample(@Param("row") CenterSupplyProduct row, @Param("example") CenterSupplyProductExample example);

    int updateByPrimaryKeySelective(CenterSupplyProduct row);

    int updateByPrimaryKeyWithBLOBs(CenterSupplyProduct row);

    int updateByPrimaryKey(CenterSupplyProduct row);
}