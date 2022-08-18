package com.newland.oauth2resource.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leell
 * Date: 2022/8/18 17:06:32
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String index(@RequestParam("code") String code) {
        SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "login success";
    }
}
