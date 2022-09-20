package entidades;

public class Serie extends Programa {
    private int totalEpisodios;
    private int ano;
    
    public Serie(
            int identificador,
            String título,
            Programa.Genero genero,
            String diretor,
            int duracao,
            int protagonista
    ) {
        super(identificador, título, genero, diretor);
    }
    
    public int getTotalEpisodios() {
        return this.totalEpisodios;
    }
    
    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
}
