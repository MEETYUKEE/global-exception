package com.hy.globalexception.config;

import com.hy.globalexception.enums.StatusCodeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/***
 * <p>
 * 接口、异常返回格式封装类
 * </p>
 * @author hou yi
 * @date 2021/9/30 14:58
 **/
@Data
@Accessors(chain = true)
public class ResultWrapper<T> implements Serializable {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示语
     */
    private String msg;

    /**
     * 数据
     * */
    private T data;

    /***
     * 请求成功。无返回数据值
     * @return 、
     */
    public static <T> ResultWrapper<T> successBuilder(T t){
        return new ResultWrapper<T>()
                .setCode(StatusCodeEnum.SUCCESS.getCode())
                .setMsg(StatusCodeEnum.SUCCESS.getMsg())
                .setData(t);
    }

    /***
     * 请求失败。无返回数据值
     * @return 、
     */
    public static <T>  ResultWrapper<T> failBuilder(T t){
        return new ResultWrapper<T>()
                .setCode(StatusCodeEnum.FAIL.getCode())
                .setMsg(StatusCodeEnum.FAIL.getMsg())
                .setData(t);
    }


}
