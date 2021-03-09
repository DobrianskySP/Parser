package com.unlimint.parser.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CSVEntity {
    private Long id;
    private Double amount;
    private String currency;
    private String comment;
    private String filename;
    private Long line;
    private String result;
}
