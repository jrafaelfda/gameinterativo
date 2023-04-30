import java.util.List;

public abstract class Local {
    protected String nome;
    protected String descricao;

    public Local(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract List<Personagem> getPersonagens();

    public abstract List<Escolha> getEscolhas();
}
