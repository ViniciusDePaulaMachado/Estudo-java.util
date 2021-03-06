package br.com.bytebank.modelo;

public class ContaPoupanša extends Conta {
	
	public ContaPoupanša(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void deposita(double valor) {
		if(valor > 0) {
			super.saldo += valor;
			System.out.println("Depositou R$" + valor);
		}
	}
	
	@Override
	public String toString() {
		
		return "Conta Poupanša" + super.toString();
	}
}
