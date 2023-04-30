
public abstract class Personagem {
    private String nome;
    private String descricao;
    private int vida;

public Personagem(String nome, String descricao, int vida) {

    this.nome = nome;
    this.descricao = descricao;
    this.vida = vida;
}
    public void andar(Local destino) {
    	System.out.println(nome + " está indo para " + destino.getNome());

    }

    public abstract void realizarAcao(Escolha escolha);
	


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida;
}
   
    }
    