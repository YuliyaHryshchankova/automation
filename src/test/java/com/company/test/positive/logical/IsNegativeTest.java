package com.company.test.positive.logical;

import com.company.test.PreConfigCalculations;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends PreConfigCalculations {

    @Test(dataProvider = "dataForIsNegative", groups = {"logicalPositive"})
    public void testIsNegative(long a) {
        boolean isNegative = calc.isNegative(a);
        Assert.assertTrue(isNegative, a + " is not negative");
    }

    @DataProvider(name = "dataForIsNegative")
    public Object[] getData() {
        return new Object[]{-2, -5};
    }
}