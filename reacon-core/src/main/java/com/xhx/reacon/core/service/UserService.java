package com.xhx.reacon.core.service;

import com.xhx.reacon.domain.model.User;

import java.util.List;

public interface UserService {
    List<User> showUsers(List<Integer> idList);
    int addNewUser(User user);
}
