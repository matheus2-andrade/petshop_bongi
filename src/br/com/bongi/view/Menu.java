package br.com.bongi.view;

import br.com.bongi.controller.PetController;
import br.com.bongi.controller.SaidaController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private PetController petController = new PetController();
    private SaidaController saidaController = new SaidaController();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Cadastrar Pet");
                System.out.println("2. Listar Pets");
                System.out.println("3. Atualizar Pet");
                System.out.println("4. Deletar Pet");
                System.out.println("5. Registrar Saída");
                System.out.println("6. Listar Saídas");
                System.out.println("0. Sair");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (opcao) {
                    case 1:
                        petController.cadastrarPet(scanner);
                        break;
                    case 2:
                        petController.listarPets();
                        break;
                    case 3:
                        petController.atualizarPet(scanner);
                        break;
                    case 4:
                        petController.deletarPet(scanner);
                        break;
                    case 5:
                        saidaController.registrarSaida(scanner);
                        break;
                    case 6:
                        saidaController.listarSaidas();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }
}
