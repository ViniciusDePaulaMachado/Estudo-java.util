package br.com.bytebank.modelo;

public class GuardaReferencias {

	private Object[] referencia;
	private int posicaoDaReferencia;

	public GuardaReferencias() {
		this.referencia = new Object[10];
		this.posicaoDaReferencia = 0;
	}

	public void guardarReferencia(Object ref) {

		this.referencia[this.posicaoDaReferencia] = ref;
		this.posicaoDaReferencia++;
	}

	public Object getElementosDaReferencia(int pos) {
		return this.referencia[pos];
	}
}
