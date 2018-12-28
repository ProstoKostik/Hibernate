package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.sandbox.practice.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
