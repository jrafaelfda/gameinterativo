import java.util.Scanner;

    public class Jogo {
        private List<Local> locais;
        private Personagem personagem;
        private Historia historia;
        private boolean jogoAcabou;
    
    // métodos etc

    public class Jogo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Escolha o personagem:");
            System.out.println("1 - Lobisomem");
            System.out.println("2 - Vampiro");
            
            int opcao = scanner.nextInt();
        
            Personagem personagem;
            if (opcao == 1) {
                personagem = new Lobisomem();
            } else if (opcao == 2) {
                personagem = new Vampiro();
            } else {
                System.out.println("Opção inválida!");
                return;
            }
            
            iniciarJogo(personagem);
        }
        
        public static void iniciarJogo(Personagem personagem) {
            
        }
    }