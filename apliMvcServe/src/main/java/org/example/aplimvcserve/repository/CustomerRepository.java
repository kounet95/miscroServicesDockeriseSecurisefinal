package org.example.aplimvcserve.repository;


import org.example.aplimvcserve.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
