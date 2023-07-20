package com.example.demo.mapper;

import com.example.demo.model.CenterSupplySupplierPeople;
import com.example.demo.model.CenterSupplySupplierPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplySupplierPeopleMapper {
    long countByExample(CenterSupplySupplierPeopleExample example);

    int deleteByExample(CenterSupplySupplierPeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplySupplierPeople row);

    int insertSelective(CenterSupplySupplierPeople row);

    List<CenterSupplySupplierPeople> selectByExample(CenterSupplySupplierPeopleExample example);

    CenterSupplySupplierPeople selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplySupplierPeople row, @Param("example") CenterSupplySupplierPeopleExample example);

    int updateByExample(@Param("row") CenterSupplySupplierPeople row, @Param("example") CenterSupplySupplierPeopleExample example);

    int updateByPrimaryKeySelective(CenterSupplySupplierPeople row);

    int updateByPrimaryKey(CenterSupplySupplierPeople row);
}