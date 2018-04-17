package com.company.test.positive.trigon;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentTest extends PreConfigCalculations {

    @Test(description = "Test tangent", dataProvider = "dataProviderForTangent")
    public void testTg(double a, double expectedResult) {
        double tg = calc.tg(a);
        Assert.assertEquals(tg, expectedResult, "Invalid result of tangent.");
    }

    @DataProvider(name = "dataProviderForTangent")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0, Math.tan(0)},//0 - bug
                {Math.PI / 4, Math.tan(Math.PI / 4)},//45 - bug
                {Math.PI / 2, Math.tan(Math.PI / 2)},//90 - bug
                {-(Math.PI / 4), -1},//-45 - bug
                {Math.PI / 3, Math.sqrt(3)},//60 - bug
                {Math.PI, 0},//180 - bug
                {7 * Math.PI / 4, -1}//315 - bug
        };

    }

}
