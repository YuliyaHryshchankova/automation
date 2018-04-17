package com.company.test.negative;

import com.epam.tat.module4.Timeout;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TimeoutTest {
    Timeout timeout;

    @BeforeClass
    public void setUp() {
        timeout = new Timeout();
        System.out.println("@BeforeClass: The annotated method will be run only once before the first test method in the current class is invoked.\n");
    }

    @Test(description = "Test Timeout", timeOut = 1000, expectedExceptions = org.testng.internal.thread.ThreadTimeoutException.class)
    public void testTimeoutTwo() {
        timeout.sleep(2);

    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass: The annotated method will be run only once after all the test methods in the current class have run.\n");
        timeout = null;
    }

}
