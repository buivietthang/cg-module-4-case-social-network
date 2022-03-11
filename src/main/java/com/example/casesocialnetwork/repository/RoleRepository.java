package com.example.casesocialnetwork.repository;

import com.example.casesocialnetwork.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role getById(Long id);
}
