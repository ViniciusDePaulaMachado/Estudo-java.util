package br.com.bytebank.modelo;

public abstract class Conta extends Object {

	protected double saldo;
	private int agencia;
	private int numero;
	Cliente titular;

	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida");
		}

		if (numero < 1) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"Saldo Insuficiente. Saldo Atual: R$" + this.saldo + " Tentou sacar R$" + valor);
		}
		this.saldo = this.saldo - valor;
	}

	public void transfere(double valor, Conta destino) {

		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}
	
	@Override
	public String toString() {
		
		return " Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo:" + this.saldo;
	}
}
