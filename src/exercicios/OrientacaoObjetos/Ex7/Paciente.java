package exercicios.OrientacaoObjetos.Ex7;

public class Paciente {

	public String nome;
	public int numcirurgias;
	private String doenca;
	public String Sexo;
	public int idade;
	public int graudegravidade;
	
	
public	void precisainternacao(int graudegravidade) {
	this.graudegravidade=graudegravidade;
	if(graudegravidade>=2) {
		System.out.println("Paciente em internac�o...");
	}else {
		System.out.println("Paciente n�o precisa de interna��o");
	}while(graudegravidade<0 || graudegravidade>3) {
		System.out.println("grau de gravidade inv�lido");
	}
}

public void setdoenca(String doenca) {
	this.doenca=doenca;
}
	
public String getdoenca() {
	return doenca;
	}
	
	
	
}
