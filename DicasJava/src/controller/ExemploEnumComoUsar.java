package controller;

/**
 * <h1> Atrelado à enum ExemploEnumEstado </h1>
 */

public class ExemploEnumComoUsar {

    public static void main(String[] args) {
        for (ExemploEnumEstado est: ExemploEnumEstado.values()) {
            System.out.println(est.getSigla() + " - " + est.getNome() + " - " + est.getRegiao());
        }

        System.out.println("\n--- Outra usabilidade ---");
        ExemploEnumEstado estado = ExemploEnumEstado.AMAZONAS;
        System.out.println("Estado : " + estado.getNome());
    }

}
