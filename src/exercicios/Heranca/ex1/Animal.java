package exercicios.Heranca.ex1;

public class Animal {

	private String nome="" ;
	private int idade;
	public String som;
	public String correrouescala;
	
	
	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String somAnimal(String som) {
		this.som=som;
		
		return som;
	}

	public void escalaoucorre(String correrouescala){
		
			this.correrouescala=correrouescala;
		}
	
	}
	

