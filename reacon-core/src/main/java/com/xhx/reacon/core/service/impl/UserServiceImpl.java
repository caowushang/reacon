package com.xhx.reacon.core.service.impl;

import com.xhx.reacon.common.request.AddUserRequest;
import com.xhx.reacon.common.request.ShowUsersRequest;
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
    public List<User> showUsers(ShowUsersRequest request) {
        List<Integer> idList = request.getIdList();
        return userRepository.selectById(idList);
    }

    @Override
    public int addNewUser(AddUserRequest request) {
//        System.out.print(">>>>>>>>>>" + JSONUtils.toJSONString(request));
        User user = new User();
        user.setName(request.getName());
        user.setInfo(request.getInfo());
        return userRepository.insert(user);
    }
}
