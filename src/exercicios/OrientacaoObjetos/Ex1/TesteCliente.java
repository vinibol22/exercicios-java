package exercicios.OrientacaoObjetos.Ex1;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente client1=new Cliente();
		int saldo=10000;
		int valorcompra=800;
		int desconto=300;
		int	idade=45;
		client1.nomeCompleto="Amanda Castro";
		client1.setidade(idade);
		client1.sexo="Feminino";
	System.out.println("Nome do cliente:  "+client1.nomeCompleto);	
	System.out.println("idade do cliente: "+client1.getidade(idade));	
	System.out.println("Sexo do cliente: "+client1.sexo);
	System.out.println("Valor da compra sem cupom: "+valorcompra);
	System.out.println("Valor da compra com cupom: "+client1.cupomdesconto(valorcompra,desconto));	
	double cupom=client1.cupomdesconto(valorcompra,desconto);
	System.out.println("Saldo final: "+client1.comprar(saldo,cupom));	

	}

}
