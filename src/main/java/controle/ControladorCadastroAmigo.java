package controle;

import entidades.Amigo;
import interfaces.JanelaCadastroAmigo;

public class ControladorCadastroAmigo {
    public ControladorCadastroAmigo() {
        new JanelaCadastroAmigo(this).setVisible(true);
    }
    
    public String inserirAmigo(Amigo amigo){
        Amigo amigo1 = Amigo.buscarAmigo(amigo.getCpf());
        if(amigo1 == null) return Amigo.inserirAmigo(amigo);
        else return "Nome de amigo já cadastrado";
    }
    
    public String alterarAmigo(Amigo amigo) {
        Amigo amigo1 = Amigo.buscarAmigo(amigo.getCpf());
        if(amigo1 != null) return Amigo.alterarAmigo(amigo);
        else return "Nome de amigo não cadastrado";
    }
    
    public String removerAmigo(String cpf){
        Amigo amigol=Amigo.buscarAmigo(cpf);
        if(amigol!=null) return Amigo.removerAmigo(cpf);
        else return"Nome de amigo não cadastrado";
    }
}
