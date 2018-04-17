package com.company.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public class PreConfigCalculations {
    protected Calculator calc;

    @BeforeClass
    public void setUpBeforeClass() {
        calc = new Calculator();
        System.out.println("@BeforeClass: The annotated method will be run only once before the first test method in the current class is invoked.\n");
    }

    @BeforeMethod(groups = {"logicalPositive", "logicalNegative"})
    public void setUpBeforeMethod() {
        calc = new Calculator();
        System.out.println("@BeforeMethod: The annotated method will be run before each test method.\n");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass: The annotated method will be run only once after all the test methods in the current class have run.\n");
        calc = null;
    }


}
