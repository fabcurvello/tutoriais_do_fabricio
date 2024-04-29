package controller;

public class TipoVarJava {

	public static void main(String[] args) {
		
		// Verificando o tipo de uma var Java
		var a = true;  // Mudar para 3, depois "casa", depois 7.5
		System.out.println(((Object) a).getClass().getSimpleName());
	}
}
