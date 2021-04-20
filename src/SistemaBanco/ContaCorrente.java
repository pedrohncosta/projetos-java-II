package SistemaBanco;


public final class ContaCorrente extends ContaBancaria{
	private double limiteCheque;
	private int transacoes;
	
	public boolean sacar(double a) {
		
		if((super.getSaldo()+this.limiteCheque)>=a)
		{
			super.setSaldo(super.getSaldo()-a);
			this.transacoes++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getLimiteCheque() {
		return limiteCheque;
	}
	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}

	public ContaCorrente(int senha, int numero, double limiteCheque) {
		super(senha, numero);
		this.limiteCheque = limiteCheque;
		this.transacoes = 0;
	}




}
