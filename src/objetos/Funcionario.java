package objetos;

import java.util.Date;

public class Funcionario extends Pessoa{
    private String codigo;
    private Date dataDeContratacao;
    private String cargo;
    private double salario;
    private int  departamento;

    public Funcionario(String nome, Date dataDeNascimento, char genero, String CPF, Endereco endereco, Telefone telefone, String email, String senha, String codigo, Date dataDeContratacao, String cargo, double salario, int departamento) {
        super(nome, dataDeNascimento, genero, CPF, endereco, telefone, email, senha);
        this.codigo = codigo;
        this.dataDeContratacao = dataDeContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
}
