package controller;

import java.util.Locale;
import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Informe a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua altura é " + altura);

        scanner.close();
    }

}
