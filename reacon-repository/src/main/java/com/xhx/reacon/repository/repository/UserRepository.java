package com.xhx.reacon.repository.repository;

import com.xhx.reacon.domain.model.User;

import java.util.List;

public interface UserRepository {
    List<User> selectById(List<Integer> idList);

    int insert(User user);
}
