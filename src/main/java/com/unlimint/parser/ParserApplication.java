package com.unlimint.parser;

import com.unlimint.parser.Parser.CSVParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParserApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ParserApplication.class, args);
		CSVParser csvParser = new CSVParser("order.csv", "order1.csv");
		csvParser.csvFile();
		csvParser.csvWriter();
	}

}
