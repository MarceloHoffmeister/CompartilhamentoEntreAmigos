package persistência;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    static final String URL = "jdbc:mysql://localhost/compartilhamento_amigos";
    static final String USUÁRIO = "root"; /* usuário do seu banco de dados aqui */
    static final String SENHA = "63823710"; /* senha do seu banco de dados aqui */
    public static Connection conexão = null;
    
    public static void criaConexão() {
        try {
            conexão = DriverManager.getConnection(URL, USUÁRIO, SENHA);
        } catch (SQLException exceção) {
            exceção.printStackTrace();
        }
    }
    
    public static void fechaConexão() {
        try {
            conexão.close();
        } catch (SQLException exceção) {
            exceção.printStackTrace();
        }
    }
}
