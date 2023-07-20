package com.example.demo.mapper;

import com.example.demo.model.CenterSupplyPermission;
import com.example.demo.model.CenterSupplyPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CenterSupplyPermissionMapper {
    long countByExample(CenterSupplyPermissionExample example);

    int deleteByExample(CenterSupplyPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CenterSupplyPermission row);

    int insertSelective(CenterSupplyPermission row);

    List<CenterSupplyPermission> selectByExample(CenterSupplyPermissionExample example);

    CenterSupplyPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CenterSupplyPermission row, @Param("example") CenterSupplyPermissionExample example);

    int updateByExample(@Param("row") CenterSupplyPermission row, @Param("example") CenterSupplyPermissionExample example);

    int updateByPrimaryKeySelective(CenterSupplyPermission row);

    int updateByPrimaryKey(CenterSupplyPermission row);
}