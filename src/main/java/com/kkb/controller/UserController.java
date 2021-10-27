package com.kkb.controller;

import com.kkb.service.UserService;
import com.kkb.vo.AjaxResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Shandong_Hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

}
