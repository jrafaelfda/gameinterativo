package com.example.gameinterativo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity

public class Vampiro extends Personagem { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int inteligencia; 
 

    @Override 
    public void realizarAcao(Escolha escolha) { 
        // ainda vamos implementar 
    } 
 
	
 
    
 
}