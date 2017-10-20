package com.realdolmen.controllerjava9.api;

import com.realdolmen.filereader.FileReaderImpl;
import com.realdolmen.filereader.FileReaderInteface;
import com.realdolmen.numberGenerator.exporting.NumberGenerator;


import java.util.List;

public class Main {

    private final NumberGenerator numberGenerator;
    private final FileReaderInteface fileReader;

    public Main() {
        fileReader = new FileReaderImpl();
        numberGenerator = new NumberGenerator();
    }

    public String getRandomLine(String filePath) {
        List<String> lines = fileReader.readFromFile(filePath);

        int numberOfLines = lines.size();
        int randomNumber = numberGenerator.generateNumber(0, numberOfLines - 1);

        return lines.get(randomNumber);
    }
}
