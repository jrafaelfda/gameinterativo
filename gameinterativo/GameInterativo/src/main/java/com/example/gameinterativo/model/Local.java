package com.example.gameinterativo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data; 

@MappedSuperclass
@Data
@AllArgsConstructor
public abstract class Local { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "nome",referencedColumnName = "id")
    protected String nome; 
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "descrição",referencedColumnName = "id")
    protected String descricao; 
 
 
 
    public abstract List<Personagem> getPersonagens(); 
 
    public abstract List<Escolha> getEscolhas(); 
} 
