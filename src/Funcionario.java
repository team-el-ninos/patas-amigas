import java.util.Date;

public class Funcionario extends Pessoa {
    private String codigo;
    private Date dataDeContratacao;
    private String cargo;
    private Double salario;
    private int departamento;
    

    public Funcionario(String nome, Date dataDeNascimento, int genero, String CPF, Endereco endereco, Telefone telefone, String email, String senha, String codigo, Date dataDeContratacao, String cargo, double salario, int departamento) {
        super(nome, dataDeNascimento, genero, CPF, endereco, telefone, email, senha);
        this.codigo = codigo;
        this.dataDeContratacao = dataDeContratacao;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
    

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataDeContratacao() {
        return this.dataDeContratacao;
    }

    public void setDataDeContratacao(Date dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

}
