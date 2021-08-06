package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

public class TestaConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 123);
		cc.deposita(100);

		ContaPoupança cp = new ContaPoupança(1234, 1234);
		cp.deposita(150);

		cc.transfere(50, cp);

		System.out.println("Cc " + cc.getSaldo());
		System.out.println("Cp " + cp.getSaldo());
		
		

	}
}
