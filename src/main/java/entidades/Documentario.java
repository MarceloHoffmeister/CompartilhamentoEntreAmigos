package entidades;

public class Documentario extends Programa {
    private int valor;
    private boolean propriedadeIntelectual;
    
    public Documentario(
            int identificador,
            String título,
            Programa.Genero genero,
            String diretor,
            int valor,
            boolean propriedadeIntelectual
    ) {
        super(identificador, título, genero, diretor);
        
        this.valor = valor;
        this.propriedadeIntelectual = propriedadeIntelectual;
    }
    
    public int getValor() {
        return this.valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public boolean getPropriedadeIntelectual() {
        return this.propriedadeIntelectual;
    }
    
    public void setPropriedadeIntelectual(boolean propriedadeIntelectual) {
        this.propriedadeIntelectual = propriedadeIntelectual;
    }
}
