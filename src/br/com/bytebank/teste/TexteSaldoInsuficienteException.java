package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TexteSaldoInsuficienteException {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(222, 223);
		
		c.deposita(200);
		
		try {
			c.saca(100);
		} catch (SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
		}
		
		
		
	}	
}
