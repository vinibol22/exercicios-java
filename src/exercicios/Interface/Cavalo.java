package exercicios.Interface;

public class Cavalo implements Animal{

	public String name="Cavalo";
	public int idade=40;
	
	@Override
	public void emitirSom() {
		System.out.println("relinchooo");
		
	}

	@Override
	public void correr() {
		System.out.println("corre");
		
	}

}
