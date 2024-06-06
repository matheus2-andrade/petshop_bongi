package br.com.bongi.controller;

import br.com.bongi.model.Dog;
import br.com.bongi.repository.PetRepository;
import br.com.bongi.exception.PetException;

import java.util.List;
import java.util.Scanner;

public class PetController implements IPetController {
    private PetRepository petRepository = new PetRepository();

    @Override
    public void cadastrarPet(Scanner scanner) {
        try {
            System.out.println("Cadastro de Pet:");
            System.out.print("Nome (ou digite 'cancelar' para cancelar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("cancelar")) return;

            System.out.print("Raça: ");
            String raca = scanner.nextLine();
            System.out.print("Tutor: ");
            String tutor = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();
            System.out.print("Tamanho: ");
            String tamanho = scanner.nextLine();
            System.out.print("Pelo: ");
            String pelo = scanner.nextLine();
            System.out.print("Ficha: ");
            String ficha = scanner.nextLine();
            System.out.print("Marcado: ");
            String marcado = scanner.nextLine();
            System.out.print("Ouvidos: ");
            String ouvidos = scanner.nextLine();
            System.out.print("Pele: ");
            String pele = scanner.nextLine();
            System.out.print("Ectoparasitas: ");
            String ectoparasitas = scanner.nextLine();
            System.out.print("Nó: ");
            String no = scanner.nextLine();
            System.out.print("Serviços: ");
            String servicos = scanner.nextLine();
            System.out.print("Recomendações: ");
            String recomendacoes = scanner.nextLine();
            System.out.print("Recepcionista: ");
            String recepcionista = scanner.nextLine();
            System.out.print("Esteticista: ");
            String esteticista = scanner.nextLine();
            System.out.print("Pertences: ");
            String pertences = scanner.nextLine();

            Dog dog = new Dog(nome, raca, tutor, telefone, sexo, tamanho, pelo, ficha, marcado, ouvidos, pele, ectoparasitas, no, servicos, recomendacoes, recepcionista, esteticista, pertences);
            petRepository.add(dog);
            System.out.println("Pet cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar pet: " + e.getMessage());
        }
    }

    @Override
    public void listarPets() {
        List<Dog> pets = petRepository.list();
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
        } else {
            System.out.println("Lista de Pets:");
            for (Dog dog : pets) {
                System.out.println("--------------------------------------------------");
                System.out.println("Nome: " + dog.getNome());
                System.out.println("Raça: " + dog.getRaca());
                System.out.println("Tutor: " + dog.getTutor());
                System.out.println("Telefone: " + dog.getTelefone());
                System.out.println("Sexo: " + dog.getSexo());
                System.out.println("Tamanho: " + dog.getTamanho());
                System.out.println("Pelo: " + dog.getPelo());
                System.out.println("Ficha: " + dog.getFicha());
                System.out.println("Marcado: " + dog.getMarcado());
                System.out.println("Ouvidos: " + dog.getOuvidos());
                System.out.println("Pele: " + dog.getPele());
                System.out.println("Ectoparasitas: " + dog.getEctoparasitas());
                System.out.println("Nó: " + dog.getNo());
                System.out.println("Serviços: " + dog.getServicos());
                System.out.println("Recomendações: " + dog.getRecomendacoes());
                System.out.println("Recepcionista: " + dog.getRecepcionista());
                System.out.println("Esteticista: " + dog.getEsteticista());
                System.out.println("Pertences: " + dog.getPertences());
                System.out.println("--------------------------------------------------");
            }
        }
    }

    @Override
    public void atualizarPet(Scanner scanner) {
        try {
            System.out.print("Nome do pet a ser atualizado (ou digite 'cancelar' para cancelar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("cancelar")) return;

            Dog dog = petRepository.findByName(nome);
            if (dog == null) {
                throw new PetException("Pet não encontrado!");
            }

            System.out.println("Escolha o campo a ser atualizado (ou digite '0' para cancelar):");
            System.out.println("1. Telefone");
            System.out.println("2. Tutor");
            System.out.println("3. Sexo");
            System.out.println("4. Tamanho");
            System.out.println("5. Pelo");
            System.out.println("6. Ficha");
            System.out.println("7. Marcado");
            System.out.println("8. Ouvidos");
            System.out.println("9. Pele");
            System.out.println("10. Ectoparasitas");
            System.out.println("11. Nó");
            System.out.println("12. Serviços");
            System.out.println("13. Recomendações");
            System.out.println("14. Recepcionista");
            System.out.println("15. Esteticista");
            System.out.println("16. Pertences");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (opcao == 0) return;

            switch (opcao) {
                case 1:
                    System.out.print("Novo telefone: ");
                    dog.setTelefone(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Novo tutor: ");
                    dog.setTutor(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Novo sexo: ");
                    dog.setSexo(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Novo tamanho: ");
                    dog.setTamanho(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Novo pelo: ");
                    dog.setPelo(scanner.nextLine());
                    break;
                case 6:
                    System.out.print("Nova ficha: ");
                    dog.setFicha(scanner.nextLine());
                    break;
                case 7:
                    System.out.print("Novo marcado: ");
                    dog.setMarcado(scanner.nextLine());
                    break;
                case 8:
                    System.out.print("Novos ouvidos: ");
                    dog.setOuvidos(scanner.nextLine());
                    break;
                case 9:
                    System.out.print("Nova pele: ");
                    dog.setPele(scanner.nextLine());
                    break;
                case 10:
                    System.out.print("Novos ectoparasitas: ");
                    dog.setEctoparasitas(scanner.nextLine());
                    break;
                case 11:
                    System.out.print("Novo nó: ");
                    dog.setNo(scanner.nextLine());
                    break;
                case 12:
                    System.out.print("Novos serviços: ");
                    dog.setServicos(scanner.nextLine());
                    break;
                case 13:
                    System.out.print("Novas recomendações: ");
                    dog.setRecomendacoes(scanner.nextLine());
                    break;
                case 14:
                    System.out.print("Novo recepcionista: ");
                    dog.setRecepcionista(scanner.nextLine());
                    break;
                case 15:
                    System.out.print("Novo esteticista: ");
                    dog.setEsteticista(scanner.nextLine());
                    break;
                case 16:
                    System.out.print("Novos pertences: ");
                    dog.setPertences(scanner.nextLine());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

            petRepository.update(dog);
            System.out.println("Pet atualizado com sucesso!");
        } catch (PetException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro ao atualizar pet: " + e.getMessage());
        }
    }

    @Override
    public void deletarPet(Scanner scanner) {
        try {
            System.out.print("Nome do pet a ser deletado: ");
            String nome = scanner.nextLine();
            Dog dog = petRepository.findByName(nome);
            if (dog == null) {
                throw new PetException("Pet não encontrado!");
            }
            petRepository.delete(dog);
            System.out.println("Pet deletado com sucesso!");
        } catch (PetException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro ao deletar pet: " + e.getMessage());
        }
    }
}
