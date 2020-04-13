package br.com.nonatorw.estudos.desafios.aula5.ex3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

public class Ex3 {
    public static void main(String args[]) {
        Pessoa p = new Pessoa();

        Field[] allFields = p.getClass().getDeclaredFields();

        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println(field.getName());
            }
        }

        Scanner scann = new Scanner(System.in);
        p.setNome(scann.nextLine());
        p.setIdade(scann.nextInt());

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}