package exercicios.OrientacaoObjetos.Ex2;


public class Aviao {

	public String modelo;
	public String tamanho;
	public int numPassageiros;
	public int maxPassageiros;

	
	public void pousar() {
		System.out.println("O avi�o est� pousando...");
	}
	public void lotou (int numPassageiros) {
		int cadeirasvazia;
		cadeirasvazia =this.maxPassageiros-=this.numPassageiros;
		
		System.out.println("N�mero de cadeiras vazias: "+cadeirasvazia);
		
		
	}
	
	
}
