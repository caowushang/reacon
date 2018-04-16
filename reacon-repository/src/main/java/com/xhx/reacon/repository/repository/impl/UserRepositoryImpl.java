package com.xhx.reacon.repository.repository.impl;

import com.xhx.reacon.domain.model.User;
import com.xhx.reacon.domain.model.UserExample;
import com.xhx.reacon.repository.mapper.UserMapper;
import com.xhx.reacon.repository.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectById(List<Long> idList) {
        if(CollectionUtils.isEmpty(idList)) {
            return Lists.newArrayList();
        }
        UserExample example = new UserExample();
        example.createCriteria()
                .andIdIn(idList)
                .andIsDeleteEqualTo(false);
        return userMapper.selectByExample(example);
    }

    @Override
    public List<User> selectByName(String name) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andNameEqualTo(name)
                .andIsDeleteEqualTo(false);
        return userMapper.selectByExample(example);
    }

    @Override
    public Boolean insert(User record) {
        Date nowDate = new Date();
        record.setCreateAt(nowDate);
        record.setUpdateAt(nowDate);
        userMapper.insertSelective(record);
        return !record.getId().equals(0L);
    }
}
