package exercicios.OrientacaoObjetos.Ex5;

public class TestePatineteEletrico {

	public static void main(String[] args) {
	
		
		
		Patinete pati=new Patinete();
		
	String marca=pati.marca="Foston Fs-S08 Pro";
	String cor=pati.cor="Vermelho";
		
	double preco=pati.preco=6548;
		System.out.println("Marca "+marca);
		System.out.println("Cor "+cor);
		System.out.println("Preço do patinete "+preco);
		pati.eletrico();
		}

}
