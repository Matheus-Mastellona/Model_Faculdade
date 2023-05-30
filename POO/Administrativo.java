package POO;

class Administrativo extends Funcionario {

    private String cargo, departamento;

    public String getCargo() {
        return this.cargo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Administrativo() {
        super();
    }

    public Administrativo(String nome, int cpf, int telefone, int fatSalario, String cargo, String departamento, Endereco endereco) {
        super(nome, cpf, telefone, fatSalario, endereco);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String toString() {
        return "\n| Administrativo |" +
                " Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Telefone: " + getTelefone() +
                ", Salário: " + getFatSalario() +
                ", Cargo: " + getCargo() +
                ", Departamento: '" + getDepartamento() +
                " |\n" + getEndereco()   +
                " |";
    }
}
