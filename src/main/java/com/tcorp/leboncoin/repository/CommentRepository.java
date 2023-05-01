package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
