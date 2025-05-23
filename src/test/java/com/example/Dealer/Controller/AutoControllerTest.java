package com.example.Dealer.Controller;


import com.example.Dealer.controller.AutoController;
import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.service.AutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AutoControllerTest {
        @Mock
        private AutoService autoService;
        @InjectMocks
        private AutoController autoController;
        MockMvc mockMvc;

        @BeforeEach
        void setUp() {
                mockMvc = MockMvcBuilders.standaloneSetup(autoController).build();
        }

        @Test
        public void getAllAutoTest() {
                List<AutoDto> testDto = new ArrayList<>();
                AutoDto autoDto1 = new AutoDto("1111", "12311");
                AutoDto autoDto2 = new AutoDto("1112", "12312");
                AutoDto autoDto3 = new AutoDto("1113", "12313");
                testDto.add(autoDto1);
                testDto.add(autoDto2);
                testDto.add(autoDto3);
                Mockito.when(autoService.getAllAuto()).thenReturn(testDto);
                List<String> stringList = new ArrayList<>();
                stringList.add(autoDto1.toString());
                stringList.add(autoDto2.toString());
                stringList.add(autoDto3.toString());
                ResponseEntity<List<String>> responseEntity = new ResponseEntity<>(stringList, HttpStatus.OK);
                Assertions.assertEquals(autoController.getAllAuto(), responseEntity);
        }

        @Test
        public void getAutoTest() {
                AutoDto autoDto1 = new AutoDto("11111111111111111", "SC-Test");
                Mockito.when(autoService.getAuto("11111111111111111")).thenReturn(autoDto1);
                ResponseEntity<String> responseEntity = new ResponseEntity<>(autoDto1.toString(), HttpStatus.OK);
                Assertions.assertEquals(autoController.getAuto("11111111111111111"), responseEntity);
        }

        @Test
        public void postAutoTest() {
                AutoDto autoDto1 = new AutoDto("11111111111111111", "SC-Test");
                Mockito.when(autoService.addAuto(autoDto1.getVinCode(), autoDto1.getNameServiceCompany())).thenReturn(true);
                ResponseEntity<String> responseEntity = new ResponseEntity("true", HttpStatus.OK);
                Assertions.assertEquals(autoController.postAuto(autoDto1.getVinCode(), autoDto1.getNameServiceCompany()), responseEntity);
        }

        @Test
        public void deleteAllAutoTest() {
                Mockito.when(autoService.deleteAllAuto()).thenReturn(true);
                ResponseEntity<String> responseEntity = new ResponseEntity("true", HttpStatus.OK);
                Assertions.assertEquals(autoController.deleteAllAuto(), responseEntity);
        }

        @Test
        public void deleteAutoTest() {
                AutoDto autoDto1 = new AutoDto("11111111111111111", "SC-Test");
                Mockito.when(autoService.deleteAuto(autoDto1.getVinCode())).thenReturn(true);
                ResponseEntity<String> responseEntity = new ResponseEntity("true", HttpStatus.OK);
                Assertions.assertEquals(autoController.deleteAuto(autoDto1.getVinCode()), responseEntity);
        }
}
