package com.gengshuaishuai.pms.example.mapper;

import com.gengshuaishuai.pms.example.entity.Example;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Example record);

    /**
     * show 创建example
     *
     * @param record
     * @return
     */
    int insertSelective(Example record);

    /**
     * show 根据主键查询example
     *
     * @param id
     * @return
     */
    Example selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);
}