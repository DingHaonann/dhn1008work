package com.kgc.mapper;

import com.kgc.pojo.Bill_type;
import com.kgc.pojo.Bill_typeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Bill_typeMapper {
    int countByExample(Bill_typeExample example);

    int deleteByExample(Bill_typeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bill_type record);

    int insertSelective(Bill_type record);

    List<Bill_type> selectByExample(Bill_typeExample example);

    Bill_type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bill_type record, @Param("example") Bill_typeExample example);

    int updateByExample(@Param("record") Bill_type record, @Param("example") Bill_typeExample example);

    int updateByPrimaryKeySelective(Bill_type record);

    int updateByPrimaryKey(Bill_type record);
}