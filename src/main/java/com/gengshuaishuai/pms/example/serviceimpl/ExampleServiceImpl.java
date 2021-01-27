package com.gengshuaishuai.pms.example.serviceimpl;

import com.gengshuaishuai.pms.core.responseresulthandle.ResponseResult;
import com.gengshuaishuai.pms.example.entity.Example;
import com.gengshuaishuai.pms.example.mapper.ExampleMapper;
import com.gengshuaishuai.pms.example.service.ExampleService;
import com.gengshuaishuai.pms.util.DisposeUtil;
import org.springframework.stereotype.Service;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/26 9:59
 * @description
 */
@Service
public class ExampleServiceImpl implements ExampleService {
    private final ExampleMapper mapper;

    public ExampleServiceImpl(ExampleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseResult getExample(String id) {
        Example example = mapper.selectByPrimaryKey(id);
        return ResponseResult.successBuild(example);
    }

    @Override
    public ResponseResult createExample(Example example) {
        String id = DisposeUtil.generateUUID();
        example.setId(id);
        int count = mapper.insertSelective(example);
        return ResponseResult.successBuild(count);
    }
}
