package com.dawid.multistepform.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  //Do I need this?
  // List<Customer> findByLastName(String lastName);

  // Customer findById(long id);
} 

