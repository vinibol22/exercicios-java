package exercicios.VetoresMatrizes;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
	
			double pontAtividades[]=new double [4];
			double maiorpont=0;
			System.out.println("Suas 5 pontuações");
			for(int i =0;i<pontAtividades.length;i++) {
				pontAtividades[i]=entrada.nextDouble();
				
				if(pontAtividades[i]>maiorpont) {
					maiorpont=pontAtividades[i];				}
			}
		
		
		System.out.println("A maior pontuação foi de :"+maiorpont);
		entrada.close();

	}

}
