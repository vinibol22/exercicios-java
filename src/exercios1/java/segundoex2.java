package exercios1.java;
import java.util.Scanner;
public class segundoex2 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
		int idadeD;
		int idadeA;
		
		int mesesB;
		int dias;
		
		System.out.println("Qual todal de dias na terra :");
		idadeD= Integer.parseInt(console.nextLine());
		
		
		
		idadeA=idadeD/365;
		mesesB=(idadeD%365)/30;
		
		dias=(idadeD%365)%30;
		
		System.out.println(idadeA+"anos "+mesesB+"meses "+dias+"dias");
		
		
		console.close();
		
	}

}
