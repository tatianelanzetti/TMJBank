package Relatorios;

import java.util.Scanner;

public class RelatoriosGerente {
	
	Scanner input = new Scanner(System.in);
	int opcao;
	
	public void Menu() {
		
	System.out.println("Saldo");
	System.out.println("Tributação da Conta Corrente");
	System.out.println("Rendimento da Poupança");
	System.out.println("Números de Conta - Gerente Responsável");
	opcao = input.nextInt();
	
	}

}
