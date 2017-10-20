package com.realdolmen.numberGenerator.exporting;

import com.realdolmen.numberGenerator.nonExporting.NonExportingNumberGenerator;

import java.util.Random;

public class NumberGenerator {
    private NonExportingNumberGenerator nonExportingNumberGenerator;

    public NumberGenerator() {
        this.nonExportingNumberGenerator = new NonExportingNumberGenerator();
    }

    public int generateNumber(int minInclusive, int maxExclusive) {
        return nonExportingNumberGenerator.generateNumber(minInclusive, maxExclusive);
    }
}
