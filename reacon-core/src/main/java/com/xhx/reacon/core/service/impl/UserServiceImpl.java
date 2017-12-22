package com.xhx.reacon.core.service.impl;

import com.xhx.reacon.core.service.UserService;
import com.xhx.reacon.domain.model.User;
import com.xhx.reacon.repository.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> showUsers(List<Integer> idList) {
        return userRepository.selectById(idList);
    }

    @Override
    public int addNewUser(User user) {
        return userRepository.insert(user);
    }
}
