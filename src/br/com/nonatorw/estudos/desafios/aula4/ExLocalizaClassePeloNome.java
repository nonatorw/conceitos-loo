package br.com.nonatorw.estudos.desafios.aula4;

class PrimeiraClasse {

}

public class ExLocalizaClassePeloNome {

    public static void main(String args[]) {
        String classe = "PrimeiraClasse";
        try {
            Class.forName(classe);
            System.out.println(classe);
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada!");
        }
    }
}