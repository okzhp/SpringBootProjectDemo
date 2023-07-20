package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierAndProductType;
import com.example.demo.model.CenterSupplySupplierAndProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierAndProductTypeMapper {
    long countByExample(CenterSupplySupplierAndProductTypeExample example);

    int deleteByExample(CenterSupplySupplierAndProductTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierAndProductType row);

    int insertSelective(CenterSupplySupplierAndProductType row);

    List<CenterSupplySupplierAndProductType> selectByExample(CenterSupplySupplierAndProductTypeExample example);

    CenterSupplySupplierAndProductType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierAndProductType row, @Param("example") CenterSupplySupplierAndProductTypeExample example);

    int updateByExample(@Param("row") CenterSupplySupplierAndProductType row, @Param("example") CenterSupplySupplierAndProductTypeExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierAndProductType row);

    int updateByPrimaryKey(CenterSupplySupplierAndProductType row);
}