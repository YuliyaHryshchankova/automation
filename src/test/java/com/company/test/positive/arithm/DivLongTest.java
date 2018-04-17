package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongTest extends PreConfigCalculations {

    @Test(description = "Test division", dataProvider = "dataProviderForDiv")
    public void testDiv(long a, long b, long expectedResult) {
        long div = calc.div(a, b);
        Assert.assertEquals(div, expectedResult, "Invalid result of division.");

    }

    @Test(dataProvider = "dataProviderForDivByZero", expectedExceptions = NumberFormatException.class)
    public void testDivByZero(long a) {
        calc.div(a, 0);
    }

    @DataProvider(name = "dataProviderForDiv")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 3, 0},
                {6, 2, 3},
                {10, 10, 1},
                {-8, 4, -2},
                {8, -4, -2},
                {-8, -4, 2},
        };
    }

    @DataProvider(name = "dataProviderForDivByZero")
    public Object[] dataProviderByZero() {
        return new Object[]{1, 0, 100, 34};
    }
}


