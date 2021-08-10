package exercicios.Interface;

public class AnimalTeste {
	
	public static void main(String[] args) {
		Cavalo cav=new Cavalo();
		Preguica preg=new Preguica();
		Cachorro cao=new Cachorro();

		
		
		
		
		
	System.out.println("Som cavalo "); 
	cav.emitirSom();	
	System.out.println();
	System.out.println("Som preguiça ");	
	preg.emitirSom();
	System.out.println();
	System.out.println("Som cão ");	
	cao.emitirSom();	
		
	}

}
