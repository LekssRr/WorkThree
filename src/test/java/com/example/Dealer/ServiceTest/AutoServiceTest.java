package com.example.Dealer.ServiceTest;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import com.example.Dealer.service.AutoService;
import org.checkerframework.checker.units.qual.A;
import org.mockito.Mockito;

import java.util.List;

public class AutoServiceTest {

    private final AutoRepository autoRepositoryTest = Mockito.mock(AutoRepository.class);
    private final ServiceCompanyRepository serviceCompanyRepositoryTest = Mockito.mock(ServiceCompanyRepository.class);

    private AutoService autoServiceTest = new AutoService(autoRepositoryTest, serviceCompanyRepositoryTest);


    public void getServiceCompanyTest() {

    }

    public void getAllAutoTest() {

    }

    public void getAllAutoToServiceCompanyTest() {

    }

    public void addAutoTest() {

    }

    public void deleteAutoTest() {

    }

    public void deleteAllAutoTest() {

    }

    public void updateAutoTest() {

    }

}
