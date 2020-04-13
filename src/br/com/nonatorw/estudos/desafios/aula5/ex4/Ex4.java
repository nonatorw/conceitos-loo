package br.com.nonatorw.estudos.desafios.aula5.ex4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Field[] allFields = Pessoa.class.getDeclaredFields();

        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println(field.getName());
            }
        }

        Scanner scann = new Scanner(System.in);
        Pessoa a = new Pessoa(scann.nextLine());

        a.setIdade(scann.nextInt());
        System.out.println(a.getNome());
        System.out.println(a.getIdade());
    }
}
