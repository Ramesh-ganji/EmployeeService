package com.org.employeeservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    private String name;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String city;
    private String pinCode;
}
enum Gender {
    MALE, FEMALE, OTHER
}
