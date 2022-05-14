package DAO;

import Classes.ProdutoClass;
import ConexaoDB.ConexaoDB;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringJoiner;
import javax.swing.JOptionPane;

public class EstoqueDAO {

    private Connection connection;

    public EstoqueDAO() {
        this.connection = new ConexaoDB().getConnection();
    }

    public void Adiciona(ProdutoClass produtoClass) throws SQLException {
        String sql = ("insert into tb_produtos (nome,preco) VALUES(?,?)");
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, ProdutoClass.getNome());
            pst.setDouble(2, ProdutoClass.getPreco());
            pst.execute();
            pst.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void VerEstoque() throws SQLException {
        ResultSet rs = connection.prepareStatement("select nome,preco from tb_produtos").executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int numeroDeColunas = metaData.getColumnCount();

        while (rs.next()) {
            StringJoiner joiner = new StringJoiner("\n", "", "");
            for (int coluna = 1; coluna <= numeroDeColunas; coluna++) {
                String nomeDaColuna = metaData.getColumnName(coluna);
                joiner.add(nomeDaColuna + ": " + rs.getObject(coluna));
            }
            JOptionPane.showMessageDialog(null, joiner.toString());

        }
    }
}
