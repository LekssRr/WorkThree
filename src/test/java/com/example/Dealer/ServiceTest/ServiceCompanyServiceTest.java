package com.example.Dealer.ServiceTest;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.dto.ServiceCompanyDto;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import com.example.Dealer.service.AutoService;
import com.example.Dealer.service.ServiceCompanyService;
import org.mockito.Mockito;

import java.util.List;

public class ServiceCompanyServiceTest {

    private final AutoRepository autoRepositoryTest = Mockito.mock(AutoRepository.class);
    private final ServiceCompanyRepository serviceCompanyRepositoryTest = Mockito.mock(ServiceCompanyRepository.class);

    private ServiceCompanyService serviceCompanyService = new ServiceCompanyService(serviceCompanyRepositoryTest, autoRepositoryTest);

    public void getAllServiceCompanyTest() {

    }

    public void getAllVinToServiceCompanyTest() {

    }

    public void addServiceCompanyTest() {

    }

    public void deleteServiceCompanyTest() {

    }

    public void deleteAllServiceCompanyTest() {

    }

    public void updateServiceCompanyTest() {

    }
}
