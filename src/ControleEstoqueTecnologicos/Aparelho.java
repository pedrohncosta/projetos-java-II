package ControleEstoqueTecnologicos;

public abstract class Aparelho {
	private int nucleo;
	private int memoria;
	
	public abstract String especificacao();
	
	public int getNucleo() {
		return nucleo;
	}
	public void setNucleo(int nucleo) {
		this.nucleo = nucleo;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public Aparelho() {
		super();
		// TODO Auto-generated constructor stub
	}
}
