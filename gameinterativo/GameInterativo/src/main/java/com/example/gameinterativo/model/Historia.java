package com.example.gameinterativo.model;

import java.util.List; 
import lombok.Getter;

public class Historia { 
    @Getter private String enredoPrincipal; 
    @Getter private List<Escolha> escolhas; 

}