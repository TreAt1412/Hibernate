package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name ="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="companyname")
    private String companyName;

//    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private List<Employee> employeeList = new ArrayList<>();
    public Company(String companyName) {
        this.companyName = companyName;
    }

//    public Company(String companyName, List<Employee> employeeList) {
//        this.companyName = companyName;
//        this.employeeList = employeeList;
//    }

    public Company() {

    }



    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
