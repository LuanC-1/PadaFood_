package Classes;

import DAO.ClienteDAO;
import javax.swing.JOptionPane;

public class ClienteClass {

    // Atributos
    private static String nome, email, endereco, telefone, senha, id;
    private static boolean estado;

    // Construtor vazio para adicionar os dados
    public ClienteClass() {
        estado = false;
    }

    // Metodos
    public static void Cadastrar() {
        String a, b, c, d, e;

        JOptionPane.showMessageDialog(null, "\n ----------------------------------------\n"
                + " CADASTRO CLIENTE\n ----------------------------------------");
        a = JOptionPane.showInputDialog(" Nome: ");
        setNome(a);
        b = JOptionPane.showInputDialog(" Email: ");
        setEmail(b);
        c = JOptionPane.showInputDialog(" Endereço: ");
        setEndereco(c);
        d = JOptionPane.showInputDialog("Telefone: ");
        setTelefone(d);
        e = JOptionPane.showInputDialog("Senha: ");
        setSenha(e);
        setEstado(true);

        JOptionPane.showMessageDialog(null, "\n CADASTRADO COM SUCESSO!!"
                + "\n\n SEJA BEM VINDO " + getNome() + "!!\n");
    }

    public static void Login() {
        String a, b;
        JOptionPane.showMessageDialog(null, "\n ----------------------------------------\n"
                + " LOGIN CLIENTE\n ----------------------------------------");
        a = JOptionPane.showInputDialog(" Email: ");
        setEmail(a);
        b = JOptionPane.showInputDialog(" Senha: ");
        setSenha(b);
    }

    public void Print() {
        JOptionPane.showMessageDialog(null, "Confirmar visualização de dados pessoais?");
    }

    // Get and Set
    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        ClienteClass.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        ClienteClass.email = email;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        ClienteClass.endereco = endereco;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        ClienteClass.telefone = telefone;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ClienteClass.senha = senha;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        ClienteClass.id = id;
    }

    public static boolean isEstado() {
        return estado;
    }

    public static void setEstado(boolean estado) {
        ClienteClass.estado = estado;
    }

}
