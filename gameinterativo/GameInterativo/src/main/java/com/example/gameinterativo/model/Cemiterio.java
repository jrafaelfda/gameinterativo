package com.example.gameinterativo.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data; 

@Data
@AllArgsConstructor
@Entity

public class Cemiterio extends Local { 
  
	public void criarCenarioInicialVampiro() {
		descricao = "Você nasceu no Cemitério, rodeado por lápides antigas e mausoléus sombrios. O vento uiva e folhas secas voam ao seu redor.";
	}
	
 
	@Override 
	public List<Personagem> getPersonagens() { 
		// TODO Auto-generated method stub 
		return null; 
	} 
 
	@Override 
	public List<Escolha> getEscolhas() { 
		// TODO Auto-generated method stub 
		return null; 
	} 
}
