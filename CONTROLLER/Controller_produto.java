package CONTROLLER;

import MODEL.Produto;

public class Controller_produto {

    public boolean cadastrar_produto(int codigo, String nome, int quantidade, double preco_unitario) {
        if (codigo > 0 && nome != null && nome.length() > 0 && quantidade > 0 && preco_unitario > 0) {
            Produto produto = new Produto();
            produto.Cadastrar_Produto(produto);
            return true;
        }

        return false;
    }

    public boolean editar_produto(int index) {
        if (index >= 0) {
            Produto produto = new Produto();
            produto.Editar_Produti(produto);
            return true;
        }
        return false;
    }

    public boolean excluir_produto(int index) {
        if (index >= 0) {
            Produto produto = new Produto();
            produto.Exluir_Produto(produto);
            return true;

        }

        return false;
    }
}
