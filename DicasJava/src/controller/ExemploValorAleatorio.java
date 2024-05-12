package controller;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class ExemploValorAleatorio {

    public static void main(String[] args) {

        //PARA AMBIENTES SINGLE-THREADS (básicos)
        Random random = new Random();
        int sorteio1 = random.nextInt(10, 21); // entre 10 e 20
        // existe .nextInt(), .nextDouble(), dentre diversos outros.
        System.out.println("Sorteio1: " + sorteio1);
        
        //ADEQUADO PARA AMBIENTES MULTITHREADS
        // dois números: origem e fim; um número: fim. Considerar até o anterior ao último
        int sorteio2 = ThreadLocalRandom.current().nextInt(10, 21);
        // existe .nextInt(), .nextDouble(), dentre diversos outros.
        System.out.println("Sorteio2: " + sorteio2);

    }

}
