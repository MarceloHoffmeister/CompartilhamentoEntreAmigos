package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Filme {
    public enum Genero { Ação, Aventura, Comédia, Drama, Faroeste, Ficção, Guerra, Infantil, Musical, Romance, Suspense, Terror }
    
    private int identificador;
    private String diretor, título;
    private Genero genero;
    
    public static Filme buscarFilme(int identificador) {
        String sql = "SELECT * FROM filmes WHERE identificador = ?";
        
        ResultSet lista_resultados = null;
        
        Filme filme = null;
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setInt(1, identificador);
            
            lista_resultados = comando.executeQuery();
            
            while (lista_resultados.next()) {
                filme = new Filme(
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
            filme = null;
        }
        
        return filme;
    }
    
    public static String inserirFilme(Filme filme) {
        String sql = "INSERT INTO filmes(titulo, genero, diretor) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero().ordinal());
            comando.setString(3, filme.getDiretor());
            
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException excecao){
            excecao.printStackTrace();
            return "Erro na inserção do filme no BD";
        }
    }
    
    public static String alterarFilme(Filme filme){
        String sql = "UPDATE filmes SET titulo = ?, genero = ?, diretor = ? "
                + "WHERE identificador = ?";
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero().ordinal());
            comando.setString(3, filme.getDiretor());
            comando.setInt(4, filme.getIdentificador());
            
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return"Erro na alteração do filme no BD";
        }
    }
    
    public static String removerFilme(int identificador) {
        String sql = "DELETE FROM filmes WHERE identificador = ?";
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, identificador);
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return"Erro na remoção do filme no BD";
        }
    }
    
    public static Filme[] getVisoes() {
        String sql = "SELECT identificador, titulo FROM filmes";
        
        ResultSet lista_resultados = null;
        
        ArrayList<Filme> visões = new ArrayList();
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            lista_resultados = comando.executeQuery();
            
            while (lista_resultados.next()) {
                int identificador = lista_resultados.getInt("identificador");
                String título = lista_resultados.getString("título");
                visões.add(new Filme(identificador, título));
            }
            
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        return visões.toArray(Filme[]::new);
    }
    
    public static int ultimoIdentificador() {
        String sql = "SELECT MAX(identificador) FROM filmes";
        
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
    
    public static boolean existeFilmeMesmosAtributos(Filme filme) {
        String sql = "SELECT COUNT(identificador) FROM filmes WHERE titulo = ? AND genero = ? AND diretor = ?";
        
        ResultSet listaResultados = null;
        
        int nFilmesMesmosAtributos = 0;
        
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero().ordinal());
            comando.setString(3, filme.getDiretor());
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next())
                nFilmesMesmosAtributos = listaResultados.getInt(1);
            
            listaResultados.close();
            comando.close();
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        return nFilmesMesmosAtributos > 0;
    }
    
    public Filme(int identificador, String título, Genero genero, String diretor) {
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
    
    public Filme(int identificador, String titulo) {
        this.identificador = identificador;
        this.título = titulo;
    }
    
    public String toString() {
        return "[" + identificador + "] " + título;
    }
    
    public String getVisão() { return new Filme(identificador, título).toString(); }
}
