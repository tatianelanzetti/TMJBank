package Principal;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	public void displayMain() throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n******************************************************************************************");

		System.out.println("    /$$$$$$$$ /$$      /$$    /$$$$$        /$$$$$$$   /$$$$$$  /$$   /$$ /$$   /$$");       
		System.out.println("   |__  $$__/| $$$    /$$$   |__  $$       | $$__  $$ /$$__  $$| $$$ | $$| $$  /$$/");       
		System.out.println("      | $$   | $$$$  /$$$$      | $$       | $$  \\ $$| $$  \\ $$| $$$$| $$| $$ /$$/ ");     
		System.out.println("      | $$   | $$ $$/$$ $$      | $$       | $$$$$$$ | $$$$$$$$| $$ $$ $$| $$$$$/  ");       
		System.out.println("      | $$   | $$  $$$| $$ /$$  | $$       | $$__  $$| $$__  $$| $$  $$$$| $$  $$  ");       
		System.out.println("      | $$   | $$\\  $ | $$| $$  | $$       | $$  \\ $$| $$  | $$| $$\\  $$$| $$\\  $$ ");     
		System.out.println("      | $$   | $$ \\/  | $$|  $$$$$$/       | $$$$$$$/| $$  | $$| $$ \\  $$| $$ \\  $$");      
		System.out.println("      |__/   |__/     |__/ \\______/        |_______/ |__/  |__/|__/  \\__/|__/  \\__/");      
		System.out.println("\n******************************************************************************************");
		System.out.print("                                CPF: ");
		String cpf = input.next();
		Runtime.getRuntime().exec("cls");
		System.out.print("                                PASSWORD: ");
		String password = input.next();
		
		switch(cpf) {
			case("cliente"):
				displayCliente();
				break;
			case("Gerente"):
				displayGerente();
				break;
			case("Diretor"):
				displayPresidente();
				break;
			case("Presidente"):
				displayPresidente();
				break;
			default:
				System.out.println("\n                               CPF não cadastrado!");		
		}
	}
	
	public void displayCliente() {}
	public void displayGerente() {}
	public void displayDiretor() {}
	public void displayPresidente() {}
	


}

