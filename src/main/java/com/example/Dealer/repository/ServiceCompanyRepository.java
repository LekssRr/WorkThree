package com.example.Dealer.repository;

import com.example.Dealer.entity.ServiceCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCompanyRepository extends JpaRepository<ServiceCompanyEntity, String> {
}
