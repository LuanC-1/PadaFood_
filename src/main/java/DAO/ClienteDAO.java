package DAO;

import Classes.ClienteClass;
import ConexaoDB.ConexaoDB;
import Instancia.ClienteIns;
import Interfaces.LogineCadastro;
import Interfaces.MenuCliente;
import Main.MainProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.StringJoiner;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
        this.connection = new ConexaoDB().getConnection();
    }

    public void Adiciona(ClienteClass clienteClass) throws SQLException {
        String sql = ("insert into tb_usuario (nome,email,endereco,telefone,senha,estado) VALUES(?,?,?,?,?,?)");
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, ClienteClass.getNome());
            pst.setString(2, ClienteClass.getEmail());
            pst.setString(3, ClienteClass.getEndereco());
            pst.setString(4, ClienteClass.getTelefone());
            pst.setString(5, ClienteClass.getSenha());
            pst.setBoolean(6, ClienteClass.isEstado());
            pst.execute();
            pst.close();
            ClienteIns.Login2();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void Login1(ClienteClass clienteClass) throws SQLException {

        String sql = ("select email,senha from tb_usuario where email = ? and senha = ?");
        String email = null, pass = null;
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, ClienteClass.getEmail());
        pst.setString(2, ClienteClass.getSenha());
        ResultSet pstt = pst.executeQuery();

        if (pstt.next()) {
            email = pstt.getString("email");
            pass = pstt.getString("senha");
            if (email.equals(email) && pass.equals(pass)) {
                JOptionPane.showMessageDialog(null, "Login Efetuado");
                MenuCliente.Menu();

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha invalidos!!" + "\n" + "Tente Novamente");
                ClienteIns.Login2();
            }
        }

    }

    public void Print() throws SQLException {
        String sql = ("select * from tb_usuario where email = ? and senha = ?");
        String nome = null, email = null, endereco = null, telefone = null, senha = null;
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, ClienteClass.getEmail());
        pst.setString(2, ClienteClass.getSenha());
        ResultSet pstt = pst.executeQuery();
        if (pstt.next()) {
            nome = pstt.getString("nome");
            email = pstt.getString("email");
            endereco = pstt.getString("endereco");
            telefone = pstt.getString("telefone");
            senha = pstt.getString("senha");
            JOptionPane.showMessageDialog(null, "Meus dados:" + "\n" + "-----------------------------" + "\n"
                    + "Nome: " + nome + "\n" + "E-mail: " + email + "\n" + "Endereço: " + endereco + "\n"
                    + "Telefone: " + telefone + "\n" + "Senha: " + senha);
            MenuCliente.Menu();
        }

    }

}
