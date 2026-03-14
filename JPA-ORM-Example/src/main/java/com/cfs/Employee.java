package com.cfs;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int eid;
        private String name;
        private String dept;
}
