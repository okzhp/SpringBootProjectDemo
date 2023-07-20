package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierTypeAptitude;
import com.example.demo.model.CenterSupplySupplierTypeAptitudeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierTypeAptitudeMapper {
    long countByExample(CenterSupplySupplierTypeAptitudeExample example);

    int deleteByExample(CenterSupplySupplierTypeAptitudeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierTypeAptitude row);

    int insertSelective(CenterSupplySupplierTypeAptitude row);

    List<CenterSupplySupplierTypeAptitude> selectByExample(CenterSupplySupplierTypeAptitudeExample example);

    CenterSupplySupplierTypeAptitude selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierTypeAptitude row, @Param("example") CenterSupplySupplierTypeAptitudeExample example);

    int updateByExample(@Param("row") CenterSupplySupplierTypeAptitude row, @Param("example") CenterSupplySupplierTypeAptitudeExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierTypeAptitude row);

    int updateByPrimaryKey(CenterSupplySupplierTypeAptitude row);
}