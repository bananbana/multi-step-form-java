package com.dawid.multistepform.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //retrieve all customers and their details from database
    @GetMapping("/customers")
    public List<Customer> getAll() {
        return this.customerService.findAll();
    }

    //retrieve a specific customer by provided id
    @GetMapping("/customers/{id}")
    public Customer getOne(@PathVariable("id") Long id) {
        return customerService.getCustomerById(id);
    }

    //post customer details to database
    @PostMapping("/customers")
    public Customer create(@RequestBody Customer customer) {
        return this.customerService.createOne(customer);
    }

    //delete specific customer
    @DeleteMapping("/customers/{id}")
    public void removeCustomer(@PathVariable("id") Long id) {
        customerService.deleteOne(id);
    }

    //update customer details in database
    @PutMapping("/customers")
    public Customer update(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return customer;
    }
    
}
