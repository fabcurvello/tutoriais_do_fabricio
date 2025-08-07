package controller;

import java.util.Scanner;

public class ExemploScannerArquivo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(ExemploScannerArquivo1.class.getResourceAsStream("/arquivos/dados.txt"));
		
		String logradouro;
		String numero;
		
		String find = null;
		while (sc.hasNext()) {
			find = sc.findInLine("logradouro");
			if(find != null) {
				System.out.println(find);
				logradouro = sc.nextLine();
				System.out.println(logradouro);
			} else {
				System.out.println(" - " + sc.nextLine());
			}
		}
		
		sc.close();

	}

}
