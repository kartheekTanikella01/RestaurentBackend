package com.restaurent_spring.restaurent_spring.repository;

import com.restaurent_spring.restaurent_spring.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<user,Long> {
}
