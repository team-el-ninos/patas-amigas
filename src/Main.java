import objetos.*;
import objetos.Tutores;
import java.io.IOException;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Tutor> tutores = new ArrayList<>();
    private static List<Adotante> adotantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+---------------------+");
            System.out.println("|   MENU PRINCIPAL    |");
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

    private static void cadastrar(Scanner scanner) throws ParseException {
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

                    System.out.print("Data de nascimento (dia/mes/ano): ");

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataNascimentoTutor = sdf.parse(scanner.nextLine());

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

                    String codigoTutor = gerarCodigo("Tutor");

                    Tutor novoTutor = new Tutor(nomeTutor, dataNascimentoTutor, generoTutor, cpfTutor, enderecoTutor,
                            telefoneTutor, emailTutor, senhaTutor, codigoTutor, animaisSobCustodia, true);
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

    private static String gerarCodigo(String tipo) {
        StringBuilder stringBuilder = new StringBuilder();
        if (tipo.equalsIgnoreCase("tutor")){
            stringBuilder.append("T0");
            stringBuilder.append(tutores.size());
        } else if (tipo.equalsIgnoreCase("funcionario")) {
            stringBuilder.append("F0");
            stringBuilder.append(funcionarios.size());
        } else if (tipo.equalsIgnoreCase("adotante")) {
            stringBuilder.append("A0");
            stringBuilder.append(adotantes.size());
        }

        return stringBuilder.toString();
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
                    ordenarTutor(scanner);
                    break;
                case 2:
                    ordenarFuncionario(scanner);
                    break;
                case 3:
                    ordenarAdotante(scanner);
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 4);
    }

    private static void ordenarTutor(Scanner scanner) {
        clearScreen();
        int choice;
        do {
            System.out.println("+-------------------------+");
            System.out.println("|      ORDENAR TUTOR      |");
            System.out.println("+-------------------------+");
            System.out.println("| 1. Nome                 |");
            System.out.println("| 2. Animais Sob Custódia |");
            System.out.println("| 3. Ordem de entrada     |");
            System.out.println("| 4. Voltar               |");
            System.out.println("+-------------------------+");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Tutor tutor: tutores.stream()
                            .sorted(Comparator.comparing(Tutor::getNome))
                            .toList()){
                        // TODO
                    }
                    break;
                case 2:
                    for (Tutor tutor: tutores.stream()
                            .sorted(Comparator.comparing(Tutor::getAnimaisSobCustodia))
                            .toList()){
                        // TODO
                    }
                    break;
                case 3:
                    for (Tutor tutor: tutores){
                        // TODO
                    }
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 4);
    }

    private static void ordenarFuncionario(Scanner scanner) {
        clearScreen();
        int choice;
        do {
            System.out.println("+------------------------+");
            System.out.println("|  ORDENAR FUNCIONARIO   |");
            System.out.println("+------------------------+");
            System.out.println("| 1. Nome                |");
            System.out.println("| 2. Data de Contratação |");
            System.out.println("| 3. Ordem de entrada    |");
            System.out.println("| 4. Voltar              |");
            System.out.println("+------------------------+");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Funcionario funcionario: funcionarios.stream()
                            .sorted(Comparator.comparing(Funcionario::getNome))
                            .toList()){
                        // TODO
                    }
                break;
                case 2:
                    for (Funcionario funcionario: funcionarios.stream()
                            .sorted(Comparator.comparing(Funcionario::getDataDeContratacao))
                            .toList()){
                        // TODO
                    }
                break;
                case 3:
                    for (Funcionario funcionario: funcionarios){
                        // TODO
                    }
                break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 4);
    }

    private static void ordenarAdotante(Scanner scanner) {
        clearScreen();
        int choice;
        do {
            System.out.println("+-------------------------+");
            System.out.println("|     ORDENAR ADOTANTE    |");
            System.out.println("+-------------------------+");
            System.out.println("| 1. Nome                 |");
            System.out.println("| 2. Preferencias         |");
            System.out.println("| 3. Ordem de entrada     |");
            System.out.println("| 4. Voltar               |");
            System.out.println("+-------------------------+");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Adotante adotante: adotantes.stream()
                            .sorted(Comparator.comparing(Adotante ::getNome))
                            .toList()){
                        // TODO
                    }
                    break;
                case 2:
                    for (Adotante adotante: adotantes.stream()
                            .sorted(Comparator.comparing(Adotante ::getPreferenciaDeAdocao))
                            .toList()){
                        // TODO
                    }
                    break;
                case 3:
                    for (Adotante adotante: adotantes){
                        // TODO
                    }
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