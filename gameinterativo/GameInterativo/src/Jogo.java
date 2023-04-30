import java.util.List;
import java.util.Scanner;

    public class Jogo {
        private List<Local> locais;
        private Personagem personagem;
        private Historia historia;
        private boolean jogoAcabou;
    
    // métodos etc

  
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Escolha o personagem:");
            System.out.println("1 - Lobisomem");
            System.out.println("2 - Vampiro");
            
            int opcao = scanner.nextInt();
        
            Personagem personagem;
            if (opcao == 1) {
            	//Fake atributos
                personagem = new Lobisomem(null, opcao, null, opcao);
            } else if (opcao == 2) {
            	//Fake atributos
                personagem = new Vampiro(null, opcao, null, opcao);
            } else {
                System.out.println("Opção inválida!");
                return;
            }
            
            iniciarJogo(personagem);
        }
        
        public static void iniciarJogo(Personagem personagem) {
            
        }
    }