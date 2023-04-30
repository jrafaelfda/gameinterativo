
public class Lobisomem extends Personagem {
    private int forca;

    public Lobisomem(String nome, int vida, String descricao, int forca) {
        super(nome, descricao, vida);
        this.forca = forca;

    }

    @Override
    public void realizarAcao(Escolha escolha) {
        // ainda vamos implementar
    }

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

   

}

