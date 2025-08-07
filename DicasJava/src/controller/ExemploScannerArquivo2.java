package controller;

import java.util.Scanner;

public class ExemploScannerArquivo2 {

	public static void main(String[] args) {
		
		String logradouro = "";
		String numero = "";
		String complemento = "";
		String bairro = "";
		String cidade = "";
		String estado = "";
		String cep = "";
		String outrosDados = "";
		
		try {
			Scanner sc = new Scanner(ExemploScannerArquivo2.class.getResourceAsStream("/arquivos/dados.txt"));
		
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.trim().isEmpty()) {
					String partes[] = linha.split(" ", 2); //Separa em [chave, valor]
					if (partes.length == 2) {
						String chave = partes[0].toLowerCase();
						String valor = partes[1].trim();
						
						switch (chave) {
						case "logradouro": logradouro = valor; break;
						case "numero": numero = valor; break;
						case "complemento": complemento = valor; break;
						case "bairro": bairro = valor; break;
						case "cidade": cidade = valor; break;
						case "estado": estado = valor; break;
						case "cep": cep = valor; break;
						default: outrosDados += valor; break;
						}
					}
				}
			}
			
			System.out.println("--- Dados Capturados do Arquivo ---");
			System.out.println("Logradouro: " + logradouro);
			System.out.println("Número: " + numero);
			System.out.println("Complemento: " + complemento);
			System.out.println("Bairro: " + bairro);
			System.out.println("Cidade: " + cidade);
			System.out.println("Estado: " + estado);
			System.out.println("CEP: " + cep);
			System.out.println("Outros dados: " + outrosDados);
			
			sc.close();
		
		} catch (NullPointerException e) {
			System.out.println("Arquivo de dados não encontrado");
		}

	}

}
