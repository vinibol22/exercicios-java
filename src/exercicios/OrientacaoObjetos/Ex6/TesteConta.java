package exercicios.OrientacaoObjetos.Ex6;

public class TesteConta {

	public static void main(String[] args) {
	
		Conta cont=new Conta();
		
		String nome=cont.nome="Vinicius Barreto";
		
		cont.setnumconta("6565-d6545");
		String	numconta=cont.getnumconta();
		
		cont.setsaldo(1000);
		double saldo=cont.getsaldo();
		
		cont.setdivida(500);
		double divida=cont.getdivida();
		
		cont.setsalario(1000);
		double salario=cont.getsalario();
		
		
		System.out.println("Nome "+nome);
		System.out.println("Número da conta "+numconta);
		System.out.println("Saldo antes das divida e salário "+saldo);
		System.out.println("Dividas a serem pagas "+divida);
		System.err.println("Sálario recebido "+salario);
		
		double salariofinal=cont.calcsalarifinal(saldo, divida, salario);
		System.out.println("O Saldo final foi de "+salariofinal+"R$");
		
		
	}

}
