package exercicios.Heranca.ex1;

public class TesteAnimal extends Animal {

	public static void main(String[] args) {
		
		Cachorro cao =new Cachorro();
	
		Cavalo cava=new Cavalo();
		Preguica preg=new Preguica();
		
		cao.setNome("Cachorro");
		cava.setNome("Cavalo");
		preg.setNome("Preguica");
		
		cao.setIdade(13);
		cava.setIdade(30);
		preg.setIdade(40);
		
		int caoidade=cao.getIdade();
		int cavaloidade=cava.getIdade();
		int preguicaidade=preg.getIdade();		
		
		String latido=cao.somAnimal("Latido");
		String relincho=cava.somAnimal("Relincho");
		String grito=preg.somAnimal("Grito da pregui�a");
		
	
		
		System.out.println("O animal de nome "+cao.getNome()+"\n"+" que tem a  idade m�xima de "+caoidade+" anos"+"\n Tem o seguinte som "+ latido);
		System.out.println();
		System.out.println("O animal de nome "+cava.getNome()+"\n"+" que tem a  idade m�xima de "+cavaloidade+" anos"+"\n Tem o seguinte som "+ relincho);
		System.out.println();
		System.out.println("O animal de nome "+preg.getNome()+"\n"+" que tem a  idade m�xima de "+preguicaidade+" anos"+"\n Tem o seguinte som "+ grito);
		
		

		
	}

}
