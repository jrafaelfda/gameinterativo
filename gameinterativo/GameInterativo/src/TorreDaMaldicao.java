import java.util.List;

public class TorreDaMaldicao extends Local {
    public TorreDaMaldicao() {
        super("Torre da Maldição", "Uma torre antiga e assombrada por espíritos malignos.");
        // Iremos adicionar personagens e escolhas disponíveis neste local
        // Aqui vai ser o ultimo local do jogo, onde vai haver a escolha final
    }

	@Override
	public List<Personagem> getPersonagens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Escolha> getEscolhas() {
		// TODO Auto-generated method stub
		return null;
	}
}