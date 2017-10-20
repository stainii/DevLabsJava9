package com.realdolmen.numberGenerator.nonExporting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NonExportingNumberGeneratorTest {
    private NonExportingNumberGenerator generator;

    @Before
    public void init() {
        generator = new NonExportingNumberGenerator();
    }

    @Test
    public void betweenZeroAndTen() {
        for (int i = 0; i < 1000; i++) {
            int generatedNumber = generator.generateNumber(0, 10);
            assertTrue(generatedNumber >= 0);
            assertTrue(generatedNumber < 10);
        }
    }

    @Test
    public void betweenTenAndHundred() {
        for (int i = 0; i < 1000; i++) {
            int generatedNumber = generator.generateNumber(10, 100);
            System.out.println("generatedNumber = " + generatedNumber);
            assertTrue(generatedNumber >= 10);
            assertTrue(generatedNumber < 100);
        }
    }
}
