package com.gengshuaishuai.pms.core.exceptionhandle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/25 21:10
 * @description
 */
@Getter
@AllArgsConstructor
public enum GlobalErrorEnum {
    /**
     * 数据操作错误定义
     */
    SUCCESS(200,"成功"),
    NO_AUTH(401,"未登录"),
    NO_PERMISSION(403,"没有权限"),
    NOT_FOUNT(404,"找不到资源"),
    INTERNAL_SERVER_ERROR(500,"服务器异常,请联系管理员");
    /**
     * 错误码
     */
    private Integer errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;
}
