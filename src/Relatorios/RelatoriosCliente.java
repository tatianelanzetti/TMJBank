package Relatorios;

import java.util.Scanner;

public class RelatoriosCliente {
	
	Scanner input = new Scanner(System.in);
	int opcao;
	
	public void Menu() {
		
	System.out.println("Saldo");
	System.out.println("Tributação da Conta Corrente");
	System.out.println("Rendimento da Poupança");
	System.out.println("Seguro de Vida");
	opcao = input.nextInt();
	
	}
}
