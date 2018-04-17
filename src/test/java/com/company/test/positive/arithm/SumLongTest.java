package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongTest extends PreConfigCalculations {

    @Test(description = "Test sum", dataProvider = "dataProviderForSum")
    public void testSum(long a, long b, long expectedResult) {
        long sum = calc.sum(a, b);
        Assert.assertEquals(sum, expectedResult, "Invalid result of sum.");
    }

    @DataProvider(name = "dataProviderForSum")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3, 2, 3 + 2},
                {4, -5, 4 + (-5)},
                {-6, 7, -6 + 7},
                {0, 2, 0 + 2},
                {0, 0, 0 + 0},
                {0, -10, 0 + (-10)},
                {-1, -3, -1 + (-3)},


        };
    }

}
