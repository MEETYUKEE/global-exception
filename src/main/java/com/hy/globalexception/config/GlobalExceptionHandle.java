package com.hy.globalexception.config;

import com.hy.globalexception.enums.StatusCodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/***
 * <p>
 *  控制层全局异常处理
 * </p>
 * @author hou yi
 * @date 2021/9/30 15:23
 **/
@RestControllerAdvice
@SuppressWarnings("all")
public class GlobalExceptionHandle {

    @ExceptionHandler(RuntimeException.class)
    public ResultWrapper<Object> customException(RuntimeException e) {
        return new ResultWrapper()
                .setCode(StatusCodeEnum.GLOBAL_EXCEPTION.getCode())
                .setMsg(e.getMessage());
    }

}
