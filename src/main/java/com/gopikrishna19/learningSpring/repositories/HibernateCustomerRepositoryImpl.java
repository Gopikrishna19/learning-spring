package com.gopikrishna19.learningSpring.repositories;

import com.gopikrishna19.learningSpring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Gopi");
        customer.setLastName("Krishna");

        customers.add(customer);

        return customers;
    }
}
