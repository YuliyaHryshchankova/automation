package com.company.test.positive.trigon;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.*;

public class CosineTest extends PreConfigCalculations {

    @Test(description = "Test cosine", dataProvider = "dataProviderForCosine")
    public void testCos(double a, double expectedResult) {
        double cos = calc.cos(a);
        Assert.assertEquals(cos, expectedResult, "Invalid result of cosine.");
    }

    @DataProvider(name = "dataProviderForCosine")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, Math.cos(0)},//0 - bug
                {Math.PI / 2, Math.cos(Math.PI / 2)},//90 - bug
                {Math.PI / 4, Math.cos(Math.PI / 4)},//45 - bug
                {Math.PI / 3, Math.cos(Math.PI / 3)},//60 - bug
                {-(Math.PI / 3), Math.cos(-(Math.PI / 3))},//-60 - bug
                {Math.PI, Math.cos(Math.PI)}//180 - bug


        };

    }


}
