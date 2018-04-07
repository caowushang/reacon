package com.xhx.reacon.core.service;

import com.xhx.reacon.common.request.AddUserRequest;
import com.xhx.reacon.common.request.ShowUsersRequest;
import com.xhx.reacon.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> showUsers(ShowUsersRequest request);

    int addNewUser(AddUserRequest request);
}
