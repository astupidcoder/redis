package com.taiji.service;

import com.taiji.model.auto.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Allen
 * @since 2020-02-28
 */
public interface IUserService extends IService<User> {

    public List<User> getUser();
}
