package MODEL;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double preco_unitario;

    public Produto() {
    }

    public Produto(int codigo, String nome, int quantidade, double preco_unitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public void Cadastrar_Produto(Produto produto) {
    }

    public void Editar_Produti(Produto produto) {
    }

    public void Exluir_Produto(Produto produto) {
    }
}
