package br.com.bytebank.teste.javaUtil;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(12,1);
		Conta cp = new ContaPoupança(12,2);
		
		lista.add(cc);
		lista.add(cp);
		
		System.out.println("tamanho: " + lista.size());
		
		Conta ref = (Conta)lista.get(0);
		
		System.out.println("Numero: " + ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("tamanho: " + lista.size());
		
		Conta cc2 = new ContaCorrente(13,3);
		Conta cp2 = new ContaPoupança(13,4);
		
		lista.add(cc2);
		lista.add(cp2);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("----------Testando laço mais simples-----------");
		
		for(Object o : lista) {
			System.out.println(o);
		}

	}
}
