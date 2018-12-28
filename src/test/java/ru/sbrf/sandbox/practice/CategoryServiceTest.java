package ru.sbrf.sandbox.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.sbrf.sandbox.practice.entities.Category;
import ru.sbrf.sandbox.practice.service.implement.CategoryServiceImplement;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/practice-servlet.xml"})
public class CategoryServiceTest {

    @Autowired
    CategoryServiceImplement categoryServiceImplement;
    @Autowired
    Category category;

    @Test
    public void addCategoryTest() {
        categoryServiceImplement.addCategory(category);
    }

    @Test
    public void getAllTest() {
        categoryServiceImplement.getAll();
    }

    @Test
    public void getByNameTest() {
        categoryServiceImplement.getByName(category.getName());
    }

    @Test
    public void deleteByNameTest() {
        categoryServiceImplement.deleteByName(category.getName());
    }
}
