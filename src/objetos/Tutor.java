package objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tutor extends Pessoa {
    private String codigo;
    private int animaisSobCustodia;
    private List<Historico> historicoAdocoes;
    private boolean status;

    public Tutor(String nome, Date dataDeNascimento, char genero, String CPF, Endereco endereco, Telefone telefone, String email, String senha, String codigo, int animaisSobCustodia, List<Historico> historicoAdocoes, boolean status) {
        super(nome, dataDeNascimento, genero, CPF, endereco, telefone, email, senha);
        this.codigo = codigo;
        this.animaisSobCustodia = animaisSobCustodia;
        this.historicoAdocoes = historicoAdocoes;
        this.status = status;
    }

    public Tutor(String nome, Date dataDeNascimento, char genero, String CPF, Endereco endereco, Telefone telefone, String email, String senha, String codigo, int animaisSobCustodia, boolean status) {
        super(nome, dataDeNascimento, genero, CPF, endereco, telefone, email, senha);
        this.codigo = codigo;
        this.animaisSobCustodia = animaisSobCustodia;
        this.historicoAdocoes = new ArrayList<>();
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnimaisSobCustodia() {
        return animaisSobCustodia;
    }

    public void setAnimaisSobCustodia(int animaisSobCustodia) {
        this.animaisSobCustodia = animaisSobCustodia;
    }

    public List<Historico> showHistoricoAdocoes() {
        return historicoAdocoes;
    }

    public void appendHistorico(Historico historico){
        historicoAdocoes.add(historico);
    }

    public void removeHistorico(Historico historico){
        historicoAdocoes.remove(historico);
    }

    public void setHistoricoAdocoes(List<Historico> historicoAdocoes) {
        this.historicoAdocoes = historicoAdocoes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}


