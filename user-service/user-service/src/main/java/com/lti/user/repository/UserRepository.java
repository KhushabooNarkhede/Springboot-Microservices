package com.lti.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserId(Long userId);

}
