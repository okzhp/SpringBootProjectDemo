package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierLicense;
import com.example.demo.model.CenterSupplySupplierLicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierLicenseMapper {
    long countByExample(CenterSupplySupplierLicenseExample example);

    int deleteByExample(CenterSupplySupplierLicenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierLicense row);

    int insertSelective(CenterSupplySupplierLicense row);

    List<CenterSupplySupplierLicense> selectByExample(CenterSupplySupplierLicenseExample example);

    CenterSupplySupplierLicense selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierLicense row, @Param("example") CenterSupplySupplierLicenseExample example);

    int updateByExample(@Param("row") CenterSupplySupplierLicense row, @Param("example") CenterSupplySupplierLicenseExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierLicense row);

    int updateByPrimaryKey(CenterSupplySupplierLicense row);
}