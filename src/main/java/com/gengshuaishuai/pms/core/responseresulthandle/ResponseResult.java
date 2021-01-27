package com.gengshuaishuai.pms.core.responseresulthandle;

import com.gengshuaishuai.pms.core.exceptionhandle.entity.GlobalErrorEnum;
import com.gengshuaishuai.pms.core.exceptionhandle.entity.CustomException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/25 20:50
 * @description
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {
    /**
     * 是否成功
     */
    private boolean ok;
    /**
     * 数据
     */
    private Object data;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;

    public static ResponseResult build(boolean ok,Object data,Integer code,String msg){
        return new ResponseResult(ok,data,code,msg);
    }

    /**
     * show 正常返回结果
     * 
     * @param object
     * @return
     */
    public static ResponseResult successBuild(Object object){
        return new ResponseResult(true,object,null,null);
    }

    /**
     * show 自定义异常返回结果
     *
     * @param customException
     * @return
     */
    public static ResponseResult customException(CustomException customException){
        return build(false,null,customException.getErrorCode(),customException.getErrorMsg());
    }

    /**
     * show 其他异常返回结果
     *
     * @param globalErrorEnum
     * @return
     */
    public static ResponseResult otherException(GlobalErrorEnum globalErrorEnum){
        return build(false,null,globalErrorEnum.getErrorCode(),globalErrorEnum.getErrorMsg());
    }
}
