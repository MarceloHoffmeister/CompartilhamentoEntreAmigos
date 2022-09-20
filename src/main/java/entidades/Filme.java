package entidades;

public class Filme extends Programa {
    private int duracao;
    private String protagonista;
    
    public Filme(
            int identificador,
            String título,
            Genero genero,
            String diretor,
            int duracao,
            String protagonista
    ) {
        super(identificador, título, genero, diretor);
        this.duracao = duracao;
        this.protagonista = protagonista;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String getProtagonista() {
        return this.protagonista;
    }
    
    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
}
