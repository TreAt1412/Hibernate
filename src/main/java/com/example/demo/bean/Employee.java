package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private Company company;


    public Employee(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public Employee() {

    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +

                '}';
    }
}
