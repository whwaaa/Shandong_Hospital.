package com.kkb.service;

import com.kkb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Shandong_Hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
}
