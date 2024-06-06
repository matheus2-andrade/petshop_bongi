package br.com.bongi.model;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String raca;
    private String tutor;
    private String telefone;
    private String sexo;
    private String tamanho;
    private String pelo;

    public Animal(String nome, String raca, String tutor, String telefone, String sexo, String tamanho, String pelo) {
        this.nome = nome;
        this.raca = raca;
        this.tutor = tutor;
        this.telefone = telefone;
        this.sexo = sexo;
        this.tamanho = tamanho;
        this.pelo = pelo;
    }

    public abstract void imprimirFicha();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", tutor='" + tutor + '\'' +
                ", telefone='" + telefone + '\'' +
                ", sexo='" + sexo + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", pelo='" + pelo + '\'' +
                '}';
    }
}
