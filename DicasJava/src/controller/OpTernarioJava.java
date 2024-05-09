package controller;

public class OpTernarioJava {
    public static void main(String[] args) {
        //Operador ternário em Java:
        //<Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

        int a = 1, b = 2;
        String resultado = a > b ? "Verdadeiro" : "Falso" ; // Operador ternário

        System.out.println(resultado);

        //Outro exemplo:
        double nota = 5.6;
        String situacao = nota >= 7 ? "Aprovado" : nota >=5 ? "Recuperação" : "Reprovado" ;
        System.out.println(situacao);
    }
}