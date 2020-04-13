package br.com.nonatorw.estudos.desafios.aula5.ex2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Pessoa {
    private String nome;
    private Integer idade;
}

public class Ex2 {
    public static void main(String args[]) {
        Pessoa p = new Pessoa();

        Field[] allFields = p.getClass().getDeclaredFields();

        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println(field.getName());
            }
        }
    }
}
