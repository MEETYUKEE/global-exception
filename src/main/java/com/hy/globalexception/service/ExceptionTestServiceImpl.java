package com.hy.globalexception.service;

import com.hy.globalexception.config.CustomException;
import org.springframework.stereotype.Service;

/***
 * <p>
 * 异常处理。 service
 * </p>
 * @author hou yi
 * @date 2021/9/30 14:32
 **/
@Service
public class ExceptionTestServiceImpl implements ExceptionTestService{

    @Override
    public void save() {
        // 业务层产生一个异常，让全局异常去捕获。
        int i = 1/0;
    }

    @Override
    public void custom() {
        throw new CustomException("我是一个自定义异常...");
    }
}
