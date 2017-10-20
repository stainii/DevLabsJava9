package com.realdolmen.numberGenerator.nonExporting;

import java.util.Random;

public class NonExportingNumberGenerator {
    public int generateNumber(int minInclusive, int maxExclusive) {
        Random random = new Random();

        return random.nextInt(maxExclusive - minInclusive) + minInclusive;
    }
}
