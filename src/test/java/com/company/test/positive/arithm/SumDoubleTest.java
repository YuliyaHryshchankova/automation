package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends PreConfigCalculations {

    @Test(description = "Test sum", dataProvider = "dataProviderForSum")
    public void testSum(double a, double b, double expectedResult) {
        double sum = calc.sum(a, b);
        Assert.assertEquals(sum, expectedResult, "Invalid result of sum.");
    }

    @DataProvider(name = "dataProviderForSum")
    public Object[][] dataProvider() {
        return new Object[][]{
                {-1.8, 2, -1.8 + 2},
                {-1.8, 2, 0.2},//bug
                {-1.8, -2, -1.8 + (-2)},
                {0.4, 0.9, 0.4 + 0.9},
                {2.4, 3.6, 2.4 + 3.6},
                {0, 2.3, 0 + 2.3},
                {0, 0, 0 + 0},
                {0, -2.3, 0 + (-2.3)}
        };
    }


}
