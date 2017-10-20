package com.realdolmen.firstjava9app.exporting;

import com.realdolmen.firstjava9app.nonExporting.NonExportingNumberGenerator;

public class NumberGenerator {
    private NonExportingNumberGenerator nonExportingNumberGenerator;

    public NumberGenerator() {
        this.nonExportingNumberGenerator = new NonExportingNumberGenerator();
    }

    public int generateNumber() {
        return nonExportingNumberGenerator.generateNumber();
    }
}
