package com.liuh.mapper;

import com.liuh.pojo.Role;

/**
 * @PackageName: com.liuh.mapper
 * @FileName: RoleMapper
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/3
 */
public interface RoleMapper {


    /**
     * 新增角色
     *
     * @param role
     * @return
     */
    boolean insertRole(Role role);

    /**
     * 查询角色
     *
     * @param id
     * @return
     */
    Role selectRole(int id);


}
