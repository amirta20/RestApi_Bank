package com.example.cc1bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cc1bank.model.Bank;
@Repository

public interface BankRepo extends JpaRepository<Bank,Integer> {
    
}
