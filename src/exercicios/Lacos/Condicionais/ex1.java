package exercicios.Lacos.Condicionais;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		int num1=0,num2,num3,maior=0;
		Scanner entrada=new Scanner(System.in);
		
		

		for(int i=0;i<3;i++) {
		
			System.out.println("Digite um número: ");
			num1=entrada.nextInt();
			if(maior<num1 ) {

			maior=num1;
			}
		}
		
		System.out.println("O maior número foi o: \n "+maior);
		entrada.close();
	}

}
