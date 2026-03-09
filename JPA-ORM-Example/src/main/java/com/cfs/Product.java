package com.cfs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="product")
@Data

public class Product {
    @Id
    private int pid;
    private String name;
    private int qty;
    private int price;
    private LocalDate mfd;

}
