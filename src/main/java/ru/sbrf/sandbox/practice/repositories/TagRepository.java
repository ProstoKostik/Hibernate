package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.sandbox.practice.entities.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {
}
