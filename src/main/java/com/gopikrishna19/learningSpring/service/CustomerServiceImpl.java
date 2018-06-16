package com.gopikrishna19.learningSpring.service;

import com.gopikrishna19.learningSpring.model.Customer;
import com.gopikrishna19.learningSpring.repositories.CustomerRepository;
import com.gopikrishna19.learningSpring.repositories.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(HibernateCustomerRepositoryImpl repository) {
        customerRepository = repository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
