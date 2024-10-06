import objetos.Endereco;
import objetos.Funcionario;
import objetos.Telefone;
import objetos.Tutores;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Tutores> tutores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+---------------------+");
            System.out.println("|      MENU PRINCIPAL |");
            System.out.println("+---------------------+");
            System.out.println("| 1. Cadastrar        |");
            System.out.println("| 2. Listar           |");
            System.out.println("| 3. Sair             |");
            System.out.println("+---------------------+");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cadastrar(scanner);
                    break;
                case 2:
                    listar(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void cadastrar(Scanner scanner) {
        clearScreen();
        int choice;
        do {
            System.out.println("+--------------------------+");
            System.out.println("|         CADASTRAR        |");
            System.out.println("+--------------------------+");
            System.out.println("| 1. Cadastrar Tutor       |");
            System.out.println("| 2. Cadastrar Funcionário |");
            System.out.println("| 3. Cadastrar Adotante    |");
            System.out.println("| 4. Voltar                |");
            System.out.println("+--------------------------+");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Cadastro Tutor:");
                    System.out.print("Nome tutor: ");
                    String nomeTutor = scanner.nextLine();

                    System.out.print("Data de nascimento: ");
                    String dataNascimentoTutor = scanner.nextLine();

                    System.out.print("Gênero [M/F/O]: ");
                    char generoTutor = scanner.nextLine().charAt(0);

                    System.out.print("CPF: ");
                    String cpfTutor = scanner.nextLine();

                    System.out.println("Endereço:");
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();
                    scanner.nextLine();  
                    System.out.print("Bairro: ");
                    String bairro = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    Endereco enderecoTutor = new Endereco(rua, numero, bairro, cidade, estado, cep);

                    System.out.println("Telefone:");
                    System.out.print("DDD: ");
                    String ddd = scanner.nextLine();
                    System.out.print("Número do telefone: ");
                    String numeroTelefone = scanner.nextLine();
                    Telefone telefoneTutor = new Telefone(ddd, numeroTelefone);

                    System.out.print("Email: ");
                    String emailTutor = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senhaTutor = scanner.nextLine();

                    System.out.print("Animais sob custódia: ");
                    int animaisSobCustodia = scanner.nextInt();

                    Tutores novoTutor = new Tutores(nomeTutor, dataNascimentoTutor, generoTutor, cpfTutor, enderecoTutor, telefoneTutor, emailTutor, senhaTutor, animaisSobCustodia, true);
                    tutores.add(novoTutor);
                    System.out.println("Tutor cadastrado com sucesso");
                    break;

                case 2:
                    System.out.println("Cadastro Funcionário:");
                    System.out.print("Nome funcionário: ");
                    String nomeFuncionario = scanner.nextLine();

                    System.out.print("Data de nascimento: ");
                    String dataNascimentoFuncionario = scanner.nextLine();

                    System.out.print("Gênero [M/F/O]: ");
                    char generoFuncionario = scanner.nextLine().charAt(0);

                    System.out.print("CPF: ");
                    String cpfFuncionario = scanner.nextLine();

                    System.out.println("Endereço:");
                    System.out.print("Rua: ");
                    String rua1 = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero1 = scanner.nextLine();
                    scanner.nextLine();  
                    System.out.print("Bairro: ");
                    String bairro1 = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade1 = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado1 = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep1 = scanner.nextLine();
                    Endereco enderecoFuncionario = new Endereco(rua, numero, bairro, cidade, estado, cep);

                    System.out.println("Telefone:");
                    System.out.print("DDD: ");
                    String ddd1 = scanner.nextLine();
                    System.out.print("Número do telefone: ");
                    String numeroTelefone1 = scanner.nextLine();
                    Telefone telefoneFuncionario = new Telefone(ddd, numeroTelefone);

                    System.out.print("Email: ");
                    String emailFuncionario = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senhaFuncionario = scanner.nextLine();

                     System.out.print("Data de contratação: ");
                    String dataContratacaoFuncionario = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargoFuncionario = scanner.nextLine();

                    System.out.print("Salário: ");
                    double salarioFuncionario = scanner.nextDouble();
                    scanner.nextLine();  

                    System.out.print("Departamento: ");
                    int departamentoFuncionario = scanner.nextInt();
                    scanner.nextLine();  


                    Funcionario novoFuncionario = new Funcionario(nomeFuncionario, dataNascimentoFuncionario, generoFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, emailFuncionario, senhaFuncionario, dataContratacaoFuncionario, 
                                                                   cargoFuncionario, salarioFuncionario, departamentoFuncionario);
                    funcionarios.add(novoFuncionario);
                    System.out.println("Funcionário cadastrado com sucesso");
                    break;

                case 3:
                    System.out.println("Cadastrando Adotante... (TODO)");
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 4);
    }

    private static void listar(Scanner scanner) {
        clearScreen();
        int choice;
        do {
            System.out.println("+------------------------+");
            System.out.println("|         LISTAR         |");
            System.out.println("+------------------------+");
            System.out.println("| 1. Listar Tutores      |");
            System.out.println("| 2. Listar Funcionários |");
            System.out.println("| 3. Listar Adotantes    |");
            System.out.println("| 4. Voltar              |");
            System.out.println("+------------------------+");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Listando Tutores... (TODO)");
                    break;
                case 2:
                    System.out.println("Listando Funcionários... (TODO)");
                    break;
                case 3:
                    System.out.println("Listando Adotantes... (TODO)");
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 4);
    }

    private static void clearScreen() {
        //TODO
    }


}