package com.project.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.management.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByMobile(String mobile);
}