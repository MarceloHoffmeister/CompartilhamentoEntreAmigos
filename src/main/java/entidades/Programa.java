package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Programa {
    public enum Genero { Ação, Aventura, Comédia, Drama, Faroeste, Ficção, Guerra, Infantil, Musical, Romance, Suspense, Terror }
    
    private int identificador;
    private String diretor, titulo;
    private Genero genero;
    
    public static Programa buscarPrograma(int identificador) {
        String sql = "SELECT * FROM programas WHERE identificador = ?";
        
        ResultSet listaResultados;
        
        Programa programa = null;
        
        PreparedStatement comando;
        
        String titulo = null;
        Genero genero = null;
        String diretor = null;        
        
        try {
            comando = BD.conexao.prepareStatement(sql);
                    
            comando.setInt(1, identificador);
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next()) {
                titulo = listaResultados.getString("titulo");
                genero = Genero.values()[listaResultados.getInt("genero")];
                diretor = listaResultados.getString("diretor");
            }
            
            listaResultados.close();
            comando.close();
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        sql = "SELECT duracao, protagonista FROM filmes WHERE programa_id = ?";
        
        try {
            comando = BD.conexao.prepareStatement(sql);
            
            comando.setInt(1, identificador);
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next()) {
                return new Filme(
                        identificador,
                        titulo,
                        genero,
                        diretor,
                        listaResultados.getInt("duracao"),
                        listaResultados.getString("protagonista")
                );
            }
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        sql = "SELECT total_episodios, ano FROM series WHERE programa_id = ?";
        
        try {
            comando = BD.conexao.prepareStatement(sql);
            
            comando.setInt(1, identificador);
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next()) {
                return new Serie(
                        identificador,
                        titulo,
                        genero,
                        diretor,
                        listaResultados.getInt("total_episodios"),
                        listaResultados.getInt("ano")
                );
            }
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        sql = "SELECT valor, propriedade_intelectual FROM documentarios WHERE programa_id = ?";
        
        try {
            comando = BD.conexao.prepareStatement(sql);
            
            comando.setInt(1, identificador);
            
            listaResultados = comando.executeQuery();
            
            while (listaResultados.next()) {
                return new Documentario(
                        identificador,
                        titulo,
                        genero,
                        diretor,
                        listaResultados.getInt("valor"),
                        listaResultados.getBoolean("propriedade_intelectual")
                );
            }
        } catch (SQLException excecao) { excecao.printStackTrace(); }
        
        return null;
    }
    
    public static String inserirPrograma(Programa programa) {
        String sql = "INSERT INTO programas (titulo, genero, diretor) VALUES (?, ?, ?)";
        
        PreparedStatement comando;
                
        try {
            comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, programa.getTitulo());
            comando.setInt(2, programa.getGenero().ordinal());
            comando.setString(3, programa.getDiretor());
            
            comando.executeUpdate();
            comando.close();
        } catch (SQLException excecao){
            excecao.printStackTrace();
            return "Erro na inserção do programa no BD";
        }
        
        int identificador = ultimoIdentificador();
        
        if (programa instanceof Filme filme) {
            sql = "INSERT INTO filmes (programa_id, duracao, protagonista) VALUES (?, ?, ?)";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, identificador);
                comando.setInt(2, filme.getDuracao());
                comando.setString(3, filme.getProtagonista());

                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na inserção do filme no BD";
            }
        } else if (programa instanceof Serie serie) {
            sql = "INSERT INTO series (programa_id, total_episodios, ano) VALUES (?, ?, ?)";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, identificador);
                comando.setInt(2, serie.getTotalEpisodios());
                comando.setInt(3, serie.getAno());

                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na inserção da serie no BD";
            }
        } else if (programa instanceof Documentario documentario) {
            sql = "INSERT INTO documentarios (programa_id, valor, propriedade_intelectual) VALUES (?, ?, ?)";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, identificador);
                comando.setInt(2, documentario.getValor());
                comando.setBoolean(3, documentario.getPropriedadeIntelectual());

                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na inserção do documentário no BD";
            }
        }
        
        return null;
    }
    
    public static String alterarPrograma(Programa programa){
        String sql = "UPDATE programas SET titulo = ?, genero = ?, diretor = ? "
                + "WHERE identificador = ?";
        
        PreparedStatement comando;
        
        try {
            comando = BD.conexao.prepareStatement(sql);
            
            comando.setString(1, programa.getTitulo());
            comando.setInt(2, programa.getGenero().ordinal());
            comando.setString(3, programa.getDiretor());
            comando.setInt(4, programa.getIdentificador());
            
            comando.executeUpdate();
            comando.close();
        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return"Erro na alteração do programa no BD";
        }
        
        if (programa instanceof Filme filme) {
            sql = "UPDATE filmes SET duracao = ?, protagonista = ? "
                    + "WHERE programa_id = ?";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, filme.getDuracao());
                comando.setString(2, filme.getProtagonista());
                comando.setInt(3, filme.getIdentificador());

                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na inserção do filme no BD";
            }
        } else if (programa instanceof Serie serie) {
            sql = "UPDATE series SET total_episodios = ?, ano = ? "
                    + "WHERE programa_id = ?";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, serie.getTotalEpisodios());
                comando.setInt(2, serie.getAno());
                comando.setInt(3, serie.getIdentificador());

                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na inserção da serie no BD";
            }
        } else if (programa instanceof Documentario documentario) {
            sql = "UPDATE documentarios SET valor = ?, propriedade_intelectual = ? "
                    + "WHERE programa_id = ?";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, documentario.getValor());
                comando.setBoolean(2, documentario.getPropriedadeIntelectual());
                comando.setInt(3, documentario.getIdentificador());

                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na inserção do documentário no BD";
            }
        }
        
        return null;
    }
    
    public static String removerPrograma(Programa programa) {
        int identificador = programa.getIdentificador();
        
        PreparedStatement comando;
        
        if (programa instanceof Filme) {
            String sql = "DELETE FROM filmes WHERE programa_id = ?";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, identificador);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na remoção do filme no BD";
            }
        } else if (programa instanceof Serie) {
            String sql = "DELETE FROM series WHERE programa_id = ?";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, identificador);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na remoção da série no BD";
            }
        } else if (programa instanceof Documentario) {
            String sql = "DELETE FROM documentarios WHERE programa_id = ?";
            
            try {
                comando = BD.conexao.prepareStatement(sql);
                
                comando.setInt(1, identificador);
                comando.executeUpdate();
                comando.close();
            } catch (SQLException excecao){
                excecao.printStackTrace();
                return "Erro na remoção do documentário no BD";
            }
        }
        
        String sql = "DELETE FROM programas WHERE identificador = ?";
        
        try {
            comando = BD.conexao.prepareStatement(sql);
            
            comando.setInt(1, identificador);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return"Erro na remoção do programa no BD";
        }
        
        return null;
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
                String titulo = lista_resultados.getString("titulo");
                visões.add(new Programa(identificador, titulo));
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
    
    public Programa(int identificador, String titulo, Genero genero, String diretor) {
        this.identificador = identificador;
        this.titulo = titulo;
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
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
        this.titulo = titulo;
    }
    
    public String toString() {
        return "[" + identificador + "] " + titulo;
    }
    
    public String getVisão() { return new Programa(identificador, titulo).toString(); }
}
