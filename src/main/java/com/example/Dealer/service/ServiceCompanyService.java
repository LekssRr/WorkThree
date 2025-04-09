package com.example.Dealer.service;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.dto.ServiceCompanyDto;
import com.example.Dealer.entity.AutoEntity;
import com.example.Dealer.entity.ServiceCompanyEntity;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ServiceCompanyService {

    private ServiceCompanyRepository serviceCompanyRepository;
    private AutoRepository autoRepository;


    public List<ServiceCompanyDto> getAllServiceCompany() {
        List<ServiceCompanyEntity> serviceCompanyEntities = serviceCompanyRepository.findAll();
        List<ServiceCompanyDto> result = new ArrayList<>();
        for (int i = 0; i <= serviceCompanyEntities.size() - 1; i++) {
            result.add(new ServiceCompanyDto(serviceCompanyEntities.get(i).getNameServiceCompany()));
        }
        return result;
    }

    public List<AutoDto> getAllVinToServiceCompany(String nameServiceCompany) {
        List<AutoDto> result = new ArrayList<>();
        if (serviceCompanyRepository.findById(nameServiceCompany).isEmpty()) {
            List<AutoEntity> autoEntities = serviceCompanyRepository.findById(nameServiceCompany).get().getAutoEntities();
            for (int i = 0; i <= autoEntities.size() - 1; i++) {
                result.add(new AutoDto(autoEntities.get(i).getVinCode(), autoEntities.get(i).getServiceCompany().getNameServiceCompany()));
            }
        }

        return result;
    }

    private Set<String> namesServiceCompany() {
        List<ServiceCompanyDto> serviceCompanyDtoList = this.getAllServiceCompany();
        Set<String> nameServiceCompanySet = new HashSet<>();
        for (int i = 0; i <= serviceCompanyDtoList.size() - 1; i++) {
            nameServiceCompanySet.add(serviceCompanyDtoList.get(i).getNameServiceCompany());
        }
        return nameServiceCompanySet;
    }

    public boolean addServiceCompany(String nameServiceCompany) {

        if (this.namesServiceCompany().add(nameServiceCompany)) {
            serviceCompanyRepository.save(new ServiceCompanyEntity());
            return true;
        }
        return false;
    }

    public boolean deleteServiceCompany(String nameServiceCompany) {
        if (!this.namesServiceCompany().add(nameServiceCompany)) {
            serviceCompanyRepository.deleteById(nameServiceCompany);
            return true;
        }
        return false;
    }

    public boolean deleteAllServiceCompany() {
        serviceCompanyRepository.deleteAll();
        return true;
    }

    public boolean updateServiceCompany() {
        return false;
    }
}
