package com.realdolmen.filereader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImpl implements FileReaderInteface {


    @Override
    public List<String> readFromFile(String filename) {

        String result;
        List<String> resultList = new ArrayList<>();


        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            while ((result = bufferedReader.readLine()) != null ){
                resultList.add(result);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        return resultList;
    }
}
