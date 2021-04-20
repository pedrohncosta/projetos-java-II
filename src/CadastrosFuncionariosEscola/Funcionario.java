package CadastrosFuncionariosEscola;

public final class Funcionario extends Empregado{
	private double salario;
	
	public double salarioLiquido() {
		return (salario-getEncargos());
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
}
