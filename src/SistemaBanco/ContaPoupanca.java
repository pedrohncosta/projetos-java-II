package SistemaBanco;

public final class ContaPoupanca extends ContaBancaria{
	private double taxaRendi;

	public double getTaxaRendi() {
		return taxaRendi;
	}

	public void setTaxaRendi(double taxaRendi) {
		this.taxaRendi = taxaRendi;
	}

	@Override
	public boolean sacar(double a) {
		// TODO Auto-generated method stub
		if(super.getSaldo()-a<0)
		{
			return false;
		}
		else
		{
			super.setSaldo(super.getSaldo()-a);
			return true;
		}
	}

	public ContaPoupanca(int senha, int numero, double taxaRendi) {
		super(senha, numero);
		this.taxaRendi = taxaRendi;
	}
	
}
