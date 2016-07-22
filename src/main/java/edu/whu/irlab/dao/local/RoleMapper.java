package edu.whu.irlab.dao.local;

import edu.whu.irlab.dao.LocalMapper;
import edu.whu.irlab.model.local.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends LocalMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}