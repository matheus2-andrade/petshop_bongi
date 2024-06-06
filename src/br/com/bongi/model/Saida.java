package br.com.bongi.model;

import java.io.Serializable;

public class Saida implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String raca;
    private String assinatura;
    private String data;

    public Saida(String nome, String raca, String assinatura, String data) {
        this.nome = nome;
        this.raca = raca;
        this.assinatura = assinatura;
        this.data = data;
    }

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

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Saida{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", assinatura='" + assinatura + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
