package exercicios.Interface;

public class Preguica implements Animal{
	
	public String name="Preguiça";
	public int idade=30;
	
	@Override
	public void emitirSom() {
		System.out.println("aaaaaaaaaaaaaaa");
		
	}

	@Override
	public void correr() {
		System.out.println("não corre !");
		
	}

	
}
