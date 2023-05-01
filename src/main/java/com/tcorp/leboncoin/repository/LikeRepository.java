package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.Like;
@Repository
public interface LikeRepository extends JpaRepository<Like, Integer>{

}
