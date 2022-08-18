package com.newland.oauth2server.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leell
 * Date: 2022/8/18 17:12:46
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 获取当前user
     *
     * @param authentication
     * @return java.lang.String
     * @author wanglufei
     * @date 2022/4/11 8:09 PM
     */
    @RequestMapping("/getCurrentUser")
    //authentication 认证
    public Object getCurrentUser(Authentication authentication) {
        return authentication.getPrincipal();
    }

}
