package com.example.gameinterativo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.gameinterativo.model.*;
import java.util.List; 
import java.util.Scanner; 

@SpringBootApplication
public class GameInterativoApplication {
	 private List<Local> locais; 
     private Personagem personagem; 
     private Historia historia; 
     private boolean jogoAcabou; 
	public static void main(String[] args) {
		SpringApplication.run(GameInterativoApplication.class, args);
		
		Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Escolha o personagem:"); 
        System.out.println("1 - Lobisomem"); 
        System.out.println("2 - Vampiro"); 
         
        int opcao = scanner.nextInt(); 
     
        Personagem personagem; 
        if (opcao == 1) { 
        	//Fake attributes 
            //personagem = new Lobisomem(null, opcao, null, opcao); 
        } else if (opcao == 2) { 
        	//Fake attributes 
            //personagem = new Vampiro(null, opcao, null, opcao); 
        } else { 
            System.out.println("Opção inválida!"); 
            return; 
        } 
         
        //iniciarJogo(personagem); 
	}
	public static void iniciarJogo(Personagem personagem) { 
        
    }

}
