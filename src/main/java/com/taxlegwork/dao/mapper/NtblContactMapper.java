package com.taxlegwork.dao.mapper;

import com.taxlegwork.dao.model.contact.NtblContact;
import com.taxlegwork.dao.model.contact.NtblContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NtblContactMapper {
    int countByExample(NtblContactExample example);

    int deleteByExample(NtblContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NtblContact record);

    int insertSelective(NtblContact record);

    List<NtblContact> selectByExample(NtblContactExample example);

    NtblContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NtblContact record, @Param("example") NtblContactExample example);

    int updateByExample(@Param("record") NtblContact record, @Param("example") NtblContactExample example);

    int updateByPrimaryKeySelective(NtblContact record);

    int updateByPrimaryKey(NtblContact record);
}