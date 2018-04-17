package com.company.test.positive.trigon;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangentTest extends PreConfigCalculations {

    @Test(description = "Test cotangent", dataProvider = "dataProviderForCotangent")
    public void testCtg(double a, double expectedResult) {
        double ctg = calc.ctg(a);
        Assert.assertEquals(ctg, expectedResult, "Invalid result of cotangent.");
    }

    @DataProvider(name = "dataProviderForCotangent")
    public Object[][] dataProvider() {
        return new Object[][]{
                //cot()=1/tan()
                {0, 1 / Math.tan(0)},//bug
                {Math.PI, 1 / Math.tan(Math.PI)},//180 - bug
                {Math.PI / 4, 1 / Math.tan(Math.PI / 4)},//45 - bug
                {Math.PI / 2, 1 / Math.tan(Math.PI / 2)},//90 - bug
                {-(Math.PI / 2), 1 / Math.tan(-(Math.PI / 2))},//-45 - bug
                {Math.PI / 3, 1 / Math.tan(Math.PI / 3)},//60 - bug


        };

    }
}
