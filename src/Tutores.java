import java.util.Date;

public class Tutores extends Pessoa {
    private String codigo;
    private int animaisSobCustodia;


    public Tutores(String nome, Date dataDeNascimento, int genero, String CPF, Endereco endereco, Telefone telefone, String email, String senha, String codigo, int animaisSobCustodia) {
        super(nome, dataDeNascimento, genero, CPF, endereco, telefone, email, senha);
        this.codigo = codigo;
        this.animaisSobCustodia = animaisSobCustodia;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnimaisSobCustodia() {
        return this.animaisSobCustodia;
    }

    public void setAnimaisSobCustodia(int animaisSobCustodia) {
        this.animaisSobCustodia = animaisSobCustodia;
    }


}


