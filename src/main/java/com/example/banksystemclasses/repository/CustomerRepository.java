package com.example.banksystemclasses.repository;

import com.example.banksystemclasses.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
