package edu.whu.irlab.dao.local;

import edu.whu.irlab.dao.LocalMapper;
import edu.whu.irlab.model.local.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserMapper extends LocalMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);

    User selectWithRolesByUsername(String username);

    Set<String> selectRolesByUsername(String username);

    List<User> selectAll();
}