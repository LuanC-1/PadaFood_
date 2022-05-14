package Instancia;

import Classes.ClienteClass;
import DAO.ClienteDAO;
import java.sql.SQLException;

public class ClienteIns {

    public static void Cadastro() throws SQLException {
        ClienteClass p1 = new ClienteClass();
        ClienteDAO p2 = new ClienteDAO();
        p1.Cadastrar();
        p2.Adiciona(p1);
    }

    public static void Login2() throws SQLException {
        ClienteClass p1 = new ClienteClass();
        ClienteDAO p2 = new ClienteDAO();
        p1.Login();
        p2.Login1(p1);
    }

    public static void print2() throws SQLException {
        ClienteClass p1 = new ClienteClass();
        ClienteDAO p2 = new ClienteDAO();
        p1.Print();
        p2.Print();
    }

    public static void comprar() throws SQLException {
        ClienteDAO p2 = new ClienteDAO();
        
    }
}
