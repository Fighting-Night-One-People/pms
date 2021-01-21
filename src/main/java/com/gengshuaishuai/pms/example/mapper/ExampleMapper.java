package com.gengshuaishuai.pms.example.mapper;

import com.gengshuaishuai.pms.example.entity.Example;

public interface ExampleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Example record);

    int insertSelective(Example record);

    Example selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);
}