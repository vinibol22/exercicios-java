package exercicios.OrientacaoObjetos.Ex6;

public class Conta {

	public String nome;
	private double saldo;
	private String numconta;
	private double divida;
	private double salario;
	
	
	
	public void setsaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getsaldo(){
	

		return saldo;
		}

	public void setdivida(double divida) {
		this.divida=divida;
	}
	
	public double getdivida(){
		return divida;
		}
	
	
	public void setsalario(double salario) {
		this.salario=salario;
	}
	public double getsalario(){
	

		return salario;
		}

	
		public double calcsalarifinal(double saldo,double divida,double salario) {
			this.saldo=saldo;
			this.divida=divida;
			this.salario=salario;
			
				saldo+=(salario-divida);
			return saldo;
		}
		
		
		public void setnumconta(String numconta) {
			this.numconta=numconta;
		}
		
		public String getnumconta(){
			return numconta;
			}
		
	


}
