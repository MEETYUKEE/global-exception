package com.hy.globalexception.controller;

import com.hy.globalexception.config.ResultWrapper;
import com.hy.globalexception.service.ExceptionTestService;
import com.hy.globalexception.vo.ParamVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/***
 * <p>
 *  异常测试 控制器
 * </p>
 * @author hou yi
 * @date 2021/9/30 14:29
 **/
@RestController
@RequestMapping("exceptionTest")
public class ExceptionTestController {

    @Resource
    private ExceptionTestService exceptionTestService;

    @GetMapping
    public ResultWrapper<Object> find() {
        // 这里定义产生一个异常，让全局异常去捕获
        int i = 1/0;
        return ResultWrapper.successBuilder(null);
    }

    @PostMapping
    public ResultWrapper<Object> save() {
        // 异常定义在业务层。
        exceptionTestService.save();
        return ResultWrapper.successBuilder(null);
    }

    @PostMapping("custom")
    public ResultWrapper<Object> custom() {
        // 业务层 抛出一个 自定义异常
        exceptionTestService.custom();
        return ResultWrapper.successBuilder(null);
    }

    @PostMapping("validate")
    public ResultWrapper<Object> custom(@RequestBody @Valid ParamVo paramVo) {
        // ParamVo 中参数校验失败，抛出异常， 由 ValidateHandler 处理
        return ResultWrapper.successBuilder(null);
    }

}
