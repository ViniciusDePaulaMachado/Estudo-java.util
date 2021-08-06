package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardaContas;

public class TesteAGuardaContas {

	public static void main(String[] args) {
		
		GuardaContas guardaContas = new GuardaContas();
		
		Conta cc = new ContaCorrente(12,1);
		
		guardaContas.adiciona(cc);
				
		int quantidadeDeContas = guardaContas.getQuantidadeDeContas();	
		
		System.out.println(quantidadeDeContas);
		
		System.out.println(guardaContas.getElemtosDaConta(0).getNumero());
		
	}

}
