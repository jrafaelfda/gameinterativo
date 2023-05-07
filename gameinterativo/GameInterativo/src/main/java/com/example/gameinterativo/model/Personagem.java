package com.example.gameinterativo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@MappedSuperclass
@Data
@AllArgsConstructor
public abstract class Personagem { 
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "nome",referencedColumnName = "id")
	protected String nome; 
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "descricao",referencedColumnName = "id")
	protected String descricao; 
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "vida",referencedColumnName = "id")
	protected int vida; 
	private int velocidade; 
	private int magia;
	
	private Local localAtual;

 

    public void andar(Local destino) { 
    	//System.out.println(nome + " está indo para " + destino.getNome()); 
 
    } 
 
    public abstract void realizarAcao(Escolha escolha); 
	 
 
 

    
    } 