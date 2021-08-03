package exercios1.java;
import java.util.Scanner;
public class quartoex4 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
	int numA,numB,numC,R,S,D;
	
		
		System.out.println("Digite um número :");
		numA=Integer.parseInt(console.nextLine());
		
		System.out.println("Digite um número :");
		numB=Integer.parseInt(console.nextLine());
		
		System.out.println("Digite um número :");
		numC=Integer.parseInt(console.nextLine());

				R=(numA+numB)^2;
				S=(numB+numC)^2;
				D=(R+S)/2;
				
				System.out.println();
				System.out.println(D);
				
				
		console.close();
	
	 }
	}


