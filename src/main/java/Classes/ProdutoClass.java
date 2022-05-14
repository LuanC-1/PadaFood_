package Classes;

import Instancia.ProdutoIns;
import Interfaces.LogineCadastro;
import Interfaces.MenuComercio;
import static Main.MainProject.Menu;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class ProdutoClass {

    //Atributos 
    private static String nome;
    private static double preco;

    // contrutores 
    public ProdutoClass() {

    }

    //metodos 
    public static void Cadastrar1() {
        Double b;
        String a;
        JOptionPane.showMessageDialog(null, "\n ----------------------------------------\n"
                + " CADASTRO PRODUTO\n ----------------------------------------");
        a = JOptionPane.showInputDialog(" Nome: ");
        setNome(a);
        b = Double.parseDouble(JOptionPane.showInputDialog(" Preço: "));
        setPreco(b);
        JOptionPane.showMessageDialog(null, "\n CADASTRADO COM SUCESSO!!");
    }

    public static void Recadastrar() throws SQLException {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(
                " -------------------------------------------------------------- \n"
                + " ESCOLHA A OPÇÃO\n"
                + " -------------------------------------------------------------- \n"
                + " 1) Cadatrar Novo Produto\n 2) Voltar\n"
                + " -------------------------------------------------------------- \n"));

        switch (op) {

            case 1:
                ProdutoIns.Cadastrar();
                break;
            case 2:
                MenuComercio.Menu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "\n Opcao Inválida!!");
                LogineCadastro.Login();
                break;
        }

    }
//Get and Set

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        ProdutoClass.nome = nome;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        ProdutoClass.preco = preco;
    }

}
