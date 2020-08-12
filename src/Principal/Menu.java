package Principal;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import ContasBancarias.Conta;
import Pessoal.Pessoa;

public class Menu {
	
	public void displayMain(List<Pessoa> listaP, List<Conta> listaC) throws IOException {
		@SuppressWarnings("resource")
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
		
		String tipo = "";
		boolean cpfCadastrado = false; //faz verificação do cpf para testar no final do "for"
		
		for(int i = 0; i<listaP.size(); i++) {
			if(listaP.get(i).getCpf().equals(cpf)) { //Testa o cpf
				cpfCadastrado = true;
				System.out.print("                                PASSWORD:    ");
				int password = input.nextInt();
 				if(listaP.get(i).getSenha() == password) { //Testa a senha
					tipo = listaP.get(i).getTipo();

					switch(tipo) {
					case("CLIENTE"):
						displayCliente(listaC.get(i), listaC);
					break;
					case("GERENTE"):
						displayGerente(listaC.get(i), listaC);
					break;
					case("DIRETOR"):
						displayDiretor();
					break;
					case("PRESIDENTE"):
						displayPresidente();
					}
				} 
				else
					System.out.println("\n                                  Senha Inválida!");
			}
		}
		
		if(!cpfCadastrado) // Caso cpf não esteja cadastrado
			System.out.println("                                CPF NÃO CADASTRADO!");
	}
	
	public void displayCliente(Conta conta, List<Conta> listaConta) {
		System.out.println("MENU CLIENTE!");
		Scanner input = new Scanner(System.in);

		int opcao;
		int opcao1;
		int opcao2;
		String resp;

		resp = "S";


		while(resp.equalsIgnoreCase("S")){
			do{
				System.out.println("*****************************************");
				System.out.println("1 - Movimentações da Conta");
				System.out.println("2 - Relatórios");
				System.out.println("*****************************************");
				System.out.println("Escolha uma opção: ");
				opcao = input.nextInt();
		
				switch(opcao) {
					case(1):
						do{
							System.out.println("*****************************************");
							System.out.println("1 - Saque");
							System.out.println("2 - Depósito");
							System.out.println("3 - Transferência");
							System.out.println("*****************************************");
							System.out.println("Escolha uma opção: ");
							opcao1 = input.nextInt();
							if(opcao1 == 1){
								System.out.println("Digite o valor desejado para saque: ");
								conta.Sacar(input.nextDouble());
							} else if(opcao1 == 2){
								System.out.println("Digite o valor para depósito: ");
								conta.Depositar(input.nextDouble());
							} else if(opcao1 == 3){
								System.out.println("Digite o valor para depósito: ");
								double valor = input.nextDouble();
								System.out.println("Digite o CPF da conta destino: ");
								String cpf = input.next();
								for(int i = 0; i<listaConta.size(); i++) {
									if(listaConta.get(i).getCpf().equals(cpf))
										conta.Transferir(listaConta.get(i), valor);									
								}
							} else {
								System.out.println("Opção Inválida!");
								System.out.println("Escolha uma opção Válida: ");
							}
						  } while(opcao1 > 3 || opcao1 < 1);
					break;
		
				case(2):
					do{
						System.out.println("*****************************************");
						System.out.println("1 - Saldo");
						System.out.println("2 - Tributação da Conta corrente");
						System.out.println("3 - Rendimento da Conta Poupança");
						System.out.println("4 - Seguro de Vida");
						System.out.println("*****************************************");
						System.out.println("Escolha uma opção: ");
						opcao2 = input.nextInt();
				
						if(opcao2 == 1){
							System.out.println("Seu saldo atualizado é de R$ "+conta.getSaldo());
						} //else if(opcao2 == 2){
//							tributacao();
//						} else if(opcao2 == 3){
//							Rendimento();
//						}else if(opcao2 == 4){
//							Seguro();
//						}
//						else{
//						System.out.println("Opção Inválida!");
//						System.out.println("Escolha uma opção Válida: ");
//						}
					}while(opcao2 > 4 || opcao2 < 1);
				break;
				
				default:
				System.out.println("Opção Inválida!");
				System.out.println("Escolha uma opção Válida: ");
				}
			}while(opcao != 1 && opcao != 2);
			System.out.println("Deseja fazer outra operação? (S/N) ");
			resp = input.next();
		}
	}
	public void displayGerente(Conta conta, List<Conta> listaConta) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("*****************************************");
		System.out.println("Como deseja acessar o sistema?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Gerente");
		System.out.println("*****************************************");
		System.out.println("Escolha uma opção: ");
		int opcao = input.nextInt();
		
		if(opcao == 1)
			displayCliente(conta, listaConta);
		else {
			System.out.println("Menu boladão do gerente");
		}
		
	}
	public void displayDiretor() {
		System.out.println("MENU DIRETOR!");
	}
	public void displayPresidente() {
		System.out.println("MENU PRESIDENTE!");
	}
	


}

