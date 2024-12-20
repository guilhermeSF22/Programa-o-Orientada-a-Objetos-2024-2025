package tratamento_excecoes.excecoes_personalizadas;

public class excecao_base extends RuntimeException{
    public excecao_base(String msg) {
        super (msg);
    }
}
