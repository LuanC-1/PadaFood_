package ConexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDB {

    private static String usuario = "root";
    private static String senha = "root";
    private static String host = "127.0.0.1";
    private static String porta = "3306";
    private static String bd = "Bakery";

    public Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario,senha );
            System.out.println("Conexao ok");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de conexão com banco de dados" + ex);
            ex.printStackTrace();
            return null;
        }
    }
}
