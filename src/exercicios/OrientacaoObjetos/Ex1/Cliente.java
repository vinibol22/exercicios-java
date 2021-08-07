package exercicios.OrientacaoObjetos.Ex1;

public class Cliente {
	
	protected String nomeCompleto;
	private int idade;
	public String sexo;
	private double saldo;
	public double desconto;
	public double valorgasto;
	
	
	public void setidade(int idade){
		this.idade=idade;
	}
	public int getidade(int getidade) {
		return this.idade;
	}
	
	
	
	
	public void setsaldo(double saldo){
		this.saldo=saldo;
	}
	
		public double getsaldo(double saldo) {
	
		return	this.saldo;
		}
	
	
	
	
	
	public double comprar(double saldo,double valorgasto) {
		this.saldo=saldo;
		this.valorgasto=valorgasto;
		return saldo-valorgasto;
	}
	
	public double cupomdesconto(double valorgasto,double desconto) {
	
		this.desconto=desconto;
		return this.valorgasto=valorgasto-desconto;
	}
	
	public void trocar() {
		System.out.println("O cliente trocou algo na loja ");
	}
	
	
	
}
