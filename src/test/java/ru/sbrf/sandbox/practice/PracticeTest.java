package ru.sbrf.sandbox.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/practice-servlet.xml"})
public class PracticeTest {

    @Autowired
    DaoService daoService;

    @Test
    public void smokeTest() {}

    @Test
    public void insertCustomerTest() {
        daoService.addCustomer();
    }

}
