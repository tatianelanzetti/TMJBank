package Relatorios;

import java.util.Scanner;

public class MovimentacoesNaConta {

	Scanner input = new Scanner(System.in);
	int opcao;
	
	public void Menu() {
		
	System.out.println("Saque");
	System.out.println("Deposito");
	System.out.println("Transferencia");
	opcao = input.nextInt();
	
	}
	
}
