package com.jprograming.backendcomps.repositories;

import com.jprograming.backendcomps.models.CompanyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyStatusRepository extends JpaRepository<CompanyStatus, Long> {
}
