package com.example.Dealer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Auto")
public class AutoController {

    @GetMapping("/")
    public ResponseEntity getAuto()
    {
        try
        {
            return ResponseEntity.ok("Ok");
        }catch (Exception e)
        {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
    @PostMapping("/")
    public ResponseEntity postAuto()
    {
        try
        {
            return ResponseEntity.ok("Post");
        }catch (Exception e)
        {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
