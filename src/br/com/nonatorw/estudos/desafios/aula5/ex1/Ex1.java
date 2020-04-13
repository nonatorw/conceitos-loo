package br.com.nonatorw.estudos.desafios.aula5.ex1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class Pessoa {
    public String nome;
    public Integer idade;
}

public class Ex1 {
    public static void main(String args[]) {
        Pessoa p = new Pessoa();

        Field[] allFields = p.getClass().getDeclaredFields();

        for (Field field : allFields) {
            if (Modifier.isPublic(field.getModifiers())) {
                System.out.println(field.getName());
            }
        }

        Scanner scann = new Scanner(System.in);
        p.nome = scann.nextLine();
        p.idade = scann.nextInt();

        System.out.println(p.nome);
        System.out.println(p.idade);
    }
}