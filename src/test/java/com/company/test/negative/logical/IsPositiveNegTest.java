package com.company.test.negative.logical;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveNegTest extends PreConfigCalculations {

    @Test(dataProvider = "dataForIsPos", dependsOnGroups = {"logicalPositive"}, groups = {"logicalNegative"})
    public void testIsPositive(long a) {
        boolean isPositive = calc.isPositive(a);
        Assert.assertFalse(isPositive, a + " is positive, but negative expected.");
    }

    @DataProvider(name = "dataForIsPos")
    public Object[] getData() {
        return new Object[]{-2, -33};
    }
}
