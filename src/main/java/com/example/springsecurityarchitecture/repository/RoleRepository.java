package com.example.springsecurityarchitecture.repository;

import com.example.springsecurityarchitecture.entity.ERole;
import com.example.springsecurityarchitecture.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
