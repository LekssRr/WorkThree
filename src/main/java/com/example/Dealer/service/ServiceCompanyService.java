package com.example.Dealer.service;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.dto.ServiceCompanyDto;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCompanyService {

    private final ServiceCompanyRepository serviceCompanyRepository;
    private final AutoRepository autoRepository;

    public ServiceCompanyService(ServiceCompanyRepository newServiceCompanyRepository, AutoRepository newAutoRepository) {
        this.serviceCompanyRepository = newServiceCompanyRepository;
        this.autoRepository = newAutoRepository;
    }

    public ServiceCompanyService() {
        this.serviceCompanyRepository = new ServiceCompanyRepository();
        this.autoRepository = new AutoRepository();
    }

    public List<ServiceCompanyDto> getAllServiceCompany() {
        return null;
    }

    public List<AutoDto> getAllVinToServiceCompany() {
        return null;
    }

    public boolean addServiceCompany() {
        return false;
    }

    public boolean deleteServiceCompany() {
        return false;
    }

    public boolean deleteAllServiceCompany() {
        return false;
    }

    public boolean updateServiceCompany() {
        return false;
    }
}
