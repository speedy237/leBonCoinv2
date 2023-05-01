package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.Annonce;
@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Integer>{
	

}
