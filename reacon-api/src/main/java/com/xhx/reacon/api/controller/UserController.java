package com.xhx.reacon.api.controller;

import com.xhx.reacon.common.request.SignInRequest;
import com.xhx.reacon.common.request.SignUpRequest;
import com.xhx.reacon.common.request.QueryUserInfoRequest;
import com.xhx.reacon.core.service.UserService;
import com.xhx.reacon.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/sign/up", method = RequestMethod.POST)
    public Boolean signUp(@RequestBody @Valid SignUpRequest request) {
        return userService.addNewUser(request);
    }

    @ResponseBody
    @RequestMapping(value = "/sign/in", method = RequestMethod.POST)
    public Boolean signIn(@RequestBody @Valid SignInRequest request) {
        return userService.verifyUser(request);
    }

    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public List<User> addUser(@RequestBody @Valid QueryUserInfoRequest request) {
        return userService.getUserInfo(request);
    }


}
