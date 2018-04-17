package com.company.test.negative.logical;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeNegTest extends PreConfigCalculations {

    @Test(dataProvider = "dataForIsNegativeTest", dependsOnGroups = {"logicalPositive"}, groups = "logicalNegative")
    public void testIsNegative(long a) {
        boolean isNegative = calc.isNegative(a);
        Assert.assertFalse(isNegative, a + " is negative, but positive expected");
    }

    @DataProvider(name = "dataForIsNegativeTest")
    public Object[] getData() {
        return new Object[]{9};
    }
}