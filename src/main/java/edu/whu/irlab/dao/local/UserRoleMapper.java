package edu.whu.irlab.dao.local;

import edu.whu.irlab.dao.LocalMapper;
import edu.whu.irlab.model.local.UserRoleKey;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper extends LocalMapper{
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);
}