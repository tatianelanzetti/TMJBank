package Principal;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import ContasBancarias.Conta;
import ContasBancarias.SeguroDeVida;
import Pessoal.Pessoa;
import relatorios.Relatorios;

public class Menu {

		Scanner input = new Scanner(System.in);
		VerificaListas verifica = new VerificaListas();
		Relatorios relatorio = new Relatorios();
		SeguroDeVida seguroVida = new SeguroDeVida();
	
	public void displayMain(List<Pessoa> listaP, List<Conta> listaC) throws IOException {
		
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
					Conta conta = verifica.econtraConta(listaP.get(i).getCpf(), listaC);

					switch(tipo) {
					case("CLIENTE"):
						displayCliente(conta, listaC, listaP.get(i));
					break;
					case("GERENTE"):
						displayGerente(conta, listaC, listaP.get(i));
					break;
					case("DIRETOR"):
						displayDiretor(conta, listaP.get(i), listaC, listaP);
					break;
					case("PRESIDENTE"):
						displayPresidente(listaC);
					}
				} 
				else
					System.out.println("\n                                  Senha Inválida!");
			}
		}
		
		if(!cpfCadastrado) // Caso cpf não esteja cadastrado
			System.out.println("                                CPF NÃO CADASTRADO!");
	}
	
	public boolean displayCliente(Conta conta, List<Conta> listaConta, Pessoa pessoa) throws IOException {
		if(conta == null) return false;
		
		System.out.println("MENU CLIENTE!");

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
							System.out.println("4 - Seguro de Vida");
							System.out.println("*****************************************");
							System.out.println("Escolha uma opção: ");
							opcao1 = input.nextInt();
							if(opcao1 == 1){
								System.out.println("Digite o valor desejado para saque: ");
								double valor = input.nextDouble(); 
								boolean sacou = conta.Sacar(valor);
								if(sacou)
									EscritorDeTransacoes.escritorSaque(pessoa, conta, valor);
							} else if(opcao1 == 2){
								System.out.println("Digite o valor para depósito: ");
								conta.Depositar(input.nextDouble());
							} else if(opcao1 == 3){
								System.out.println("Digite o valor para depósito: ");
								double valor = input.nextDouble();
								System.out.println("Digite o CPF da conta destino: ");
								String cpf = input.next();
								conta.Transferir(verifica.econtraConta(cpf, listaConta), valor);
							} else if(opcao1 == 4){
								seguroVida.contrata(conta);
							} 
							else {
								System.out.println("Opção Inválida!");
								System.out.println("Escolha uma opção Válida: ");
							}
						  } while(opcao1 > 4 || opcao1 < 1);
					break;
		
				case(2):
					do{
						System.out.println("*****************************************");
						System.out.println("1 - Saldo");
						System.out.println("2 - Tributação da Conta corrente");
						System.out.println("3 - Rendimento da Conta Poupança");
						System.out.println("*****************************************");
						System.out.println("Escolha uma opção: ");
						opcao2 = input.nextInt();
				
						if(opcao2 == 1){
							System.out.println("Seu saldo atualizado é de R$ "+conta.getSaldo());
						} else if(opcao2 == 2){
							relatorio.tributacao(conta);
						} else if(opcao2 == 3){
							relatorio.rendimento();
						}
						else{
						System.out.println("Opção Inválida!");
						System.out.println("Escolha uma opção Válida: ");
						}
					}while(opcao2 > 3 || opcao2 < 1);
				break;
				
				default:
				System.out.println("Opção Inválida!");
				System.out.println("Escolha uma opção Válida: ");
				}
			}while(opcao != 1 && opcao != 2);
			System.out.println("Deseja fazer outra operação? (S/N) ");
			resp = input.next();
		}
		return true;
	}
	public void displayGerente(Conta conta, List<Conta> listaConta, Pessoa pessoa) throws IOException {
		
		System.out.println("*****************************************");
		System.out.println("Como deseja acessar o sistema?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Gerente");
		System.out.println("*****************************************");
		System.out.println("Escolha uma opção: ");
		int opcao = input.nextInt();
		
		if(opcao == 1)
			displayCliente(conta, listaConta, pessoa);
		else if(opcao == 2) {
			relatorio.gerente(listaConta, conta );
		} else
			System.out.println("Opção Inválida");
		
	}
	public void displayDiretor(Conta conta, Pessoa pessoa, List<Conta> listaConta, List<Pessoa> listaPessoa) throws IOException {
		System.out.println("*****************************************");
		System.out.println("Como deseja acessar o sistema?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Diretor");
		System.out.println("*****************************************");
		System.out.println("Escolha uma opção: ");
		int opcao = input.nextInt();
		
		if(opcao == 1)
			displayCliente(conta, listaConta, pessoa);
		else if(opcao == 2) {
			relatorio.diretor(listaConta, listaPessoa);
		} else
			System.out.println("Opção Inválida");
	}
	public void displayPresidente(List<Conta> listaConta) {
		relatorio.presidente(listaConta);
	}
	
	

}

