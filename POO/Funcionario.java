package POO;

public class Funcionario {
    private Endereco endereco;
    private String nome;
    private int telefone, cpf, fatSalario;

    public String getNome() {
        return this.nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public int getCfp() {
        return this.cpf;
    }

    public int getFatSalario() {
        return this.fatSalario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setFatSalario(int fatSalario) {
        this.fatSalario = fatSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario() {super();}

    public Funcionario(String nome, int cpf, int telefone, int fatSalario, Endereco endereco) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.fatSalario = fatSalario;
        this.endereco = endereco;
    }

}


