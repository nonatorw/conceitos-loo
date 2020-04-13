package br.com.nonatorw.estudos.zoologico;

public class Animal {
    /*
     * === Atributos da Classe ===
     * Aplicando conceitos de encapsulamento: escopo privado
     */
    private String nome;
    private String especie;
    private int idade;

    /*
     * === Métodos acessores ===
     * Aplicando conceitos de encapsulamento
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*
     * Métodos: Comportamentos do objeto
     */
    public void emitirBarulho() {
        System.out.println("Barulho do animal");
    }

    public Boolean ehAdulto() {
        return idade >= 1;
    }
}
