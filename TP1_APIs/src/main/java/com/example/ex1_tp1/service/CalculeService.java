package com.example.ex1_tp1.service;

import com.example.ex1_tp1.entities.Nombres;
import org.springframework.stereotype.Service;

@Service

public class CalculeService {

    public Double somme(Nombres nombres){
        return nombres.getA()+nombres.getB();
    }
}
