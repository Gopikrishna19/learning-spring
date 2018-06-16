package com.gopikrishna19.learningSpring.repositories;

import com.gopikrishna19.learningSpring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
