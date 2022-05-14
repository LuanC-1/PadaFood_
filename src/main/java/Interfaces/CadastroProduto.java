package Interfaces;

import Instancia.ProdutoIns;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroProduto {

    public static void Login() throws SQLException {

        int op;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n "
                    + " Escolha o tipo de Login\n"
                    + " ----------------------------------------\n"
                    + " 1) Cadastrar Novo Produto\n"
                    + " 2) Voltar \n"
                    + " ----------------------------------------\n"
                    + "\n Opção:"));

            switch (op) {
                case 1:
                    ProdutoIns.Cadastrar();
                    break;
                case 2:
                    MenuComercio.Menu();
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
        }
    }
}
