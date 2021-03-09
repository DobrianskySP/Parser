package com.unlimint.parser.Parser;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVParser {
    CSVReader csvReader;
    String csvFile = "orders1.csv";

    {
        try {
            csvReader = new CSVReader(new FileReader(csvFile), ',','"', 1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найдем, проверьте наличие " + csvFile + " в указанной дериктории");;
        }
    }

}
