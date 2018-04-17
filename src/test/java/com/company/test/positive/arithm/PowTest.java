package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends PreConfigCalculations {

    @Test(description = "Test pow", dataProvider = "dataProviderForPow")
    public void testPow(double a, double b, double expectedResult) {
        double pow = calc.pow(a, b);
        Assert.assertEquals(pow, expectedResult, "Invalid result of pow.");
    }

    @DataProvider(name = "dataProviderForPow")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, 0, Math.pow(0, 0)},
                {3, 2, Math.pow(3, 2)},
                {0, 5, Math.pow(0, 5)},
                {6, 0, Math.pow(6, 0)},
                {-6.4, 0, Math.pow(-6.4, 0)},
                {7, 1, Math.pow(7, 1)},
                {4, -1, Math.pow(4, -1)},
                {4, 0.5, Math.pow(4, 0.5)},//bug
                {4, -0.5, Math.pow(4, -0.5)},//bug
                {1, 7, Math.pow(1, 7)},
                {0.5, 3, Math.pow(0.5, 3)},
                {0.3, 0.2, Math.pow(0.3, 0.2)}//bug

        };

    }


}
