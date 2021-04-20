package SistemaBanco;

public abstract class ContaBancaria {
	private int senha;
	private int numero;
	private double saldo;
	
	public abstract boolean sacar(double a);
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContaBancaria(int senha, int numero) {
		super();
		this.senha = senha;
		this.numero = numero;
		this.saldo = 0;
	}
	
}
