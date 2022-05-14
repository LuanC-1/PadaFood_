package DAO;

import Classes.ComercioClass;
import ConexaoDB.ConexaoDB;
import Instancia.ClienteIns;
import Interfaces.MenuComercio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ComercioDAO {

    private Connection connection;

    public ComercioDAO() {
        this.connection = new ConexaoDB().getConnection();
    }

    public void Adiciona(ComercioClass comercioClass) throws SQLException {
        String sql = ("insert into tb_cliente (nome,email,cnpj,endereco,telefone,senha,estado) VALUES(?,?,?,?,?,?,?)");
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, ComercioClass.getNome());
            pst.setString(2, ComercioClass.getEmail());
            pst.setString(3, ComercioClass.getCnpj());
            pst.setString(4, ComercioClass.getEndereco());
            pst.setString(5, ComercioClass.getTelefone());
            pst.setString(6, ComercioClass.getSenha());
            pst.setBoolean(7, ComercioClass.isEstado());
            pst.execute();
            pst.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void Login1(ComercioClass comercioClass) throws SQLException {

        String sql = ("select cnpj,senha from tb_cliente where cnpj = ? and senha = ?");
        String cnpj = null, pass = null;
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, ComercioClass.getCnpj());
        pst.setString(2, ComercioClass.getSenha());
        ResultSet pstt = pst.executeQuery();

        if (pstt.next()) {
            cnpj = pstt.getString("cnpj");
            pass = pstt.getString("senha");
            if (cnpj.equals(cnpj) && pass.equals(pass)) {
                JOptionPane.showMessageDialog(null, "Login Efetuado");
                MenuComercio.Menu();

                //colocar tela de login
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha invalidos!!" + "\n" + "Tente Novamente");
                ClienteIns.Login2();
            }
        }

    }

    public void Print() throws SQLException {
        String sql = ("select * from tb_cliente where cnpj = ? and senha = ?");
        String nome = null, email = null, endereco = null, telefone = null, senha = null, cnpj = null;
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, ComercioClass.getCnpj());
        pst.setString(2, ComercioClass.getSenha());
        ResultSet pstt = pst.executeQuery();
        if (pstt.next()) {
            nome = pstt.getString("nome");
            email = pstt.getString("email");
            cnpj = pstt.getString("cnpj");
            endereco = pstt.getString("endereco");
            telefone = pstt.getString("telefone");
            senha = pstt.getString("senha");
            JOptionPane.showMessageDialog(null, "Meus dados:" + "\n" + "-----------------------------" + "\n"
                    + "Nome: " + nome + "\n" + "E-mail: " + email + "\n" + "CNPJ: " + "\n" + cnpj + "Endereço: " + endereco + "\n"
                    + "Telefone: " + telefone + "\n" + "Senha: " + senha);
            MenuComercio.Menu();
        }

    }

}
