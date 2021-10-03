package com.switchvov.springboot.remote.deploy.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author switch
 * @since 2021/10/3
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        String hello = "hello " + name;
        log.info(hello);
        return hello;
    }
}
