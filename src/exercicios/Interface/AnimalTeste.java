package exercicios.Interface;

public class AnimalTeste {
	
	public static void main(String[] args) {
		Cavalo cav=new Cavalo();
		Preguica preg=new Preguica();
		Cachorro cao=new Cachorro();

		
		
		
		
		
	System.out.println("Som cavalo "); 
	cav.emitirSom();	
	System.out.println();
	System.out.println("Som pregui�a ");	
	preg.emitirSom();
	System.out.println();
	System.out.println("Som c�o ");	
	cao.emitirSom();	
		
	}

}
