package com.example.Dealer.controller;

import com.example.Dealer.dto.AutoDto;
import com.example.Dealer.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Auto")
public class AutoController {

    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService newAutoService) {
        this.autoService = newAutoService;
    }

    @GetMapping("/GET")
    public ResponseEntity<List<String>> getAllAuto() {
        List<String> result = new ArrayList<>();
        try {
            List<AutoDto> autoDtos = autoService.getAllAuto();
            for (int i =0; i<= autoDtos.size()-1; i++)
            {
                result.add(autoDtos.get(i).toString());
            }
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(result);
        }
    }

    @GetMapping("/GET/{id}")
    public ResponseEntity<String> getAuto(@PathVariable String id) {
        try {
            return ResponseEntity.ok(autoService.getAuto(id).toString());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @PostMapping("/POST/{id}/{sc}")
    public ResponseEntity<String> postAuto(@PathVariable String id, @PathVariable String sc) {
        try {
            Boolean res = autoService.addAuto(id, sc);
            return ResponseEntity.ok(res.toString());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @DeleteMapping("/DELETE")
    public ResponseEntity<String> deleteAllAuto() {
        String result = "Ошибка";
        try {
            Boolean res = autoService.deleteAllAuto();
            return ResponseEntity.ok(res.toString());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(result);
        }
    }

    @DeleteMapping("/DELETE/{id}")
    public ResponseEntity<String> deleteAuto(@PathVariable String id) {
        try {
            Boolean result = autoService.deleteAuto(id);
            return ResponseEntity.ok(result.toString());
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
