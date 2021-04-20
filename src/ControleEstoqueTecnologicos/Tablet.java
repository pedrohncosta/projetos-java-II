package ControleEstoqueTecnologicos;

public final class Tablet extends Aparelho{
	private int tela;

	public int getTela() {
		return tela;
	}

	public void setTela(int tela) {
		this.tela = tela;
	}

	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String especificacao() {
		// TODO Auto-generated method stub
		String aux = "";
		aux = "hd: "+ this.tela+"\tnucleo: "+this.getNucleo()+"\tmemoria: "+this.getMemoria();
		return aux;
	}
}
