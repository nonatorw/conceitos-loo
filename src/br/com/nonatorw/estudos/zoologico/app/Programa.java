package br.com.nonatorw.estudos.zoologico.app;

import br.com.nonatorw.estudos.zoologico.classes.Animal;

public class Programa {
    public static void main(String[] args) {
        // Cachorro é uma Instância da classe "Animal".
        Animal cachorro = new Animal();
        cachorro.setNome("Totó");
        cachorro.setIdade(2);
        cachorro.setEspecie("cachorro");

        System.out.println("Olá, seu animal é um " + cachorro.getEspecie() +
                           ", e seu nome é " + cachorro.getNome() +
                           ". Ele tem " + cachorro.getIdade());
        if (cachorro.ehAdulto()) {
            System.out.println("Animal adulto");
        } else {
            System.out.println("Animal filhote");
        }
    }
}
