package com.gengshuaishuai.pms.example.service;

import com.gengshuaishuai.pms.core.responseresulthandle.ResponseResult;
import com.gengshuaishuai.pms.example.entity.Example;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/26 9:59
 * @description
 */
public interface ExampleService {
    /**
     * show 根据ID查询example
     *
     * @param id
     * @return
     */
    ResponseResult getExample(String id);

    /**
     * show 创建example
     *
     * @param example
     * @return
     */
    ResponseResult createExample(Example example);
}
