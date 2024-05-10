package controller;

public class ExemploBreakContinue {

    public static void main(String[] args) {
        
        for (int cont = 1 ; cont <= 10 ; cont ++) {
            if (cont == 3) {
                continue; // Interrompe somente a volta atual do laço
            }

            if (cont == 8) {
                break;  // Interrompe todo o laço
            }

            System.out.printf("contador: %d \n", cont);
        }
    }
}
