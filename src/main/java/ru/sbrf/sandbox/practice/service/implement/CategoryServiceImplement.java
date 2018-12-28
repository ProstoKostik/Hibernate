package ru.sbrf.sandbox.practice.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.sandbox.practice.entities.Category;
import ru.sbrf.sandbox.practice.repositories.CategoryRepository;
import ru.sbrf.sandbox.practice.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImplement implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceImplement() {
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteByName(String name) {
        categoryRepository.deleteByName(name);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getByName(String name) {
        return categoryRepository.findByName(name);
    }
}
