package com.example.customerslist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerslistRepository extends JpaRepository<Customer, Long> {
    @Override
    List<Customer> findAll();

    @Override
    <S extends Customer> S save(S entity);
}
