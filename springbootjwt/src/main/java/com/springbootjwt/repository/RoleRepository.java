package com.springbootjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjwt.model.*;

public interface RoleRepository extends JpaRepository<Role,Long>
{
	Optional<Role> findByName(String name);
}
