package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.sandbox.practice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
