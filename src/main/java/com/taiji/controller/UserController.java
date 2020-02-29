package com.taiji.controller;


import com.taiji.config.ResultInfo;
import com.taiji.config.Status;
import com.taiji.model.auto.User;
import com.taiji.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Allen
 * @since 2020-02-28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("/getUserList")
    public ResultInfo getUserList()throws Exception{

       List<User>userList= userService.list();
       return new ResultInfo(Status.SUCCESS).result(userList);

    }
}
