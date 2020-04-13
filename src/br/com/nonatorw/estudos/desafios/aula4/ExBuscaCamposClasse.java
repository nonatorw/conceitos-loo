package br.com.nonatorw.estudos.desafios.aula4;

import java.lang.reflect.Field;

class Pessoa {
    private String nome;
    private int idade;
}

public class ExBuscaCamposClasse {

    public static void main(String args[]) {
        Field[] allFields = Pessoa.class.getDeclaredFields();

        for (Field field : allFields) {
            System.out.println(field.getName());
        }
    }
}