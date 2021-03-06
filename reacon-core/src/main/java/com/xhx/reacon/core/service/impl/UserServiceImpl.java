package com.xhx.reacon.core.service.impl;

import com.xhx.reacon.common.base.BaseResponse;
import com.xhx.reacon.common.exception.BusinessException;
import com.xhx.reacon.common.request.SignInRequest;
import com.xhx.reacon.common.request.SignUpRequest;
import com.xhx.reacon.common.request.QueryUserInfoRequest;
import com.xhx.reacon.core.service.UserService;
import com.xhx.reacon.domain.model.User;
import com.xhx.reacon.repository.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserInfo(QueryUserInfoRequest request) {
        List<Long> idList = request.getIdList();
        return userRepository.selectById(idList);
    }

    @Override
    public BaseResponse addNewUser(SignUpRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setInfo(request.getInfo());
        user.setPassword(request.getPassword());
        return BaseResponse.newSuccessResponse()
                .result(userRepository.insert(user))
                .build();
    }

    @Override
    public BaseResponse verifyUser(SignInRequest request) {
        List<User> users = userRepository.selectByName(request.getName());
        //todo
        Boolean done = !CollectionUtils.isEmpty(users)
                && users.get(0).getPassword().equals(request.getPassword());
        //dif
        return BaseResponse.newSuccessResponse()
                .result(done)
                .build();
    }
}
