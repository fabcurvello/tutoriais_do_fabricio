package controller;

/**
 * <h1> Sobre JavaDOCs</h1>
 * <p>Ao criar um comentário de bloco iniciando por /**
 * inicia-se um JAVA DOC.</p>
 * 
 * <p>POSICIONE o mouse sobre o nome da classe ou do método que contém JAVA DOC 
 * para ver o resultado.</p>
 * 
 * <p>Pode-se utilizar diversas <b>flags</b>. Eis algumas abaixo:</p>
 * @author Fabricio Curvello
 * @version 1.0
 * @since 05/05/2024
 */
public class JavaDocs {

    public static void main(String[] args) {
        System.out.println(realizarSoma(3,4));
    }

    /**
     * <h2>Método realizarSoma()</h2>
     * <p>Método que realiza a soma de dois números inteiros.</p>
     * @param num1 é o primeiro parâmetro, correspondente ao primeiro número a ser somado
     * @param num2 é o segundo parâmetro, correspondente ao segundo número a ser somado
     * @return retorna um int correspondente à soma dos parâmetros recebidos
     */
    public static int realizarSoma(int num1, int num2) {
        return num1 + num2;
    }

/*
 * CRIANDO DOCUMENTAÇÃO HTML A PARTIR DOS COMENTÁRIOS JAVADOC:
 * 
 * NO TERMINAL, DENTRO DA PASTA DO PROJETO JAVA:
 * 
 * Exemplo1:
 * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
 * 
 * Cria uma pasta chamada docs, contendo um site html (iniciar no index.html),
 * do conteúdo java da pasta src do projeto. 
 * ---
 * 
 * Exemplo2:
 * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/controller/*.java
 * 
 * Cria uma pasta chamada docs, contendo um site html (iniciar no index.html),
 * do conteúdo java da pasta src/controller do projeto.
 */

}
