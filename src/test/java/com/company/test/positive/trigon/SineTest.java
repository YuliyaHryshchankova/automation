package com.company.test.positive.trigon;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SineTest extends PreConfigCalculations {

    @Test(description = "Test sine", dataProvider = "dataProviderForSine")
    public void testSine(double a, double expectedResult) {
        double sin = calc.sin(a);
        Assert.assertEquals(sin, expectedResult, "Invalid result of sine.");
    }

    @DataProvider(name = "dataProviderForSine")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, Math.sin(0)},//0
                {Math.PI / 2, Math.sin(Math.PI / 2)},//90
                {Math.PI / 4, Math.sin(Math.PI / 4)},//45
                {Math.PI / 6, Math.sin(Math.PI / 6)},//30
                {-(Math.PI / 6), Math.sin(-(Math.PI / 6))},//-30
                {3 * Math.PI / 2, Math.sin(3 * Math.PI / 2)},//270
                {Math.PI, Math.sin(Math.PI)}//180
        };

    }
}
