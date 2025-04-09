package com.example.Dealer.repository;

import com.example.Dealer.entity.ServiceCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCompanyRepository extends JpaRepository<ServiceCompanyEntity, String> {
}
