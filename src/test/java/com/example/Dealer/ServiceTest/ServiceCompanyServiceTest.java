package com.example.Dealer.ServiceTest;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.entity.AutoEntity;
import com.example.Dealer.entity.ServiceCompanyEntity;
import com.example.Dealer.repository.AutoRepository;
import com.example.Dealer.repository.ServiceCompanyRepository;
import com.example.Dealer.service.ServiceCompanyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServiceCompanyServiceTest {
    @Mock
    private final AutoRepository autoRepositoryTest = Mockito.mock(AutoRepository.class);
    @Mock
    private final ServiceCompanyRepository serviceCompanyRepositoryTest = Mockito.mock(ServiceCompanyRepository.class);
    @InjectMocks
    private final ServiceCompanyService serviceCompanyService = new ServiceCompanyService(serviceCompanyRepositoryTest, autoRepositoryTest);

    @Test
    public void getAllServiceCompanyTest() {
        List<ServiceCompanyEntity> testServiceCompanyService = new ArrayList<>();
        ServiceCompanyEntity testSC = new ServiceCompanyEntity("SC-1");
        ServiceCompanyEntity testSC1 = new ServiceCompanyEntity("SC-2");
        ServiceCompanyEntity testSC2 = new ServiceCompanyEntity("SC-3");
        testServiceCompanyService.add(testSC);
        testServiceCompanyService.add(testSC1);
        testServiceCompanyService.add(testSC2);
        Mockito.when(serviceCompanyRepositoryTest.findAll()).thenReturn(testServiceCompanyService);
        Assertions.assertEquals(serviceCompanyService.getAllServiceCompany().size(), testServiceCompanyService.size());
    }

    @Test
    public void getAllVinToServiceCompanyTest() {
        List<AutoDto> testAutoDto = new ArrayList<>();
        List<AutoEntity> testAutoEntity = new ArrayList<>();
        String vin1 = "11111111111111111";
        String vin2 = "11111111111111112";
        String vin3 = "11111111111111113";
        String sc1 = "SC1";
        String sc2 = "SC2";
        AutoDto autoDto1 = new AutoDto(vin1, sc1);
        AutoDto autoDto2 = new AutoDto(vin2, sc1);
        AutoEntity autoEntity1 = new AutoEntity(vin1, new ServiceCompanyEntity(sc1));
        AutoEntity autoEntity2 = new AutoEntity(vin2, new ServiceCompanyEntity(sc1));
        AutoEntity autoEntity3 = new AutoEntity(vin3, new ServiceCompanyEntity(sc2));
        testAutoEntity.add(autoEntity1);
        testAutoEntity.add(autoEntity2);
        testAutoEntity.add(autoEntity3);
        testAutoDto.add(autoDto1);
        testAutoDto.add(autoDto2);
        ServiceCompanyEntity serviceCompanyEntity = new ServiceCompanyEntity(sc1);
        Optional<ServiceCompanyEntity> testSCE = Optional.of(serviceCompanyEntity);
        Optional<List<AutoEntity>> testArrayList = Optional.of(testAutoEntity);
        Mockito.when(serviceCompanyRepositoryTest.findById(sc1)).thenReturn(testSCE);
        Assertions.assertEquals(serviceCompanyService.getAllVinToServiceCompany(sc1).getClass(), testAutoDto.getClass());
    }
    @Test
    public void addServiceCompanyTest() {
        List<ServiceCompanyEntity> testServiceCompanyService = new ArrayList<>();
        ServiceCompanyEntity testSC = new ServiceCompanyEntity("SC-1");
        ServiceCompanyEntity testSC1 = new ServiceCompanyEntity("SC-2");
        ServiceCompanyEntity testSC2 = new ServiceCompanyEntity("SC-3");
        testServiceCompanyService.add(testSC);
        testServiceCompanyService.add(testSC1);
        testServiceCompanyService.add(testSC2);
        Mockito.when(serviceCompanyRepositoryTest.findAll()).thenReturn(testServiceCompanyService);
        Assertions.assertEquals(serviceCompanyService.addServiceCompany("SC-4"), true);
        Assertions.assertEquals(serviceCompanyService.addServiceCompany("SC-1"), false);
    }
    @Test
    public void deleteServiceCompanyTest() {
        List<ServiceCompanyEntity> testServiceCompanyService = new ArrayList<>();
        ServiceCompanyEntity testSC = new ServiceCompanyEntity("SC-1");
        ServiceCompanyEntity testSC1 = new ServiceCompanyEntity("SC-2");
        ServiceCompanyEntity testSC2 = new ServiceCompanyEntity("SC-3");
        testServiceCompanyService.add(testSC);
        testServiceCompanyService.add(testSC1);
        testServiceCompanyService.add(testSC2);
        Mockito.when(serviceCompanyRepositoryTest.findAll()).thenReturn(testServiceCompanyService);
        Assertions.assertEquals(serviceCompanyService.deleteServiceCompany("SC-1"), true);
        Assertions.assertEquals(serviceCompanyService.deleteServiceCompany("SC-4"), false);

    }
    @Test
    public void updateServiceCompanyTest() {

    }
}
