package com.taiji.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.taiji.model.auto.User;
import com.taiji.mapper.auto.UserMapper;
import com.taiji.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Allen
 * @since 2020-02-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser() {
       return userMapper.selectList(
                new QueryWrapper<User>().eq("age",1)
        );
    }

    @Override
    @Cacheable(value = "111", key = "111222")
    public List<User> list() {
        return userMapper.list();
    }
}
