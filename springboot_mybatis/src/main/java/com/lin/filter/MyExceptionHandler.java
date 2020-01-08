package com.lin.filter;


import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author: liulei
 * @date: 2020/1/8 0008 下午 4:21
 * @describe:
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {
@ExceptionHandler
@ResponseBody
public String ErrorHandler(AuthorizationException e) {
//        log.error("没有通过权限验证！", e);
        return "没有通过权限验证！";
        }
        }
