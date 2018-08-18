package com.lxl.utils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt>UserController</dt>
 * <dd>@auther lixinlong</dd>
 * <dd>@create 2018/8/14</dd>
 * <dd></dd>
 * </dl>
 */
@SuppressWarnings("all")
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }
}
