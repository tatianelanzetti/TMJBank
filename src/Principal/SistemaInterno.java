package Principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ContasBancarias.Conta;
import Pessoal.Pessoa;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		cargaDeDados carga = new cargaDeDados();
		List<Pessoa> listaP = new ArrayList<>();
		List<Conta> listaC = new ArrayList<>();
		carga.leitor("./BD_TMJ_BANK.txt", listaP, listaC);
		
		Menu display = new Menu();
		
		display.displayMain(listaP, listaC);
		
//		teste
//		ContaCorrente cc = new ContaCorrente("123.456.789-00", 3000.0, 0001, "Conta Corrente");
//		cc.Sacar(200);
//		System.out.println(cc.getSaldo());
//		cc.Depositar(300);
//		System.out.println(cc.getSaldo());
//		cc.Transferir(400, cc);
//		System.out.println(cc.getSaldo());
	}

}
