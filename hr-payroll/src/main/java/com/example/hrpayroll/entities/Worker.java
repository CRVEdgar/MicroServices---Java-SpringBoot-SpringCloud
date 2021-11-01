package com.example.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    private Double dailyIncome;

}
