package Principal;

import java.util.List;

import ContasBancarias.Conta;
import Pessoal.Pessoa;

public class VerificaListas {

	public Conta econtraConta(String cpf, List<Conta> listaC) {
		for(int i = 0; i<listaC.size(); i++) {
			if(listaC.get(i).getCpf().equals(cpf)) { 
				return listaC.get(i);
			}
		}
		return null;
	}
	
	public String encontraPessoa(String cpf, List<Pessoa> listaP) {
		for(int i = 0; i<listaP.size(); i++) {
			if(listaP.get(i).getCpf().equals(cpf)) { 
				return listaP.get(i).getNome();
			}
		}
		return null;
	}
}
