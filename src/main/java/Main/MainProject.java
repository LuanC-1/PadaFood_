package Main;

import Classes.ClienteClass;
import DAO.ClienteDAO;
import Instancia.ClienteIns;
import Interfaces.LogineCadastro;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class MainProject {

    public static void Menu() throws SQLException {

        int op;

        // Menu de opções
        // Exception para aceitar apenas Números
        try {

            op = Integer.parseInt(JOptionPane.showInputDialog(
                    " -------------------------------------------------------------- \n"
                    + " ESCOLHA A OPÇÃO\n"
                    + " -------------------------------------------------------------- \n"
                    + " 1) Login\n 2) Cadastro\n 3) Informações do Sistema\n"
                    + " -------------------------------------------------------------- \n"
                    + " 4) Sair\n\n Opção: "));

            switch (op) {
                case 1:
                    LogineCadastro.Login();
                    break;
                case 2:
                    LogineCadastro.Cadastro();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, " -------------------------------------------------------------- \n"
                            + "Novidadades" + "\n"
                            + " -------------------------------------------------------------- " + "\n"
                            + "VERSÃO 1.0" + "\n"
                            + " -------------------------------------------------------------- \n");
                    MainProject.Menu();
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\n Opcao Inválida!!");
                    Menu();
                    break;
            }

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
            JOptionPane.showMessageDialog(null, "\n Exception: " + e + "\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");
            MainProject.Menu();
        }
    }

    public static void main(String[] args) throws SQLException, MalformedURLException {
        // Alterando Fonte do JOptionPane
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 14)));

        // Gif no JOptionPane
        final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/5tyVfiF.gif"));

        JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE, icon);
        JOptionPane.showMessageDialog(null,
                "\n -------------------------------------------------\n "
                + "BEM VINDO AO PADAFOOD\n "
                + "-------------------------------------------------");
        Menu();
    }
}
