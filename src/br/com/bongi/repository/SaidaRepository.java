package br.com.bongi.repository;

import br.com.bongi.model.Saida;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaidaRepository implements IRepository<Saida> {
    private List<Saida> saidas = new ArrayList<>();
    private static final String FILE_PATH = "saidas.dat";

    public SaidaRepository() {
        loadFromFile();
    }

    @Override
    public void add(Saida saida) {
        saidas.add(saida);
        saveToFile();
    }

    @Override
    public List<Saida> list() {
        return saidas;
    }

    @Override
    public void update(Saida saida) {
        saveToFile();
    }

    @Override
    public void delete(Saida saida) {
        saidas.remove(saida);
        saveToFile();
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(saidas);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            saveToFile(); // Cria o arquivo vazio se ele não existir
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
                saidas = (List<Saida>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Erro ao carregar dados: " + e.getMessage());
            }
        }
    }
}
