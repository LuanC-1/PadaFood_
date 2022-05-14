package Interfaces;

import Classes.ClienteClass;
import DAO.ClienteDAO;
import Instancia.ClienteIns;
import Main.MainProject;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuCliente {

    public static void Menu() throws SQLException {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(" -------------------------------------------------------------- \n"
                    + " Bem Vindo !!" + "\n"
                    + " -------------------------------------------------------------- \n"
                    + " 1) Comprar\n"
                    + " 2) Carrinho\n"
                    + " 3) Informações do Usuário\n"
                    + " -------------------------------------------------------------- \n"
                    + " 4) Sair\n"
                    + "\n Opção:"));

            switch (op) {
                case 1:
                    ClienteIns.comprar();//Precisa criar
                    break;
                //case 2: Carrinho(); break; //Precisa criar
                case 3:
                    ClienteIns.print2();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opção Inválida!");
                    Menu();
                    break;
            }

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
            JOptionPane.showMessageDialog(null, "\n Exception: " + e + "\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");
            Menu();
        }
    }
}
