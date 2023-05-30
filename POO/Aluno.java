package POO;

import java.util.ArrayList;

class Aluno {
    private Curso curso;
    private Endereco endereco;
    protected ArrayList<Disciplina> lstDisciplinaCursada = new ArrayList<Disciplina>();
    protected ArrayList<Disciplina> lstDisciplinaACursar = new ArrayList<Disciplina>();
    private String nome,matricula ,status; // status 1(Cursando) 2(Trancado)
    private double mediaGlobal;
    private int cpf;

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getStatus() {
        return this.status;
    }

    public int getCpf() {
        return this.cpf;
    }

    public double getMediaGlobal() {
        return this.mediaGlobal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMediaGlobal(double mediaGlobal) {
        this.mediaGlobal = mediaGlobal;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void AdicionarDisciplianACursa(Disciplina disciplina) {
        this.lstDisciplinaACursar.add(disciplina);
    }

    public void AdicionarDisciplianCursada(Disciplina disciplina) {
        this.lstDisciplinaCursada.add(disciplina);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, double mediaGlobal, String matricula, int cpf, String status, Curso curso,  Endereco endereco) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.mediaGlobal = mediaGlobal;
        this.status = status;
        this.matricula = matricula;
        this.endereco = endereco;
        this.curso = curso;
    }

    public String toString() {
        return "\n| Aluno |" +
                " Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Media Global: " + getMediaGlobal() +
                ", Status: " + getStatus() +
                ", Matrícula: " + getMatricula() +
                " | \n" + getEndereco() +
                " | \n" + getCurso()  +
                " | \n| Disciplina Cursada | " + lstDisciplinaCursada +
                "  \n| Disciplina a Cursar | " + lstDisciplinaACursar;
    }
}
