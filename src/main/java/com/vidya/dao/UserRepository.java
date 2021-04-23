package com.vidya.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidya.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
