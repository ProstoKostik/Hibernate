package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.sandbox.practice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
