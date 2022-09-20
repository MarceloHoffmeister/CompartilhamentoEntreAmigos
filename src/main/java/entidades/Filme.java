package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Filme {
    public enum Genero { Ação, Aventura, Comédia, Drama, Faroeste, Ficção, Guerra, Infantil, Musical, Romance, Suspense, Terror }
    
    private int identificador;
    private String nomeDoDiretor, título;
    private Genero genero;
    
    public static Filme buscarFilme(int identificador){
        String sql = "SELECT * FROM filmes "
                + "WHERE identificador = ?";
        ResultSet lista_resultados = null;
        Filme filme = null;
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, identificador);
            lista_resultados = comando.executeQuery();
            
            while(lista_resultados.next()) {
                filme = new Filme(
                        identificador,
                        lista_resultados.getString("título"),
                        Genero.values()[lista_resultados.getInt("gênero")],
                        lista_resultados.getString("nome_do_diretor")
                );
            }
            
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção){
            exceção.printStackTrace();
            filme = null;
        }
        
        return filme;
    }
    
    public static String inserirFilme(Filme filme){
        String sql = "INSERT INTO filmes("
                + "título,"
                + "gênero,"
                + "nome_do_diretor"
                + ") VALUES (?, ?, ?)";
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero().ordinal());
            comando.setString(3, filme.getNomeDiretor());
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException exceção){
            exceção.printStackTrace();
            return "Erro na inserção do Filme no BD";
        }
    }
    
    public static String alterarFilme(Filme filme){
        String sql = "UPDATE filmes "
                + "SET título = ?, gênero = ?, nome_do_diretor = ? "
                + "WHERE identificador = ?";
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero().ordinal());
            comando.setString(3, filme.getNomeDiretor());
            comando.setInt(4, filme.getIdentificador());
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch (SQLException exceção) {
            exceção.printStackTrace();
            return"Erro na alteração do filme no BD";
        }
    }
    
    public static String removerFilme(int identificador) {
        String sql = "DELETE FROM filmes WHERE identificador = ?";
        
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, identificador);
            comando.executeUpdate();
            comando.close();
            
            return null;
        } catch(SQLException exceção) {
            exceção.printStackTrace();
            return"Erro na remoção do filme no BD";
        }
    }
    
    public static Filme[] getVisoes() {
        String sql = "SELECT identificador, título FROM filmes";
        ResultSet lista_resultados = null;
        ArrayList<Filme> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                int identificador = lista_resultados.getInt("identificador");
                String título = lista_resultados.getString("título");
                visões.add(new Filme(identificador, título));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
        return visões.toArray(new Filme[visões.size()]);
    }
    
    public static int ultimoIdentificador() {
        String sql = "SELECT MAX(identificador) FROM filmes";
        ResultSet listaResultados = null;
        int identificador = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            listaResultados = comando.executeQuery();
            while (listaResultados.next()) {
                identificador = listaResultados.getInt(1);
            }
            listaResultados.close();
            comando.close();
        } catch (SQLException excecaoSql) { excecaoSql.printStackTrace(); };
        
        return identificador;
    }
    
    public static boolean existeFilmeMesmosAtributos(Filme filme) {
        String sql = "SELECT COUNT(identificador) FROM filmes WHERE título = ? AND gênero = ? AND nome_do_diretor = ?";
        ResultSet listaResultados = null;
        int nFilmesMesmosAtributos = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getGenero().ordinal());
            comando.setString(3, filme.getNomeDiretor());
            listaResultados = comando.executeQuery();
            while (listaResultados.next()) {
                nFilmesMesmosAtributos = listaResultados.getInt(1);
            }
            listaResultados.close();
            comando.close();
        } catch (SQLException excecaoSql) { excecaoSql.printStackTrace(); }
        
        if (nFilmesMesmosAtributos > 0) return true;
        else return false;
    }
    
    public Filme(
            int identificador,
            String título,
            Genero genero,
            String nomeDoDiretor
    ) {
        this.identificador = identificador;
        this.título = título;
        this.genero = genero;
        this.nomeDoDiretor = nomeDoDiretor;
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
    
    public String getNomeDiretor() {
        return this.nomeDoDiretor;
    }
    
    public void setNomeDiretor(String nomeDoDiretor) {
        this.nomeDoDiretor = nomeDoDiretor;
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
