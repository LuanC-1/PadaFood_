package Classes;

import java.util.ArrayList;

public class CarrinhoClass {

    //Atributos
    private ArrayList<ProdutoClass> lista = new ArrayList<>();

    //contrutor
    public CarrinhoClass() {
    }

    //Getters and Setters
    public ArrayList<ProdutoClass> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ProdutoClass> lista) {
        this.lista = lista;
    }

}
