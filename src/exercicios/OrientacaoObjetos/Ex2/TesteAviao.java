package exercicios.OrientacaoObjetos.Ex2;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao aviao=new Aviao();
		
		aviao.modelo="Bombardier CRJ Series";
		aviao.tamanho="Médio-Porte";
		aviao.numPassageiros=87;
		aviao.maxPassageiros=100;
		
		
		System.out.println("Modelo "+aviao.modelo);
		System.out.println("Tamanho "+aviao.tamanho);
	
		aviao.pousar();
		aviao.lotou(aviao.numPassageiros);

	}

}
