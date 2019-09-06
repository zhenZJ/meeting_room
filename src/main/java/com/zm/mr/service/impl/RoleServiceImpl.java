/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.service.impl;

import com.zm.core.base.service.impl.BaseServiceImpl;
import com.zm.mr.dao.RoleMapper;
import com.zm.mr.model.Role;
import com.zm.mr.model.RoleExample;
import com.zm.mr.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, RoleExample, Integer> implements RoleService {
    
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    public RoleMapper roleMapper;

    @Autowired
    public void setMapper() {
        super.setMapper(roleMapper);
    }
}