package com.example.Dealer.service;

import com.example.Dealer.dto.AutoDto;
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
public class AutoService {

    private ServiceCompanyRepository serviceCompanyRepository;
    private AutoRepository autoRepository;

    public AutoService() {
    }
    public AutoService(ServiceCompanyRepository newServiceCompanyRepository, AutoRepository newAutoRepository) {
        this.serviceCompanyRepository = newServiceCompanyRepository;
        this.autoRepository = newAutoRepository;
    }

    private boolean isCurrentVin(String vinCode) {
        return vinCode.length() == 17;
    }

    public AutoDto getAuto(String vinCode) {
        if (isCurrentVin(vinCode)) {
            AutoDto result = null;
            if (!autoRepository.findById(vinCode).isEmpty()) {
                result = new AutoDto(autoRepository.findById(vinCode).get().getVinCode(), autoRepository.findById(vinCode).get().getServiceCompany().getNameServiceCompany());
            }
            return result;
        }
        return null;
    }

    public String getServiceCompany(AutoDto autoDto) {
        return autoDto.getNameServiceCompany();
    }

    public List<AutoDto> getAllAuto() {
        List<AutoEntity> autoEntities = autoRepository.findAll();
        List<AutoDto> result = new ArrayList<>();
        for (int i = 0; i <= autoEntities.size() - 1; i++) {
            result.add(new AutoDto(autoEntities.get(i).getVinCode(), autoEntities.get(i).getServiceCompany().getNameServiceCompany()));
        }
        return result;
    }

    public List<AutoDto> getAllAutoToServiceCompany(String nameServiceCompany) {
        List<AutoEntity> listEntity = autoRepository.findAll();
        List<AutoDto> result = new ArrayList<>();
        for (int i = 0; i <= listEntity.size() - 1; i++) {
            if (listEntity.get(i).getServiceCompany().getNameServiceCompany().equals(nameServiceCompany)) {
                result.add(new AutoDto(listEntity.get(i).getVinCode(), nameServiceCompany));
            }
        }
        return result;
    }

    public boolean addAuto(String vinCode, String nameServiceCompany) {
        if (isCurrentVin(vinCode)) {
            if (this.isAuto(vinCode)) {
                AutoEntity addAuto = new AutoEntity(vinCode, new ServiceCompanyEntity(nameServiceCompany));
                autoRepository.save(addAuto);
                return true;
            }
        }
        return false;
    }

    public boolean deleteAuto(String vinCode) {
        if (isCurrentVin(vinCode)) {
            if (this.isAuto(vinCode)) {
                autoRepository.deleteById(vinCode);
                return true;
            }
        }
        return false;
    }

    public boolean deleteAllAuto() {
        autoRepository.deleteAll();
        return true;
    }

    public boolean updateAuto(String vinCode, String newNameSC) {
        if (isCurrentVin(vinCode)) {
            if (isAuto(vinCode)) {
                if (this.isServiceCompany(newNameSC)) {
                    AutoDto cashAuto = this.getAuto(vinCode);
                    autoRepository.deleteById(vinCode);
                    this.addAuto(cashAuto.getVinCode(), newNameSC);
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isServiceCompany(String nameServiceCompany)
    {
        List<ServiceCompanyEntity> serviceCompanyEntities = serviceCompanyRepository.findAll();
        Set<String> serviceCompanySet = new HashSet<>();
        for (int i = 0; i <= serviceCompanyEntities.size() - 1; i++) {
            serviceCompanySet.add(serviceCompanyEntities.get(i).getNameServiceCompany());
        }
        if (serviceCompanySet.add(nameServiceCompany)) {
            return true;
        }
        return false;
    }
    private boolean isAuto(String vinCode) {
        List<AutoDto> autoDtos = this.getAllAuto();
        Set<String> vinSet = new HashSet<>();
        for (int i = 0; i <= autoDtos.size() - 1; i++) {
            vinSet.add(autoDtos.get(i).getVinCode());
        }
        if (!vinSet.add(vinCode)) {
            return true;
        }
        return false;
    }
}
