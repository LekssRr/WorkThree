package com.example.Dealer.ServiceTest;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.dto.ServiceCompanyDto;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import com.example.Dealer.service.AutoService;
import com.example.Dealer.service.ServiceCompanyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class ServiceCompanyServiceTest {

    private final AutoRepository autoRepositoryTest = Mockito.mock(AutoRepository.class);
    private final ServiceCompanyRepository serviceCompanyRepositoryTest = Mockito.mock(ServiceCompanyRepository.class);
    private final ServiceCompanyService serviceCompanyService = new ServiceCompanyService(serviceCompanyRepositoryTest, autoRepositoryTest);
    @Test
    public void getAllServiceCompanyTest() {

    }
    @Test
    public void getAllVinToServiceCompanyTest() {

    }
    @Test
    public void addServiceCompanyTest() {

    }
    @Test
    public void deleteServiceCompanyTest() {

    }
    @Test
    public void deleteAllServiceCompanyTest() {

    }
    @Test
    public void updateServiceCompanyTest() {

    }
}
