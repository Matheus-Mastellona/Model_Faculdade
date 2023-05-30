package POO;

class Curso {
    private String nome;
    private int duracao, codigo;

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public  Curso(){
        super();
    }

    public  Curso(String nome, int duracao, int codigo){
        super();
        this.nome = nome;
        this.duracao = duracao;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "| Curso |" +
                " Nome: " + getNome()  +
                ", Duracao: " + getDuracao() +
                " hs, Codigo: " + getCodigo() ;
    }
}
