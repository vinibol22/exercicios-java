package exercio.java;
import java.util.Scanner;
public class quintoex5 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
	int peso1=1,peso2=3,peso3=3;
	double nota1,nota2,nota3;
	
		int pesoPonderado=peso1+peso2+peso3;
		
		
		System.out.println("Digite sua primeira nota :");
		nota1=Integer.parseInt(console.nextLine());
		
		System.out.println("Digite sua segunda nota :");
		nota2=Integer.parseInt(console.nextLine());
		
		System.out.println("Digite sua terceira nota :");
		nota3=Integer.parseInt(console.nextLine());


		double notaPonderada1=nota1*peso1;
		double notaPonderada2=nota2*peso2;
		double notaPonderada3=nota3*peso3;
		double mediaPonderada= (notaPonderada1+notaPonderada2+notaPonderada3)/pesoPonderado;
				
				System.out.println("sua média ponderada foi de "+mediaPonderada);
				
				
				
		console.close();
	
	 }
	}


