
public class Vampiro extends Personagem {
    private int velocidade;

public Vampiro (String nome, int vida, String descricao, int velocidade) {
    super(nome, descricao, vida);
    this.velocidade = velocidade;

}

    @Override
    public void realizarAcao(Escolha escolha) {
        // ainda vamos implementar
    }

    public = getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(= velocidade) {
		this.velocidade = velocidade;
	}

}