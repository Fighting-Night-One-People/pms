package com.gengshuaishuai.pms.core.exceptionhandle;

import com.gengshuaishuai.pms.core.exceptionhandle.entity.GlobalErrorEnum;
import com.gengshuaishuai.pms.core.exceptionhandle.entity.CustomException;
import com.gengshuaishuai.pms.core.responseresulthandle.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/25 21:35
 * @description
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandle {
    /**
     * show 处理自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = CustomException.class)
    public ResponseResult customExceptionHandle(CustomException e){
        log.error(e.getErrorMsg(),e);
        return ResponseResult.customException(e);
    }

    /**
     * show 处理其他异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseResult otherExceptionHandle(Exception e){
        log.error(e.getMessage(),e);
        return ResponseResult.otherException(GlobalErrorEnum.INTERNAL_SERVER_ERROR);
    }
}
