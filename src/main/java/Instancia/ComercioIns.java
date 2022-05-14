package Instancia;

import Classes.ComercioClass;
import DAO.ComercioDAO;
import Interfaces.MenuComercio;
import java.sql.SQLException;

public class ComercioIns {

    public static void Cadastro() throws SQLException {
        ComercioClass p1 = new ComercioClass();
        ComercioDAO p2 = new ComercioDAO();
        p1.cadastro();
        p2.Adiciona(p1);
    }

    public static void Login() throws SQLException {
        ComercioClass p1 = new ComercioClass();
        ComercioDAO p2 = new ComercioDAO();
        p1.Login();
        p2.Login1(p1);
        MenuComercio.Menu();
    }

    public static void print2() throws SQLException {
        ComercioClass p1 = new ComercioClass();
        ComercioDAO p2 = new ComercioDAO();
        p1.Print();
        p2.Print();
        
    }
}
