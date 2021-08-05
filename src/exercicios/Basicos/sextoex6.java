package exercicios.Basicos;
import java.util.Scanner;
public class sextoex6 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
	
	double x1,x2,y1,y2,p1,p2,d;
	
		
		
		
		System.out.println("Digite sua primeira nota :");
		x1=Integer.parseInt(console.nextLine());
		
		System.out.println("Digite sua segunda nota :");
		x2=Integer.parseInt(console.nextLine());
		
		System.out.println("Digite sua terceira nota :");
		y1=Integer.parseInt(console.nextLine());

		System.out.println("Digite sua terceira nota :");
		y2=Integer.parseInt(console.nextLine());

				p1=x2-x1;
				p2=y2-y1;

				d=p1 + p2;
				System.out.println("O ponto certo foi de "+d);
				
				
				
		console.close();
	
	 }
	}


