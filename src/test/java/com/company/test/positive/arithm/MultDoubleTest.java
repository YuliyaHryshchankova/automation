package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleTest extends PreConfigCalculations {

    @Test(description = "Test multiplication", dataProvider = "dataProviderForMult")
    public void testMult(double a, double b, double expectedResult) {
        double mult = calc.mult(a, b);
        Assert.assertEquals(mult, expectedResult, "Invalid result of multiplication.");
    }

    @DataProvider(name = "dataProviderForMult")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0.3, 0, 0},
                {0, 0, 0},
                {-1, 5.3, -5.3},
                {0.4, 0.11, 0.044},
                {0.5, 12, 6},
                {-2.2, -2.2, 4.84}
        };
    }
}
