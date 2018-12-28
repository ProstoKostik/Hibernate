package ru.sbrf.sandbox.practice.service;

import ru.sbrf.sandbox.practice.entities.Category;

import java.util.List;

public interface CategoryService {

    void addCategory(Category category);

    void deleteByName(String name);

    Category getByName(String name);

    List<Category> getAll();
}
