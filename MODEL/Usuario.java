package MODEL;

public class Usuario {

    private int codigo;
    private String nome;
    private String dtnascimento;
    private String sexo;
    private String cpf;
    private String rg;
    private Contato contato;
    private Endereco endereco;

    public Usuario() {
        contato = new Contato();
        endereco = new Endereco();
    }

    public Usuario(int codigo, String nome, String dtnascimento, String sexo, String cpf, String rg, Contato contato, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.dtnascimento = dtnascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.contato = contato;
        this.endereco = endereco;
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

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(String telefone) {
        this.contato = new Contato(telefone);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String cidade) {
        this.endereco = new Endereco(cidade);
    }

    public void CadstrarUsuario(Usuario usuario) {
    }

    public void ExcluirUsuario(Usuario usuario) {
    }
    
    public void EditarUsuario(Usuario usuario){
    
    }

}
