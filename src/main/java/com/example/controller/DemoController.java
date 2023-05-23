package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nie
 */
@Slf4j
@RestController
@RequestMapping(value = "/demo")
public class DemoController {


    @GetMapping("/hello")
    public String hello(int id, Integer iId) {
        // id不是包装类型，不传会报错，但可以@RequestParam(required = false) int id, 指定id可以为空
        // iId 不能为null
        Assert.notNull(iId, "ERROR: iId should not be null");
        log.info("cmd=toHello, id={}, iId={}, 返回 hello", id, iId);
        return "Hello！";
    }
}
