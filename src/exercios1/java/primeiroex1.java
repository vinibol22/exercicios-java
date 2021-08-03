package exercios1.java;
import java.util.Scanner;
public class primeiroex1 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
		int idadeD;
		int idadeA;
		
		int meses;
		int dias;
		
		System.out.println("Quantos anos voce tem :");
		idadeA= Integer.parseInt(console.nextLine());
		
		System.out.println("Quantos meses até seu aniversário :");
		meses= Integer.parseInt(console.nextLine());
		
		System.out.println("Quantos dias até seu aniversário :");
		dias= Integer.parseInt(console.nextLine());
		
		idadeD=(idadeA * 365) + (meses * 30) + dias ;
		System.out.println("Voce tem "+idadeD+" dias de idade");
	}

}
