package POO;

class Disciplina {
    private String nome;
    private int semestre, cargaHora, ano; // semestre 1 ou 2
    private double codigo, credito;

    public String getNome() {
        return this.nome;
    }

    public double getCodigo() {
        return this.codigo;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public int getCargaHora() {
        return this.cargaHora;
    }

    public int getAno() {
        return this.ano;
    }

    public double getCredito() {
        return this.credito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public void setCargaHora(int cargaHora) {
        this.cargaHora = cargaHora;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Disciplina() {
        super();
    }

    public Disciplina(String nome, int semestre, int ano, double codigo, int cargaHora, double credito) {
        super();
        this.ano = ano;
        this.nome = nome;
        this.credito = credito;
        this.codigo = codigo;
        this.cargaHora = cargaHora;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return " Disciplina |" +
                " Nome: " + getNome()  +
                ", Semestre: " + getSemestre() +
                ", Ano: " + getAno() +
                ", Código: " + getCodigo() +
                ", Carga Horária: " + getCargaHora() +
                " h, Credito: " + getCodigo() ;
    }
}
