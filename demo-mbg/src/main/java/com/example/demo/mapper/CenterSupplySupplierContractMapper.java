package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierContract;
import com.example.demo.model.CenterSupplySupplierContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierContractMapper {
    long countByExample(CenterSupplySupplierContractExample example);

    int deleteByExample(CenterSupplySupplierContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierContract row);

    int insertSelective(CenterSupplySupplierContract row);

    List<CenterSupplySupplierContract> selectByExample(CenterSupplySupplierContractExample example);

    CenterSupplySupplierContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierContract row, @Param("example") CenterSupplySupplierContractExample example);

    int updateByExample(@Param("row") CenterSupplySupplierContract row, @Param("example") CenterSupplySupplierContractExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierContract row);

    int updateByPrimaryKey(CenterSupplySupplierContract row);
}