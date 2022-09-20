package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Programa {
    public enum Genero { Ação, Aventura, Comédia, Drama, Faroeste, Ficção, Guerra, Infantil, Musical, Romance, Suspense, Terror }
    
    private int identificador;
    private String diretor, título;
    private Genero genero;
    
    public static Programa buscarPrograma(int identificador) {
        String sql = "SELECT * FROM programas WHERE identificador = ?";
        
        ResultSet lista_resultados = null;
        
        Programa programa = null;
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setInt(1, identificador);
            
            lista_resultados = comando.executeQuery();
            
            while (lista_resultados.next()) {
                programa = new Programa(
                        identificador,
                        lista_resultados.getString("titulo"),
                        Genero.values()[lista_resultados.getInt("genero")],
                        lista_resultados.getString("diretor")
                );
            }
            
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao){
            excecao.printStackTrace();
            programa = null;
        }
        
        return programa;
    }
    
    public static String inserirPrograma(Programa programa) {
        String sql = "INSERT INTO programas (titulo, genero, diretor) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, programa.getTitulo());
            comando.setInt(2, programa.getGenero().ordinal());
            comando.setString(3, programa.getDiretor());
            
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException excecao){
            excecao.printStackTrace();
            return "Erro na inserção do programa no BD";
        }
    }
    
    public static String alterarPrograma(Programa programa){
        String sql = "UPDATE programas SET titulo = ?, genero = ?, diretor = ? "
                + "WHERE identificador = ?";
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, programa.getTitulo());
            comando.setInt(2, programa.getGenero().ordinal());
            comando.setString(3, programa.getDiretor());
            comando.setInt(4, programa.getIdentificador());
            
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return"Erro na alteração do programa no BD";
        }
    }
    
    public static String removerPrograma(int identificador) {
        String sql = "DELETE FROM programas WHERE identificador = ?";
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, identificador);
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return"Erro na remoção do programa no BD";
        }
    }
    
    public static Programa[] getVisoes() {
        String sql = "SELECT identificador, titulo FROM programas";
        
        ResultSet lista_resultados = null;
        
        ArrayList<Programa> visões = new ArrayList();
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            lista_resultados = comando.executeQuery();
            
            while (lista_resultados.next()) {
                int identificador = lista_resultados.getInt("identificador");
                String título = lista_resultados.getString("título");
                visões.add(new Programa(identificador, título));
            }
            
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        return visões.toArray(Programa[]::new);
    }
    
    public static int ultimoIdentificador() {
        String sql = "SELECT MAX(identificador) FROM programas";
        
        ResultSet listaResultados = null;
        
        int identificador = 0;
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next())
                identificador = listaResultados.getInt(1);
            
            listaResultados.close();
            comando.close();
        } catch (SQLException excecao) { excecao.printStackTrace(); };
        
        return identificador;
    }
    
    public static boolean existeProgramaMesmosAtributos(Programa programa) {
        String sql = "SELECT COUNT(identificador) FROM programas WHERE titulo = ? AND genero = ? AND diretor = ?";
        
        ResultSet listaResultados = null;
        
        int nProgramasMesmosAtributos = 0;
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, programa.getTitulo());
            comando.setInt(2, programa.getGenero().ordinal());
            comando.setString(3, programa.getDiretor());
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next())
                nProgramasMesmosAtributos = listaResultados.getInt(1);
            
            listaResultados.close();
            comando.close();
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        return nProgramasMesmosAtributos > 0;
    }
    
    public Programa(int identificador, String título, Genero genero, String diretor) {
        this.identificador = identificador;
        this.título = título;
        this.genero = genero;
        this.diretor = diretor;
    }
    
    public int getIdentificador() {
        return this.identificador;
    }
    
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public String getTitulo() {
        return this.título;
    }
    
    public void setTitulo(String titulo) {
        this.título = titulo;
    }
    
    public Genero getGenero() {
        return this.genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public String getDiretor() {
        return this.diretor;
    }
    
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    public Programa(int identificador, String titulo) {
        this.identificador = identificador;
        this.título = titulo;
    }
    
    public String toString() {
        return "[" + identificador + "] " + título;
    }
    
    public String getVisão() { return new Programa(identificador, título).toString(); }
}
