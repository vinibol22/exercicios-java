package exercicios.OrientacaoObjetos.Ex4;

public class testeFuncionario {

	public static void main(String[] args) {
		
		Funcionario func=new Funcionario();
		
		func.nome="Vinicius Barreto Barbosa";
		func.funcao="Gerente";
		func.impostos=1000;
	//	int salario=15000;
		
		func.setsalario(15000);
		double salario=func.getsalario();
		
		
		System.out.println("Nome "+func.nome);
		System.out.println("Função "+func.funcao);
		System.out.println("Impostos "+func.impostos);
		System.out.println("Sálarios com impostos "+func.salario(salario,func.impostos));
}
}
