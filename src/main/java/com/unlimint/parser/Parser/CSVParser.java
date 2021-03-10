package com.unlimint.parser.Parser;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import com.unlimint.parser.Entity.CSVEntity;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVParser {

    String csvFile;
    String csvWrite;
    Long i = 0L;
    List list;

    public CSVParser(String csvFile, String csvWrite) {
        this.csvFile = csvFile;
        this.csvWrite = csvWrite;
    }

    public void csvFile() throws Exception{
        CsvToBean csvToBean = new CsvToBean();
        CSVReader csvReader = new CSVReader(new FileReader(csvFile), ',', '"', 0);
        list = csvToBean.parse(setColumMapping(),csvReader);
        for (Object object : list) {
            CSVEntity csvEntity = (CSVEntity) object;
            csvEntity.setFilename(csvFile);
            csvEntity.setResult("OK");
            csvEntity.setLine(i++);
            System.out.println(csvEntity);
        }
        System.out.println(list);
        //System.out.println("Файл не найдем, проверьте наличие " + csvFile + " в указанной дериктории");
    }

    public void csvWriter() throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(csvWrite));
        for (int j = 0; j < list.size(); j++) {
            String[] record = list.get(j).toString().split(",");
            writer.writeNext(record);
        }
        writer.close();
    }

    private static ColumnPositionMappingStrategy setColumMapping()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(CSVEntity.class);
        String[] columns = new String[] {"id", "amount", "currency", "comment", "status"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}
