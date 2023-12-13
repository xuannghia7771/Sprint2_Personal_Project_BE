package com.example.dawhey.user.repository;

import com.example.dawhey.user.model.ERole;
import com.example.dawhey.user.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByRoleName(ERole roleName);
}
