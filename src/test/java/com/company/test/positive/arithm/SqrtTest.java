package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends PreConfigCalculations {

    @Test(description = "Test sqrt", dataProvider = "dataProviderForSqrt")
    public void testSqrt(double a, double expectedResult) {
        double sqrt = calc.sqrt(a);
        Assert.assertEquals(sqrt, expectedResult, "Invalid result of sqrt.");
    }

    @DataProvider(name = "dataProviderForSqrt")
    public Object[][] dataProvider() {
        return new Object[][]{
                {16, Math.sqrt(16)},
                {1, Math.sqrt(1)},
                {0, Math.sqrt(0)},
                {0.16, Math.sqrt(0.16)},
                {-16, Math.sqrt(-16)}//bug

        };

    }

}
