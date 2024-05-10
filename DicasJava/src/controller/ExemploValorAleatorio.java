package controller;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploValorAleatorio {

    public static void main(String[] args) {
        

        // dois números: origem e fim; um número: fim. Considerar até o anterior ao último
        System.out.println(ThreadLocalRandom.current().nextInt(10, 21));

        // existe .nextInt(), .nextDouble(), dentre diversos outros.
    }

}
