package POO;

import java.util.ArrayList;

class Professor extends Funcionario {

    private String areaPesquisa, titulacao; // 1 (Pós-Graduação) 2 (Mestrado) 3(Doutorado) 4(Pós-doc)

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Professor() {
        super();
    }

    public Professor(String nome, int cpf, int telefone, int fatSalario, String titulacao, String areaPesquisa, Endereco endereco) {
        super(nome, cpf, telefone, fatSalario, endereco);
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;
    }

    @Override
    public String toString() {
        return "\n| Professor |" +
                " Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Telefone: " + getTelefone() +
                ", Salário: " + getFatSalario() +
                ", Titulacao: " + getTitulacao() +
                ", AreaPesquisa: '" + getAreaPesquisa() +
                " |\n" + getEndereco() +
                " |";
    }
}
