package com.jprograming.backendcomps.repositories;

import com.jprograming.backendcomps.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
