public class Endereco {
    private String nome;
    private String logradouro;
    private int numero;

    public Endereco(String nome, String logradouro, int numero) {
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
