package br.com.bytebank.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor);
		System.out.println("Sacou R$" + valor + " Saldo R$" +  getSaldo());
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			double valorComTaxa = valor - 0.2;
			super.saldo += valorComTaxa;
			System.out.println("Depositou R$" + valor);
		}	
	}
	
	@Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
	
	@Override
	public String toString() {
		return "Conta Corrente " + super.toString();
	}
}
