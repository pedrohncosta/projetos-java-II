package ControleEstoqueTecnologicos;

public final class Desktop extends Aparelho{
	private int hd;

	
	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	public Desktop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String especificacao() {
		String aux = "";
		aux = "hd: "+ this.hd+"\tnucleo: "+this.getNucleo()+"\tmemoria: "+this.getMemoria();
		return aux;
	}
}
