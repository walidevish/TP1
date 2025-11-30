package com.example.ex1_tp1.web;

import com.example.ex1_tp1.entities.Nombres;
import com.example.ex1_tp1.service.CalculeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/calculs")

public class CalculateurController {

    private final CalculeService calculeService;

    public CalculateurController(CalculeService calculeService) {
        this.calculeService =  calculeService;
    }

    @PostMapping
    public ResponseEntity<Double> calcul_Somme(@RequestBody Nombres nombres){
        double somme = calculeService.somme(nombres);
        return ResponseEntity.ok(somme);
    }
}
