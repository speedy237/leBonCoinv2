package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.Visitor;
@Repository
public interface VisitorRepository extends JpaRepository<Visitor,Integer>{

}
