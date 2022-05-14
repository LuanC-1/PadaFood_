package Classes;

import static Classes.ClienteClass.setEmail;
import static Classes.ClienteClass.setSenha;
import javax.swing.JOptionPane;

public class ComercioClass {

    //Atributos
    private static String nome, email, cnpj, endereco, telefone, senha, id;
    private static boolean estado;

    //Contrutor
    public ComercioClass() {
        estado = false;
    }

    //Metodos
    public static void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
        String a, b, c, d, e, f;

        JOptionPane.showMessageDialog(null, " ----------------------------------------\n"
                + " CADASTRAR COMÉRCIO\n ----------------------------------------");
        a = JOptionPane.showInputDialog(" Nome da Empresa: ");
        setNome(a);
        b = JOptionPane.showInputDialog(" Email: ");
        setEmail(b);
        c = JOptionPane.showInputDialog(" CNPJ: ");
        setCnpj(c);
        d = JOptionPane.showInputDialog(" Senha: ");
        setSenha(d);
        e = JOptionPane.showInputDialog(" Telefone: ");
        setTelefone(e);
        f = JOptionPane.showInputDialog(" Endereço: ");
        setEndereco(f);
        setEstado(true);
        JOptionPane.showMessageDialog(null, "\n CADASTRADO COM SUCESSO!!    "
                + "\n\n Seja Bem-Vindo " + getNome() + "!!\n");

    }

    public static void Login() {
        String a, b;
        JOptionPane.showMessageDialog(null, "\n ----------------------------------------\n"
                + " LOGIN COMÉRCIO\n ----------------------------------------");
        a = JOptionPane.showInputDialog(" CNPJ: ");
        setCnpj(a);
        b = JOptionPane.showInputDialog(" Senha: ");
        setSenha(b);
    }

    public void Print() {
        JOptionPane.showMessageDialog(null, "Confirmar visualização de dados pessoais?");
    }

    //Get and Set
    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        ComercioClass.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        ComercioClass.email = email;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        ComercioClass.cnpj = cnpj;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        ComercioClass.endereco = endereco;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        ComercioClass.telefone = telefone;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ComercioClass.senha = senha;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        ComercioClass.id = id;
    }

    public static boolean isEstado() {
        return estado;
    }

    public static void setEstado(boolean estado) {
        ComercioClass.estado = estado;
    }

}
