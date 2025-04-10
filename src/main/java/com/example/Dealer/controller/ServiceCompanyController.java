package com.example.Dealer.controller;

import com.example.Dealer.service.ServiceCompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ServiceCompany")
public class ServiceCompanyController {
    private final ServiceCompanyService serviceCompanyService;

    public ServiceCompanyController(ServiceCompanyService newServiceCompnayService) {
        this.serviceCompanyService = newServiceCompnayService;
    }

    @GetMapping("/GET")
    public ResponseEntity getAllServiceCompany() {
        try {
            return ResponseEntity.ok("GetAll");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @GetMapping("/GET/")
    public ResponseEntity getServiceCompany() {
        try {
            return ResponseEntity.ok("Get");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @PostMapping("/POST/")
    public ResponseEntity postServiceCompany() {
        try {
            return ResponseEntity.ok("Post");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @DeleteMapping("/DELETE")
    public ResponseEntity deleteAllServiceCompany() {
        try {
            return ResponseEntity.ok("DELETEALL");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @DeleteMapping("/DELETE/")
    public ResponseEntity deleteServiceCompany() {
        try {
            return ResponseEntity.ok("DELETE");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @PutMapping("/PUT/")
    public ResponseEntity putServiceCompany() {
        try {
            return ResponseEntity.ok("PUT");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
