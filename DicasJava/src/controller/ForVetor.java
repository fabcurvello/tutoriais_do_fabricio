package controller;

public class ForVetor {

    public static void main(String[] args) {
        
        String pessoas[] = {"Ana", "Maria", "Carlos", "Rafaela", "Manuel"};

        for(String pessoa : pessoas){
            System.out.printf("Nome da pessoa: %s \n", pessoa);
        }
    }
}
