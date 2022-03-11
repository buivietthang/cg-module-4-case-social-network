package com.example.casesocialnetwork.service.roleService;

import com.example.casesocialnetwork.model.Role;
import com.example.casesocialnetwork.service.GeneralService;

public interface RoleService extends GeneralService<Role> {
    Role getById(Long id);
}
