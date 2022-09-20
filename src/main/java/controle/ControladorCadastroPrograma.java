package controle;

import entidades.Programa;
import interfaces.JanelaCadastroPrograma;

public class ControladorCadastroPrograma {
    public ControladorCadastroPrograma() {
        new JanelaCadastroPrograma(this).setVisible(true);
    }
    
    public String inserirPrograma(Programa programa){
        if (!Programa.existeProgramaMesmosAtributos (programa)) return Programa.inserirPrograma(programa);
        else return "Já existe um programa com os mesmos atributos";
    }
    
    public String alterarPrograma(Programa programa) {
        Programa programa1 = Programa.buscarPrograma(programa.getIdentificador());
        
        if (programa1 != null) return Programa.alterarPrograma(programa);
        else return "Nome de filme não cadastrado";
    }
    
    public String removerPrograma(Programa programa){
        Programa programa1 = Programa.buscarPrograma(programa.getIdentificador());
        
        if (programa1 != null) return Programa.removerPrograma(programa);
        else return"Nome de filme não cadastrado";
    }
}
