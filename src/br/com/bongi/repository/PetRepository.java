package br.com.bongi.repository;

import br.com.bongi.model.Dog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PetRepository implements IRepository<Dog> {
    private List<Dog> pets = new ArrayList<>();
    private static final String FILE_PATH = "pets.dat";

    public PetRepository() {
        loadFromFile();
    }

    @Override
    public void add(Dog pet) {
        pets.add(pet);
        saveToFile();
    }

    @Override
    public List<Dog> list() {
        return pets;
    }

    @Override
    public void update(Dog pet) {
        saveToFile();
    }

    @Override
    public void delete(Dog pet) {
        pets.remove(pet);
        saveToFile();
    }

    public Dog findByName(String name) {
        for (Dog pet : pets) {
            if (pet.getNome().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(pets);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            saveToFile();
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
                pets = (List<Dog>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Erro ao carregar dados: " + e.getMessage());
            }
        }
    }
}
