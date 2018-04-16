package com.xhx.reacon.core.service;

import com.xhx.reacon.common.request.SignInRequest;
import com.xhx.reacon.common.request.SignUpRequest;
import com.xhx.reacon.common.request.QueryUserInfoRequest;
import com.xhx.reacon.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserInfo(QueryUserInfoRequest request);

    Boolean addNewUser(SignUpRequest request);

    Boolean verifyUser(SignInRequest request);
}
