package exercios1.java;
import java.util.Scanner;
public class setimoex7 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
	
	double a,b,c,d,j,f,x,y;
	
		
		
		
		System.out.println("escreva o valor de a  :");
		a=Integer.parseInt(console.nextLine());
		
		System.out.println("escreva o valor de b :");
		b=Integer.parseInt(console.nextLine());
		
		System.out.println("escreva o valor de c :");
		c=Integer.parseInt(console.nextLine());

		System.out.println("escreva o valor de d :");
		d=Integer.parseInt(console.nextLine());
		
		System.out.println("escreva o valor de e :");
		j=Integer.parseInt(console.nextLine());
		
		System.out.println("escreva o valor de f :");
		f=Integer.parseInt(console.nextLine());
		
		
				x=(c*j)-(b*f)/(a*j)-(b*d);
				y=(a*f)-(c*a)/(a*j)-(b*d);
				System.out.println("O valor de x é "+x);
				System.out.println("O valor de y é "+y);
				
				
		console.close();
	
	 }
	}


