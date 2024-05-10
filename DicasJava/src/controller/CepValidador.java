package controller;

public class CepValidador {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //e.printStackTrace();
            System.err.println("--- O CEP inserido não possui 8 dígitos ---");
        }
    }

    /*
     * Este método lança uma CepInvalidoException caso o cep não possua 8 dígitos.
     * Faz-se isso no if, acionando a exception pelo comando throw.
     * 
     * Isso OBRIGA a quem chamar este método (como exemplo acima no main), a tratar essa
     * exceção com try catch.
     * 
     * OBS: Neste mesmo projeto temos a Classe CepInvalidoException, que estende de Exception.
     */
    public static String formatarCep(String cep) throws CepInvalidoException {
        if ( cep.length() != 8 ){
            throw new CepInvalidoException();  
        }

        String cepResultado = cep.substring(0,2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
        return cepResultado;
    }

}
