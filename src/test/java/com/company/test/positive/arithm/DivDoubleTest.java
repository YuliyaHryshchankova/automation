package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleTest extends PreConfigCalculations {

    @Test(description = "Test division", dataProvider = "dataProviderForDiv")
    public void testDiv(double a, double b, double expectedResult) {
        double div = calc.div(a, b);
        Assert.assertEquals(div, expectedResult, "Invalid result of division.");
    }

    @Test(dataProvider = "dataProviderForDivByZero")
    public void testDivByZero(double a, double b, double res) {
        double result = calc.div(a, b);
        Assert.assertEquals(result, res);
    }

    @DataProvider(name = "dataProviderForDiv")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0.0, 3.0, (0.0 / 3.0)},
                {6.2, 2.30, (6.2 / 2.3)},
                {10.0, 10.0, (10.0 / 10.0)},
                {-8.6, 4, (-8.6 / 4)},
                {8.0, -4.0, (8.0 / (-4.0))},
                {-8.0, -4.0, ((-8.0) / (-4.0))},
        };
    }

    @DataProvider(name = "dataProviderForDivByZero")
    public Object[][] dataProviderDivZero() {
        return new Object[][]{
                {1.0, 0.0, Double.POSITIVE_INFINITY},
                {0.0, 0.0, Double.NaN}
        };
    }
}