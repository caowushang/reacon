package com.xhx.reacon.api.controller;

import com.xhx.reacon.common.request.AddUserRequest;
import com.xhx.reacon.common.request.ShowUsersRequest;
import com.xhx.reacon.core.service.UserService;
import com.xhx.reacon.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserManagerController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Integer addUser(@RequestBody AddUserRequest request) {
        return userService.addNewUser(request);
    }

    @ResponseBody
    @RequestMapping(value = "/showUsers", method = RequestMethod.POST)
    public List<User> addUser(@RequestBody ShowUsersRequest request) {
        return userService.showUsers(request);
    }


}
