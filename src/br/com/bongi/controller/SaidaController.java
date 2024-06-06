package br.com.bongi.controller;

import br.com.bongi.model.Saida;
import br.com.bongi.repository.SaidaRepository;

import java.util.List;
import java.util.Scanner;

public class SaidaController {
    private SaidaRepository saidaRepository = new SaidaRepository();

    public void registrarSaida(Scanner scanner) {
        try {
            System.out.println("Registrar Saída:");
            System.out.print("Nome do pet (ou digite 'cancelar' para cancelar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("cancelar")) return;

            System.out.print("Raça: ");
            String raca = scanner.nextLine();
            System.out.print("Assinatura do responsável: ");
            String assinatura = scanner.nextLine();

            System.out.print("Dia da saída: ");
            String dia = scanner.nextLine();
            System.out.print("Mês da saída: ");
            String mes = scanner.nextLine();
            String ano = "2024"; // ano fixo
            String data = dia + "/" + mes + "/" + ano;

            Saida saida = new Saida(nome, raca, assinatura, data);
            saidaRepository.add(saida);
            System.out.println("Saída registrada com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao registrar saída: " + e.getMessage());
        }
    }

    public void listarSaidas() {
        List<Saida> saidas = saidaRepository.list();
        if (saidas.isEmpty()) {
            System.out.println("Nenhuma saída registrada.");
        } else {
            System.out.println("Lista de Saídas:");
            for (Saida saida : saidas) {
                System.out.println("--------------------------------------------------");
                System.out.println("Nome do Pet: " + saida.getNome());
                System.out.println("Raça: " + saida.getRaca());
                System.out.println("Assinatura do Responsável: " + saida.getAssinatura());
                System.out.println("Data: " + saida.getData());
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
