package ru.sbrf.sandbox.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.sbrf.sandbox.practice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("select c from Category c where c.name = :name")
    Category findByName(@Param("name") String name);

    @Modifying
    @Transactional
    @Query("delete from Category c where c.name = :name")
    void deleteByName(@Param("name") String name);
}
