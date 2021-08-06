package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

public class TestaArraysDeRefereciasCast {

	public static void main(String[] args) {
		
		//Conta[] Referencias = new Conta[3]; array generico que recebe referencias ContaPoupanca e ContaCorrente
		Object[] Referencias = new Object[3]; // array mais generico do tipo object que recebe qualquer referencia
		
		ContaCorrente cc1 = new ContaCorrente(12, 15);
		ContaCorrente cc2 = new ContaCorrente(12, 13);
		ContaPoupança cc3 = new ContaPoupança(12, 11);
				
		Referencias[0] = cc1;
		Referencias[1] = cc2;
		Referencias[2] = cc3;
						
		ContaCorrente ref = (ContaCorrente) Referencias[0]; // type cast
		ContaCorrente ref2 = (ContaCorrente) Referencias[1];// type cast
		ContaPoupança ref3 = (ContaPoupança) Referencias[2];// type cast
				
		System.out.println(ref.getNumero() + " " + ref.getAgencia());
		System.out.println(ref2.getNumero() + " " + ref2.getAgencia());
		System.out.println(ref3.getNumero() + " " + ref3.getAgencia());
			
	} 
}
