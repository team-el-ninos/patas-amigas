package objetos;

import java.util.Date;

public class Historico {
    private Date dataDaAdocao;
    private String nomeDoAnimal;
    private String nomeDoTutor;
    private String nomeDoAdotante;

    public Historico(Date dataDaAdocao, String nomeDoAnimal, String nomeDoTutor, String nomeDoAdotante) {
        this.dataDaAdocao = dataDaAdocao;
        this.nomeDoAnimal = nomeDoAnimal;
        this.nomeDoTutor = nomeDoTutor;
        this.nomeDoAdotante = nomeDoAdotante;
    }

    public Date getDataDaAdocao() {
        return dataDaAdocao;
    }

    public void setDataDaAdocao(Date dataDaAdocao) {
        this.dataDaAdocao = dataDaAdocao;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getNomeDoTutor() {
        return nomeDoTutor;
    }

    public void setNomeDoTutor(String nomeDoTutor) {
        this.nomeDoTutor = nomeDoTutor;
    }

    public String getNomeDoAdotante() {
        return nomeDoAdotante;
    }

    public void setNomeDoAdotante(String nomeDoAdotante) {
        this.nomeDoAdotante = nomeDoAdotante;
    }
}
