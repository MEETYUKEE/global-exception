package com.hy.globalexception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/***
 * <p>
 * 统一返回值状态码
 * </p>
 * @author hou yi
 * @date 2021/7/24 19:13
 **/
@Getter
@AllArgsConstructor
public enum StatusCodeEnum {
    /**
     * 描述
     */
    PARAMETER_ERROR(102, "参数错误"),
    SUCCESS(200, "请求成功"),
    GLOBAL_EXCEPTION(301, "统一异常处理"),
    FAIL(500, "请求失败"),
    ;

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 状态描述
     */
    private final String msg;
}