package exercicios.OrientacaoObjetos.Ex4;

public class Funcionario {

	public String nome;
	public String funcao;
	private double salario;
	public double impostos;
	
	
		public void setsalario(double salario) {
			this.salario=salario;
			
		}
		
		public double getsalario() {
			return salario;
		}
	public double salario(double salario,double impostos) {
		this.salario=salario;
		this.impostos=impostos;
		salario-=impostos;
		return salario;
	}
	
}
