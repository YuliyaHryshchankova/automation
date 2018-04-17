package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongTest extends PreConfigCalculations {

    @Test(description = "Test multiplication", dataProvider = "dataProviderForMult")
    public void testMult(long a, long b, long expectedResult) {
        long mult = calc.mult(a, b);
        Assert.assertEquals(mult, expectedResult, "Invalid result of multiplication.");
    }

    @DataProvider(name = "dataProviderForMult")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3, 2, 3 * 2},
                {0, 5, 0 * 5},
                {0, 0, 0 * 0},
                {-16, 2, (-16) * 2},
                {1, 12, 1 * 12},
                {-2, -2, (-2) * (-2)}
        };
    }
}
