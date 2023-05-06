package com.example.gameinterativo.model;
import lombok.Data;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@Entity
public class Lobisomem extends Personagem{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int forca; 
	
	
	 

	@Override 
	public void realizarAcao(Escolha escolha) { 
	        // ainda vamos implementar 
	} 
	 
		
}
