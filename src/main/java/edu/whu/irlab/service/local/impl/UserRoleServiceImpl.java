package edu.whu.irlab.service.local.impl;

import edu.whu.irlab.dao.local.UserRoleMapper;
import edu.whu.irlab.model.local.UserRoleKey;
import edu.whu.irlab.service.local.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Roger on 2016/5/24.
 */
@Service("UserRoleService")
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int deleteByPrimaryKey(UserRoleKey key) {
        return userRoleMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(UserRoleKey record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRoleKey record) {
        return userRoleMapper.insertSelective(record);
    }
}
