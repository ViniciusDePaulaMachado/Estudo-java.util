package br.com.bytebank.modelo;

public class GuardaContas {
	
	private Conta[] referencias;
	private int posicaoArrey;
	
	public GuardaContas() {
		this.referencias = new Conta[10];
		this.posicaoArrey = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoArrey] = ref;
		this.posicaoArrey++;
		
	}
	
	public int getQuantidadeDeContas() {
		return this.posicaoArrey; 
	}
	
	public Conta getElemtosDaConta(int pos) {
		return this.referencias[pos];
	}
}
