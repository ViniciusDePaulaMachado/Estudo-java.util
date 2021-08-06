package br.com.bytebank.teste;

public class TestaArrays {

	public static void main(String[] args) {
		int[] idades = new int[5];
		
		idades[0] = 30;
		idades[1] = 20;
		
		for( int i = 0; i < idades.length; i++ ) {
			System.out.println("Idade " + i + ": " + idades[i]);
		}
		
		int[] numero = new int[5];
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = i;
			System.out.println(numero[i]);
		}
	}
}
