package exercicios.OrientacaoObjetos.Ex7;

public class TestePaciente {

	public static void main(String[] args) {
	Paciente pac=new Paciente();
	
	String nome=pac.nome="Vinicius Barreto";
	int numcirurgias=pac.numcirurgias=4;
	int idade=pac.idade=15;
	String sexo=pac.Sexo="Masculino";
	int graudegravidade=pac.graudegravidade=2;
	
	pac.setdoenca("Parkisson");
	String doenca=pac.getdoenca();
	
	
	System.out.println("Nome "+nome);
	System.out.println("Números de cirurgias "+numcirurgias);
	System.out.println("idade do paciente "+idade);
	System.out.println("Sexo do paciente "+sexo);
	System.out.println("Doença do paciente "+doenca);
	
	pac.precisainternacao(graudegravidade);
	
	
	}

}
