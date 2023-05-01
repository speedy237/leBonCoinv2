package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
