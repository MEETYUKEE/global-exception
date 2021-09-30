package com.hy.globalexception.config;

/***
 * <p>
 *  自定义异常
 * </p>
 * @author hou yi
 * @date 2021/9/30 15:23
 **/
public class CustomException extends RuntimeException{

    public CustomException(String msg){
        super(msg);
    }

}
