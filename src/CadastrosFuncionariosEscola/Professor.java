package CadastrosFuncionariosEscola;

public final class Professor extends Empregado{
	private double valorHora;
	private int numHoras;
	
	public double salarioLiquido()
	{
		return (valorHora*numHoras)-getEncargos();
	}
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
}
