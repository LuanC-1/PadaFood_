package Instancia;

import Classes.ProdutoClass;
import DAO.EstoqueDAO;
import java.sql.SQLException;

public class ProdutoIns {

    public static void Cadastrar() throws SQLException {
        ProdutoClass p1 = new ProdutoClass();
        EstoqueDAO p2 = new EstoqueDAO();

        p1.Cadastrar1();
        p2.Adiciona(p1);
        p1.Recadastrar();
    }

    public static void verEstoque() throws SQLException {

        EstoqueDAO p2 = new EstoqueDAO();
        p2.VerEstoque();
    }

}
