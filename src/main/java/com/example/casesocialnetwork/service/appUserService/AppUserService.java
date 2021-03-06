package com.example.casesocialnetwork.service.appUserService;

import com.example.casesocialnetwork.model.AppUser;
import com.example.casesocialnetwork.model.Role;
import com.example.casesocialnetwork.service.GeneralService;

public interface AppUserService extends GeneralService<AppUser> {
    AppUser getUserByUsername(String username);

    Iterable<AppUser> getAllByRoleId(Long id);

    AppUser getCurrentUser();

    Iterable<AppUser> getAllByRoleIsNotContaining(Long id);

    Iterable<AppUser> getAllByNameIsContaining(String name);

    Iterable<AppUser> getAllByRoleOrRole(Role role1, Role role2);
}
