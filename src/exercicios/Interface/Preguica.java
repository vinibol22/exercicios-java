package exercicios.Interface;

public class Preguica implements Animal{
	
	public String name="Pregui�a";
	public int idade=30;
	
	@Override
	public void emitirSom() {
		System.out.println("aaaaaaaaaaaaaaa");
		
	}

	@Override
	public void correr() {
		System.out.println("n�o corre !");
		
	}

	
}
