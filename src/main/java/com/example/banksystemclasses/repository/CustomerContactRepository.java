package com.example.banksystemclasses.repository;

import com.example.banksystemclasses.model.CustomerContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerContactRepository extends JpaRepository<CustomerContact, Long>
{

}
