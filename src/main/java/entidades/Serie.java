package entidades;

public class Serie extends Programa {
    private int totalEpisodios;
    private int ano;
    
    public Serie(
            int identificador,
            String título,
            Programa.Genero genero,
            String diretor,
            int totalEpisodios,
            int ano
    ) {
        super(identificador, título, genero, diretor);
        
        this.totalEpisodios = totalEpisodios;
        this.ano = ano;
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
