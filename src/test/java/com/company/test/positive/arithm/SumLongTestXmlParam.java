package com.company.test.positive.arithm;

import com.company.test.PreConfigCalculations;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTestXmlParam extends PreConfigCalculations {

    //Tests have ability to pass numbers as well as string numbers (e.g. 1 vs. "1")
    @Test(description = "Test sum with param")
    @Parameters({"firstSummand", "secondSummand", "summa"})
    public void testSumParam(long firstSummand, long secondSummand, long summa) {
        long sum = calc.sum(firstSummand, secondSummand);
        Assert.assertEquals(sum, summa, "Invalid result of sum.");
    }


}
