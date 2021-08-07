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
		System.out.println("Paciente em internacão...");
	}else {
		System.out.println("Paciente não precisa de internação");
	}while(graudegravidade<0 || graudegravidade>3) {
		System.out.println("grau de gravidade inválido");
	}
}

public void setdoenca(String doenca) {
	this.doenca=doenca;
}
	
public String getdoenca() {
	return doenca;
	}
	
	
	
}
