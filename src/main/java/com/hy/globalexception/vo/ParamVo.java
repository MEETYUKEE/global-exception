package com.hy.globalexception.vo;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/***
 * <p>
 * 工具类
 * </p>
 * @author hou yi
 * @date 2021/9/30 15:37
 **/
@Data
public class ParamVo implements Serializable {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Max(value = 40, message = "年龄最大不能超过40岁")
    @Min(value = 20, message = "年龄最小不能小于20岁")
    private Integer age;

}
