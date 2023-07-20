package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierLegalPerson;
import com.example.demo.model.CenterSupplySupplierLegalPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierLegalPersonMapper {
    long countByExample(CenterSupplySupplierLegalPersonExample example);

    int deleteByExample(CenterSupplySupplierLegalPersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierLegalPerson row);

    int insertSelective(CenterSupplySupplierLegalPerson row);

    List<CenterSupplySupplierLegalPerson> selectByExample(CenterSupplySupplierLegalPersonExample example);

    CenterSupplySupplierLegalPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierLegalPerson row, @Param("example") CenterSupplySupplierLegalPersonExample example);

    int updateByExample(@Param("row") CenterSupplySupplierLegalPerson row, @Param("example") CenterSupplySupplierLegalPersonExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierLegalPerson row);

    int updateByPrimaryKey(CenterSupplySupplierLegalPerson row);
}