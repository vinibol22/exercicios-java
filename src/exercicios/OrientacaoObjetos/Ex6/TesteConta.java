package exercicios.OrientacaoObjetos.Ex6;

public class TesteConta {

	public static void main(String[] args) {
	
		double destino=0;
		
		Conta cont=new Conta();
		
		Conta cont2=new Conta();
		
		
		String nome=cont.nome="Vinicius Barreto";
		
		cont.setnumconta("6565-d6545");
		String	numconta=cont.getnumconta();
		
		cont.setsaldo(1000);
		double saldo=cont.getsaldo();
		
		cont.setdivida(500);
		double divida=cont.getdivida();
		
		cont.setsalario(1000);
		double salario=cont.getsalario();
		
		
		
		cont2.nome="Vinicius Barreto";
		
		cont2.setnumconta("6565-d6545");
		cont2.getnumconta();
		
		cont2.setsaldo(5000);
		double num =cont2.getsaldo();
		
		cont2.setdivida(500);
		cont2.getdivida();
		
		cont2.setsalario(1000);
		cont2.getsalario();
		
		System.out.println("aquii"+cont.getsaldo());
		System.out.println("aquii"+cont2.getsaldo());
		
		cont.transfere(num, 500);
		System.out.println("sdsds"+cont.getsaldo());
		System.out.println("aquii"+cont2.getsaldo());
		
		
		
		
		
		
		System.out.println("Nome "+nome);
		System.out.println("Número da conta "+numconta);
		System.out.println("Saldo antes das divida e salário "+saldo);
		System.out.println("Dividas a serem pagas "+divida);
		System.err.println("Sálario recebido "+salario);
		
		double salariofinal=cont.calcsalarifinal(saldo, divida, salario);
		System.out.println("O Saldo final foi de "+salariofinal+"R$");
		
		
	}

}
