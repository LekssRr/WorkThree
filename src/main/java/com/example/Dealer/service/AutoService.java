package com.example.Dealer.service;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    private final ServiceCompanyRepository serviceCompanyRepository;
    private final AutoRepository autoRepository;

    public AutoService(AutoRepository newAutoRepository, ServiceCompanyRepository newServiceCompanyRepository) {
        this.serviceCompanyRepository = newServiceCompanyRepository;
        this.autoRepository = newAutoRepository;
    }

    public AutoService() {
        this.serviceCompanyRepository = new ServiceCompanyRepository();
        this.autoRepository = new AutoRepository();
    }

    private boolean isCurrentVin(String vinCode) {
        return vinCode.length() - 1 == 17;
    }

    public AutoDto getServiceCompany(String vinCode) {
        if (isCurrentVin(vinCode)) {

        }
        return null;
    }

    public List<AutoDto> getAllAuto() {
        return null;
    }

    public List<AutoDto> getAllAutoToServiceCompany(String nameServiceCompany) {
        return null;
    }

    public boolean addAuto(String vinCode, String nameServiceCompany) {
        if (isCurrentVin(vinCode)) {

        }
        return false;
    }

    public boolean deleteAuto(String vinCode) {
        if (isCurrentVin(vinCode)) {

        }
        return false;
    }

    public boolean deleteAllAuto(String vinCode) {
        if (isCurrentVin(vinCode)) {

        }
        return false;
    }

    public boolean updateAuto(String vinCode, String oldNameSC, String newNameSC) {
        if (isCurrentVin(vinCode)) {

        }
        return false;
    }

}
