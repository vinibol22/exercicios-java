package exercicios.Collections;

public class Loja {

private int qtdEletro;
private String nome;

	
	public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



	public int getQtdEletro() {
	return qtdEletro;
}



public void setQtdEletro(int qtdEletro) {
	this.qtdEletro = qtdEletro;
}



		public String Lojas(String nome,int qtdEletro) {
			
			
			return "Nome do Eletro "+this.nome+"Quantidade disponivel em estoque "+this.qtdEletro;
			
		}
}
