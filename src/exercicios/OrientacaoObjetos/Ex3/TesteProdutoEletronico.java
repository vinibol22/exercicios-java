package exercicios.OrientacaoObjetos.Ex3;

public class TesteProdutoEletronico {
	public static void main(String[] args) {

	
		ProdutoEletronico produto=new ProdutoEletronico();
		produto.nome="R�dio";
		produto.preco=96;
		
		
		System.out.println("Nome do produto "+produto.nome);
		System.out.println("Pre�o do produto "+produto.preco+"R$");
		produto.ligardesligar();
	}
	
}
