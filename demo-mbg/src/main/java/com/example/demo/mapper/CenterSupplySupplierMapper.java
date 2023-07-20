package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplier;
import com.example.demo.model.CenterSupplySupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierMapper {
    long countByExample(CenterSupplySupplierExample example);

    int deleteByExample(CenterSupplySupplierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplier row);

    int insertSelective(CenterSupplySupplier row);

    List<CenterSupplySupplier> selectByExample(CenterSupplySupplierExample example);

    CenterSupplySupplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplier row, @Param("example") CenterSupplySupplierExample example);

    int updateByExample(@Param("row") CenterSupplySupplier row, @Param("example") CenterSupplySupplierExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplier row);

    int updateByPrimaryKey(CenterSupplySupplier row);
}