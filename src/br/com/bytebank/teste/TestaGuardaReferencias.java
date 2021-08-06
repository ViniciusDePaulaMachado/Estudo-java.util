package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupan�a;
import br.com.bytebank.modelo.GuardaReferencias;

public class TestaGuardaReferencias {

	public static void main(String[] args) {
		
		GuardaReferencias guardaReferencias = new GuardaReferencias();
		Conta cp = new ContaPoupan�a(10, 1);
		Conta cc = new ContaCorrente(10,2);
		
		guardaReferencias.guardarReferencia(cp);
		guardaReferencias.guardarReferencia(cc);
		
	

	}

}
