package com.springbootjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjwt.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{
	Optional<User> findByEmailAddress (String emailAddress);
}
