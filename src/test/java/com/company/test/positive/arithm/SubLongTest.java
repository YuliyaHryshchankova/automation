package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongTest extends PreConfigCalculations {

    @Test(description = "Test sub", dataProvider = "dataProviderForSub")
    public void testSub(long a, long b, long expectedResult) {
        long sub = calc.sub(a, b);
        Assert.assertEquals(sub, expectedResult, "Invalid result of sub.");
    }

    @DataProvider(name = "dataProviderForSub")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3, 2, 3 - 2},
                {4, 5, 4 - 5},
                {-16, -7, -16 - (-7)},
                {-5, 12, -5 - 12},
                {0, 0, 0 - 0},
                {0, 1, 0 - 1},
                {0, -1, 0 - (-1)},
                {100, 100, 100 - 100},
        };
    }
}