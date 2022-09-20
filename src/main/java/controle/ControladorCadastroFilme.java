package controle;

import entidades.Filme;
import interfaces.JanelaCadastroFilme;

public class ControladorCadastroFilme {
    public ControladorCadastroFilme() {
        new JanelaCadastroFilme(this).setVisible(true);
    }
    
    public String inserirFilme(Filme filme){
        if (!Filme.existeFilmeMesmosAtributos (filme)) return Filme.inserirFilme(filme);
        else return "Já existe um filme com os mesmos atributos";
    }
    
    public String alterarFilme(Filme filme) {
        Filme filme1 = Filme.buscarFilme(filme.getIdentificador());
        
        if (filme1 != null) return Filme.alterarFilme(filme);
        else return "Nome de filme não cadastrado";
    }
    
    public String removerFilme(int identificador){
        Filme filme1 = Filme.buscarFilme(identificador);
        
        if (filme1 != null) return Filme.removerFilme(identificador);
        else return"Nome de filme não cadastrado";
    }
}
