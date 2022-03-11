package com.jprograming.backendcomps.controllers;

import com.jprograming.backendcomps.models.CompanyStatus;
import com.jprograming.backendcomps.repositories.CompanyStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/companyStatus")
public class CompanyStatusController {

    @Autowired
    private CompanyStatusRepository companyStatusRepository;

    @GetMapping
    public List<CompanyStatus> getAllCompnayStatus(){
        return companyStatusRepository.findAll();
    }

}
