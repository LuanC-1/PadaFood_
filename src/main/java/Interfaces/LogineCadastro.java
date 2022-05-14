package Interfaces;

import Classes.ClienteClass;
import Instancia.ClienteIns;
import Instancia.ComercioIns;
import Main.MainProject;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luanc
 */
public class LogineCadastro {

    public static void Cadastro() throws SQLException {
        int op;
        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n "
                    + " Escolha o tipo de Cadastro\n"
                    + " ----------------------------------------\n"
                    + " 1) Cliente\n"
                    + " 2) Comércio\n"
                    + " ----------------------------------------\n"
                    + " 3) Voltar\n"
            ));
            switch (op) {
                case 1:
                    ClienteIns.Cadastro();
                    break;
                case 2:
                    ComercioIns.Cadastro();
                    break;
                case 3:
                    MainProject.Menu();
                    break;

            }

        } catch (NumberFormatException e) { //Verifica se o dado de entrada é um numero inteiro 
            JOptionPane.showMessageDialog(null, "\n Exception: " + e + "\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");
        }

    }

    public static void Login() throws SQLException {

        int op;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n "
                    + " Escolha o tipo de Login\n"
                    + " ----------------------------------------\n"
                    + " 1) Cliente\n"
                    + " 2) Comércio\n"
                    + " ----------------------------------------\n"
                    + " 3) Voltar\n"
                    + "\n Opção:"));

            switch (op) {
                case 1:
                    ClienteIns.Login2();
                    break;
                case 2:
                    ComercioIns.Login();
                    break;
                case 3:
                    MainProject.Menu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opção Inválida!");
                    Login();
                    break;
            }

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
            JOptionPane.showMessageDialog(null, "\n Exception: " + e + "\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");
            Login();
        }

    }
}
