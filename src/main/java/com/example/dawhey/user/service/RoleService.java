package com.example.dawhey.user.service;

import com.example.dawhey.user.model.ERole;
import com.example.dawhey.user.model.Roles;

import java.util.Optional;

public interface RoleService {
    Optional<Roles> findByRoleName(ERole roleName);
}
