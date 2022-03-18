package com.example.demo.controller;

import com.example.demo.bean.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/companies")
    public List<Company> findAllCompany(){
        return companyService.findAll();

    }


}
