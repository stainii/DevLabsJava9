package com.realdolmen.controllerjava9.exports;

import com.realdolmen.numberGenerator.exporting.NumberGenerator;

import java.util.List;

public class Main {

    private final NumberGenerator numberGenerator;
    //private final RealdolmenFileReader fileReader;

    public Main() {
        //fileReader = new RealdolmenFileReader();
        numberGenerator = new NumberGenerator();
    }

    public String getRandomLine(String filePath) {
        List<String> lines = null;//fileReader.readFromFile(filePath);

        int numberOfLines = lines.size();
        int randomNumber = numberGenerator.generateNumber(0, numberOfLines - 1);

        return lines.get(randomNumber);
    }
}
