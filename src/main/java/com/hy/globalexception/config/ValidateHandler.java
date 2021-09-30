package com.hy.globalexception.config;

import com.hy.globalexception.enums.StatusCodeEnum;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/***
 * <p>
 * 参数校验异常统一处理
 * </p>
 * @author hou yi
 * @date 2021/9/30 15:23
 **/
@ControllerAdvice
@SuppressWarnings("all")
public class ValidateHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        final StringBuilder builder = new StringBuilder();
        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            final String message = fieldError.getDefaultMessage();
            builder.append(message);
            break;
        }
        return ResponseEntity.ok(new ResultWrapper()
                .setCode(StatusCodeEnum.PARAMETER_ERROR.getCode())
                .setMsg(builder.toString()));
    }
}
