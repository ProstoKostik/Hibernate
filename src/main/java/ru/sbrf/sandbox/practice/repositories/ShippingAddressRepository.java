package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.sandbox.practice.entities.ShippingAddress;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Integer> {
}
