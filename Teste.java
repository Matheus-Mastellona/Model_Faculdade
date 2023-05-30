/* Mais abstração generalizado, menos abstração mais especifico

public class Aluno {
    private String nome;
    private int idade;

    public Aluno() { // Construtor com 2 parametros String e int
        this.Aluno(null, 0);
    }

    public Aluno() { // Construtor com 2  parametros String e int
        this.nome = null;
        this.idade = 0;
    } // Construtor com 1 parametros String

    public Aluno(String nome) { // quando já existir construtor com os parametros podemos adicionar esse
        this.Aluno(nome, 0); // 'this' significa que o atributo ou objeto que está sendo usado é da própria clase
    }

    // Construtor com 2 parametros String e int
    public Aluno(String nome, int idade) { // Forma mais simplificada de usar com construtor
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return (this.nome);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int idade() {
        return (this.idade);
    }


    public void aa() {
        System.out.println(this.nome + "" + this.idade);
    }
}

class B {

    private Aluno a = new Aluno(); // objeto instanciado e inicializado logo so vai ler ou o a
    // private Aluno a; // Instancia de Aluno

    public void bb() {
        a = new Aluno("Cainã", 23); // Forma mais facilitada de traballhar com o construtor + objeto mais limpo
        a.setNome("Marcela");
        a.setIdade(20);
        System.out.println(a.getNome + "" + a.getIdade);
    }

    public void cc() {
        a = new Aluno(); // Inicialização do objeto 'a' em memória, o objeto 'a' representa a classe/tipo Aluno
        a.setNome("Cainã");
        a.setIdade(23);
        System.out.println();
    }
}

 */


