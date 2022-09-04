package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Amigo {
    private int sequencial;
    private String nome, sobrenome, cpf;
    
    public static Amigo buscarAmigo(String cpf){
        String sql = "SELECT * FROM amigos WHERE cpf=?";
        ResultSet lista_resultados = null;
        Amigo amigo = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) {
                amigo = new Amigo(
                        cpf,
                        lista_resultados.getString("nome"),
                        lista_resultados.getString("sobrenome")
                );
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            amigo = null;
        }
        return amigo;
    }
    
    public static String inserirAmigo(Amigo amigo){
        String sql="INSERT INTO amigos(cpf, nome, sobrenome)"
            +"VALUES(?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, amigo.getCpf());
            comando.setString(2, amigo.getNome());
            comando.setString(3, amigo.getSobrenome());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return"Erro na Inserção do Amigo no BD";
        }
    }
    
    public static String alterarAmigo(Amigo amigo){
        String sql = "UPDATE amigos SET nome=?, sobrenome=? WHERE cpf=?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, amigo.getNome());
            comando.setString(2, amigo.getSobrenome());
            comando.setString(3, amigo.getCpf());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Alteração do Amigo no BD";
        }
    }
    
    public static String removerAmigo(String cpf) {
        String sql = "DELETE FROM amigos WHERE sequencial = ?";
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch(SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return"Erro na Remoção do Amigo no BD";
        }
    }
    
    public static Amigo[] getVisões() {
        String sql = "SELECT cpf, nome, sobrenome FROM amigos";
        ResultSet lista_resultados = null;
        ArrayList<Amigo> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                String cpf = lista_resultados.getString("cpf");
                String nome = lista_resultados.getString("nome");
                String sobrenome = lista_resultados.getString("sobrenome");
                visões.add(new Amigo(cpf, nome, sobrenome));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace(); }
        return visões.toArray(new Amigo[visões.size()]);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Amigo(String cpf, String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public String toString() {
        if (cpf != null) return nome + " " +sobrenome + " [" + cpf + "]";
        else return nome + " " + sobrenome;
    }
}
