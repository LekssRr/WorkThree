package com.example.Dealer.ServiceTest;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import com.example.Dealer.service.AutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AutoServiceTest {

    private final AutoRepository autoRepositoryTest = Mockito.mock(AutoRepository.class);
    private final ServiceCompanyRepository serviceCompanyRepositoryTest = Mockito.mock(ServiceCompanyRepository.class);
    private final AutoService autoServiceTest = new AutoService(serviceCompanyRepositoryTest, autoRepositoryTest);

    @Test
    public void getServiceCompanyTest() {
        String vinCodeTest = "11111111111111111";
        String nameServiceCompanyTest = "SC-Test";
        AutoDto testAutoDto = new AutoDto(vinCodeTest, nameServiceCompanyTest);
        Assertions.assertEquals(autoServiceTest.getServiceCompany(testAutoDto), nameServiceCompanyTest);
    }
    @Test
    public void getAutoTest() {

    }
    @Test
    public void getAllAutoTest() {

    }
    @Test
    public void getAllAutoToServiceCompanyTest() {

    }
    @Test
    public void addAutoTest() {

    }
    @Test
    public void deleteAutoTest() {

    }
    @Test
    public void deleteAllAutoTest() {

    }
    @Test
    public void updateAutoTest() {

    }
    @Test
    public void isServiceCompanyTest()
    {

    }
    @Test
    public void isAutoTest()
    {

    }

}
