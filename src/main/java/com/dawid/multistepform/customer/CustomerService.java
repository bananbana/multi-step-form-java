package com.dawid.multistepform.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
return customerRepository.findById(id).get();
    }

    public Customer createOne(Customer customer) {
        return this.customerRepository.save(customer);
    }   
    
    public void deleteOne(Long id) {
        customerRepository.deleteById(id);
    }
//why no working?? :C
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}

