package com.gengshuaishuai.pms.core.exceptionhandle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/25 21:03
 * @description
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomException extends RuntimeException{
    /**
     * 错误码
     */
    private Integer errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;
}
