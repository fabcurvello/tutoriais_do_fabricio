package controller;

/**
 * <h1> Método main com argumentos (passagem de parâmetros no args) <h1>
 */

public class SobreMim {

    /**
     * <h2>Argumentos do método main()</h2>
     * <p>Este é um exemplo básico de uma classe que 
     * possui método main e o conteúdo deste método
     * se utiliza de valores recebidos pelo vetor args
     * na área de argumentos do método.</p>
     * 
     * <p>Acesse esta classe via terminal (ou cmd).
     * Estando no terminal, na pasta deste arquivo java, digite:<br>
     * java SobreMim seunome seusobrenome suaidade
     * 
     * @param args Recebe 3 valores Strings, nesta ordem: nome, sobrenome e idade
     */

    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
    }

    /*
     * No VisualStudioCode é possível autiomatizar esse acesso
     * à esta classe, clicando em Executar / Abrir as Configurações 
     * ou ainda, Executar / Adicionar Configurações.
     * 
     * Será aberto o arquivo .vscode/launch.json.
     * Nele, procurando pela parte que fala da classe 
     * SobreMim, adaptar incluindo os respectivos args.
     * Eis um exemplo :
     * 
     * {
            "type": "java",
            "name": "SobreMim",
            "request": "launch",
            "mainClass": "controller.SobreMim",
            "args": [
                "Fabricio",
                "Curvello",
                "49",
            ],
            "projectName": "CloneTutoriaisDoFabricio_5470b5e7"
        }
     */

}
