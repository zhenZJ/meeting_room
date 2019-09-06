/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.dao;

import org.springframework.stereotype.Repository;

import com.zm.core.base.dao.BaseMapper;
import com.zm.mr.model.Role;
import com.zm.mr.model.RoleExample;

@Repository("roleMapper")
public interface RoleMapper extends BaseMapper<Role, RoleExample, Integer> {
}