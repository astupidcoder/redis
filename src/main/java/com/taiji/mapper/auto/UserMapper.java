package com.taiji.mapper.auto;

import com.taiji.model.auto.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Allen
 * @since 2020-02-28
 */
public interface UserMapper extends BaseMapper<User> {

public List<User>list();
}
