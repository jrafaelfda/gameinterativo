
public abstract class Personagem {
    private String nome;
    private String descricao;
    private int vida;

public Personagem(String nome, String descricao, int vida) {

    this.nome = nome;
    this.descricao = descricao;
    this.vida = vida;


	public = getVida() {
		return this.vida;
	}

	public void setVida(= vida) {
		this.vida = vida;
	}

    public void andar(Local destino) {
        System.out.println(nome + " está indo para " + destino.getNome());
    }

    public abstract void realizarAcao(Escolha escolha);
	
}
   
    }
    