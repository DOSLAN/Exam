package com.example.customerslist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerslistRepository extends JpaRepository<Customer, Long> {
}
