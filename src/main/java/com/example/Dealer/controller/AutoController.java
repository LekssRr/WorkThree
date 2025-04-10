package com.example.Dealer.controller;

import com.example.Dealer.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Auto")
public class AutoController {

    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService newAutoService) {
        this.autoService = newAutoService;
    }

    @GetMapping("/GET")
    public ResponseEntity getAllAuto() {
        try {
            return ResponseEntity.ok("GetAllAuto");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @GetMapping("/GET/")
    public ResponseEntity getAuto() {
        try {
            return ResponseEntity.ok("GetAuto");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @PostMapping("/POST/")
    public ResponseEntity postAuto() {
        try {
            return ResponseEntity.ok("Post");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @DeleteMapping("/DELETE")
    public ResponseEntity deleteAllAuto() {
        try {
            return ResponseEntity.ok("DELETEAll");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @DeleteMapping("/DELETE/")
    public ResponseEntity deleteAuto() {
        try {
            return ResponseEntity.ok("DELETE");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @PutMapping("/PUT/")
    public ResponseEntity putAuto() {
        try {
            return ResponseEntity.ok("PUT");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
