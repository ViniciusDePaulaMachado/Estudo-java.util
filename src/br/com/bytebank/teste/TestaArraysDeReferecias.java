package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;

public class TestaArraysDeReferecias {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[3];
		
		ContaCorrente cc1 = new ContaCorrente(12, 15);
		ContaCorrente cc2 = new ContaCorrente(12, 13);
		ContaCorrente cc3 = new ContaCorrente(12, 11);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
				
		ContaCorrente ref = contas[0];
		
		System.out.println(contas[0].getNumero() + " " + contas[0].getAgencia());
		
		System.out.println(ref.getNumero() + " " + ref.getAgencia());
		
		
	} 
}
