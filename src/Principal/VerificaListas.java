package Principal;

import java.util.List;

import ContasBancarias.Conta;

public class VerificaListas {

	public Conta econtraConta(String cpf, List<Conta> listaC) {
		for(int i = 0; i<listaC.size(); i++) {
			if(listaC.get(i).getCpf().equals(cpf)) { 
				return listaC.get(i);
			}
		}
		return null;
	}
}
