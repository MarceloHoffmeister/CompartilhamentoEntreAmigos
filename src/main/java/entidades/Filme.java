package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Filme {
    private int identificador;
    private String nomeDoDiretor, título, gênero;
    
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
                        lista_resultados.getString("gênero"),
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
            comando.setString(2, filme.getGenero());
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
            comando.setString(2, filme.getGenero());
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
    
    public static Filme[] getVisões() {
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
    
    public Filme(
            int identificador,
            String título,
            String gênero,
            String nomeDoDiretor
    ) {
        this.identificador = identificador;
        this.título = título;
        this.gênero = gênero;
        this.nomeDoDiretor = nomeDoDiretor;
    }
    
    public int getIdentificador() {
        return this.identificador;
    }
    
    public String getTitulo() {
        return this.título;
    }
    
    public String getGenero() {
        return this.gênero;
    }
    
    public String getNomeDiretor() {
        return this.nomeDoDiretor;
    }
    
    public Filme(int identificador, String titulo) {
        this.identificador = identificador;
        this.título = titulo;
    }
    
    public String toString() {
        return título + " [" + identificador + "]";
    }
    
    public String getVisão() { return new Filme(identificador, título).toString(); }
}
