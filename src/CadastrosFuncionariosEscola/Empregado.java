package CadastrosFuncionariosEscola;

public abstract class Empregado {
	private String nome;
	private double encargos;
	
	public abstract double salarioLiquido();

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getEncargos() {
		return encargos;
	}
	public void setEncargos(double encargos) {
		this.encargos = encargos;
	}
	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
