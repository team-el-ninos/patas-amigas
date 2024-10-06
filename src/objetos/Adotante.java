package objetos;

import java.util.Date;
import java.util.List;

public class Adotante extends Pessoa {
    private String codigo;
    private String preferenciaDeAdocao;
    private List<Historico> historicoAdocoes;
    private boolean status;

    public Adotante(String nome, Date dataDeNascimento, char genero, String CPF, Endereco endereco, Telefone telefone, String email, String senha, String codigo, String preferenciaDeAdocao, List<Historico> historicoAdocoes, boolean status) {
        super(nome, dataDeNascimento, genero, CPF, endereco, telefone, email, senha);
        this.codigo = codigo;
        this.preferenciaDeAdocao = preferenciaDeAdocao;
        this.historicoAdocoes = historicoAdocoes;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreferenciaDeAdocao() {
        return preferenciaDeAdocao;
    }

    public void setPreferenciaDeAdocao(String preferenciaDeAdocao) {
        this.preferenciaDeAdocao = preferenciaDeAdocao;
    }

    public List<Historico> getHistoricoAdocoes() {
        return historicoAdocoes;
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
