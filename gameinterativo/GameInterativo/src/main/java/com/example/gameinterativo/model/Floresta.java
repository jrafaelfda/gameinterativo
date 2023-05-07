package com.example.gameinterativo.model;

import java.util.List;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data; 

@Data
@AllArgsConstructor
@Entity

public class Floresta extends Local { 
	
	public void criarCenarioInicialLobisomem() {
		descricao = "Você nasceu na Floresta, rodeado por árvores antigas e grandes. Os animagens selvagens fazem barulho e insetos iluminam o pouco da escuridão sombria.";
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