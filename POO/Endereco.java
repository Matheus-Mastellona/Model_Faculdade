package POO;

class Endereco {
    private String rua, bairro;
    private int cep, numero;

    public String getBairro() {
        return this.bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public int getCep() {
        return this.cep;
    }

    public int getNumero() {
        return this.numero;
    }

    public Endereco() {
        super();
    }

    public Endereco(String rua, String bairro, int cep, int numero) {
        super();
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "| Endereco |" +
                " Rua: '" + rua + '\'' +
                ", Bairro: '" + bairro + '\'' +
                ", Cep: " + cep +
                ", Numero: " + numero ;

    }
}
