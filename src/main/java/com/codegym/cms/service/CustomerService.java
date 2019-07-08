package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    public Iterable<Customer> findAll();

    public Customer findById(Long id);

    public void save(Customer customer);

    public void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}
