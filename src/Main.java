import objetos.Funcionario;
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
                    System.out.println("Cadastrando Tutor... (TODO)");
                    break;
                case 2:
                    System.out.println("Cadastrando Funcionário... (TODO)");
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