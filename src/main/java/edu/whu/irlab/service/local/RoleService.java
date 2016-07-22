package edu.whu.irlab.service.local;

import edu.whu.irlab.model.local.Role;

/**
 * Created by Roger on 2016/5/24.
 */
public interface RoleService {
    public int deleteByPrimaryKey(Integer id);

    public int insert(Role record);

    public int insertSelective(Role record);

    public Role selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Role record);

    public int updateByPrimaryKey(Role record);
}
