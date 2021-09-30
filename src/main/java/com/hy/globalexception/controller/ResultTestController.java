package com.hy.globalexception.controller;

import com.hy.globalexception.config.ResultWrapper;
import com.hy.globalexception.service.ExceptionTestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/***
 * <p>
 *  统一返回值格式 测试 控制器
 * </p>
 * @author hou yi
 * @date 2021/9/30 14:29
 **/
@RestController
@RequestMapping("resultTest")
public class ResultTestController {

    @GetMapping
    public ResultWrapper<Object> find() {
        // 注：实际开发中业务不在这里写，这里主要是方便测试
        Map<String, Object> map = new HashMap<>();
        map.put("name", "百里守约");
        map.put("level", "T0");
        map.put("property", "射手");

        return ResultWrapper.successBuilder(map);
    }

}
