package br.com.bongi.model;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ficha;
    private String marcado;
    private String ouvidos;
    private String pele;
    private String ectoparasitas;
    private String no;
    private String servicos;
    private String recomendacoes;
    private String recepcionista;
    private String esteticista;
    private String pertences;

    public Dog(String nome, String raca, String tutor, String telefone, String sexo, String tamanho, String pelo, String ficha, String marcado, String ouvidos, String pele, String ectoparasitas, String no, String servicos, String recomendacoes, String recepcionista, String esteticista, String pertences) {
        super(nome, raca, tutor, telefone, sexo, tamanho, pelo);
        this.ficha = ficha;
        this.marcado = marcado;
        this.ouvidos = ouvidos;
        this.pele = pele;
        this.ectoparasitas = ectoparasitas;
        this.no = no;
        this.servicos = servicos;
        this.recomendacoes = recomendacoes;
        this.recepcionista = recepcionista;
        this.esteticista = esteticista;
        this.pertences = pertences;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Ficha do Dog:");
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("Tutor: " + getTutor());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Pelo: " + getPelo());
        System.out.println("Ficha: " + ficha);
        System.out.println("Marcado: " + marcado);
        System.out.println("Ouvidos: " + ouvidos);
        System.out.println("Pele: " + pele);
        System.out.println("Ectoparasitas: " + ectoparasitas);
        System.out.println("Nó: " + no);
        System.out.println("Serviços: " + servicos);
        System.out.println("Recomendações: " + recomendacoes);
        System.out.println("Recepcionista: " + recepcionista);
        System.out.println("Esteticista: " + esteticista);
        System.out.println("Pertences: " + pertences);
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getMarcado() {
        return marcado;
    }

    public void setMarcado(String marcado) {
        this.marcado = marcado;
    }

    public String getOuvidos() {
        return ouvidos;
    }

    public void setOuvidos(String ouvidos) {
        this.ouvidos = ouvidos;
    }

    public String getPele() {
        return pele;
    }

    public void setPele(String pele) {
        this.pele = pele;
    }

    public String getEctoparasitas() {
        return ectoparasitas;
    }

    public void setEctoparasitas(String ectoparasitas) {
        this.ectoparasitas = ectoparasitas;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public String getRecomendacoes() {
        return recomendacoes;
    }

    public void setRecomendacoes(String recomendacoes) {
        this.recomendacoes = recomendacoes;
    }

    public String getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(String recepcionista) {
        this.recepcionista = recepcionista;
    }

    public String getEsteticista() {
        return esteticista;
    }

    public void setEsteticista(String esteticista) {
        this.esteticista = esteticista;
    }

    public String getPertences() {
        return pertences;
    }

    public void setPertences(String pertences) {
        this.pertences = pertences;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nome='" + getNome() + '\'' +
                ", raca='" + getRaca() + '\'' +
                ", tutor='" + getTutor() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", sexo='" + getSexo() + '\'' +
                ", tamanho='" + getTamanho() + '\'' +
                ", pelo='" + getPelo() + '\'' +
                ", ficha='" + ficha + '\'' +
                ", marcado='" + marcado + '\'' +
                ", ouvidos='" + ouvidos + '\'' +
                ", pele='" + pele + '\'' +
                ", ectoparasitas='" + ectoparasitas + '\'' +
                ", no='" + no + '\'' +
                ", servicos='" + servicos + '\'' +
                ", recomendacoes='" + recomendacoes + '\'' +
                ", recepcionista='" + recepcionista + '\'' +
                ", esteticista='" + esteticista + '\'' +
                ", pertences='" + pertences + '\'' +
                '}';
    }
}
