package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
