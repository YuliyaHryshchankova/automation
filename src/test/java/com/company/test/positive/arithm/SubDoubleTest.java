package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleTest extends PreConfigCalculations {

    @Test(description = "Test sub", dataProvider = "dataProviderForSub")
    public void testSub(double a, double b, double expectedResult) {
        double sub = calc.sub(a, b);
        Assert.assertEquals(sub, expectedResult, "Invalid result of sub.");
    }

    @DataProvider(name = "dataProviderForSub")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3.2, 2, 3.2 - 2},
                {3.2, 2, 1.2},//bug
                {0, 5.7, 0 - 5.7},
                {0, 0, 0 - 0},
                {0, -0.7, 0 - (-0.7)},
                {-16, -7.7, -16 - (-7.7)},
                {-12.5, -12.5, -12.5 - (-12.5)}
        };
    }
}
