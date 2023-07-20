package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierBankAccount;
import com.example.demo.model.CenterSupplySupplierBankAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierBankAccountMapper {
    long countByExample(CenterSupplySupplierBankAccountExample example);

    int deleteByExample(CenterSupplySupplierBankAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierBankAccount row);

    int insertSelective(CenterSupplySupplierBankAccount row);

    List<CenterSupplySupplierBankAccount> selectByExample(CenterSupplySupplierBankAccountExample example);

    CenterSupplySupplierBankAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierBankAccount row, @Param("example") CenterSupplySupplierBankAccountExample example);

    int updateByExample(@Param("row") CenterSupplySupplierBankAccount row, @Param("example") CenterSupplySupplierBankAccountExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierBankAccount row);

    int updateByPrimaryKey(CenterSupplySupplierBankAccount row);
}