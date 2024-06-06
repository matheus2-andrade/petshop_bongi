package br.com.bongi.controller;

import java.util.Scanner;

public interface IPetController {
    void cadastrarPet(Scanner scanner);
    void listarPets();
    void atualizarPet(Scanner scanner);
    void deletarPet(Scanner scanner);
}
