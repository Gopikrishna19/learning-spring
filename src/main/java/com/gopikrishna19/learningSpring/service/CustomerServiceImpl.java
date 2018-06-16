package com.gopikrishna19.learningSpring.service;

import com.gopikrishna19.learningSpring.model.Customer;
import com.gopikrishna19.learningSpring.repositories.CustomerRepository;
import com.gopikrishna19.learningSpring.repositories.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
