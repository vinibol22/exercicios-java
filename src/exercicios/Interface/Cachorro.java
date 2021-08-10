package exercicios.Interface;

public class Cachorro implements Animal{

	public String name="Cachorro";
	public int idade=13;
	
	@Override
	public void emitirSom() {
		System.out.println("auauauauau");
		
	}

	@Override
	public void correr() {
			System.out.println("corre");		
	}

}
