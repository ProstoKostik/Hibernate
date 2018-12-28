package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.sandbox.practice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
