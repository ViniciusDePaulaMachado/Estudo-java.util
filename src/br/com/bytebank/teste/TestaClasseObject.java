package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

public class TestaClasseObject {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(333,333);
		ContaPoupança cp = new ContaPoupança(222, 222);
		
		cc.deposita(200.5);
		cp.deposita(250.2);
		
		System.out.println(cc);
		System.out.println(cp);
	}

}
