package com.company.test.positive.logical;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends PreConfigCalculations {

    @Test(dataProvider = "dataForIsPos", groups = {"logicalPositive"})
    public void testIsPositive(long a) {
        boolean isPositive = calc.isPositive(a);
        Assert.assertTrue(isPositive, a + " is not positive");
    }

    @Test(dataProvider = "dataForIsPosForZero")
    public void dataForIsPosForZero(long a) {
        boolean isPositive = calc.isPositive(a);
        Assert.assertFalse(isPositive, a + " is positive");
    }

    @DataProvider(name = "dataForIsPos")
    public Object[] getData() {
        return new Object[]{2, 1, 6, 7, 5, 199};
    }

    @DataProvider(name = "dataForIsPosForZero")
    public Object[] getData2() {
        return new Object[]{0};
    }
}