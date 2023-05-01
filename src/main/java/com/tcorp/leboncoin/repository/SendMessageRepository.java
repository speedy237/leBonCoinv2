package com.tcorp.leboncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcorp.leboncoin.entity.SendMessage;
@Repository
public interface SendMessageRepository extends JpaRepository<SendMessage, Integer>{

}
