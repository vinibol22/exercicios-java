package exercicios.Lacos.Repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num=0;
		String resultadopares=" ";
		String resultadoimpares=" ";
		for(int i=0;i<10;i++) {
			System.out.println("Digite um número :");
			num=entrada.nextInt();
			if(num%2==0) {
				resultadopares=resultadopares+" "+num;
				
			}else {
				resultadoimpares=resultadoimpares+" "+num;
				
			}
			
		
			
		}
		System.out.println("Pares: "+resultadopares);
		System.out.println("impares: "+resultadoimpares);

		
		
		entrada.close();
	}

}
