package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
public class Employee {

    private long id;
    private String name;
    /*private String designation;
    private String gender;
    private String contactNumber;*/
    private String department;
    private double salary;
}
