package exercicios.VetoresMatrizes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int lancamentoDado[]=new int [10];
		int soma=0,contMP=0;
		double media=0.0;
		System.out.println("Dado foi lançado :");
		
		for(int i =0;i<lancamentoDado.length;i++) {
			lancamentoDado[i]=entrada.nextInt();
			while(lancamentoDado[i]<1 || lancamentoDado[i]>6) {
				System.out.println("Número incompátivel com o lançamento de dado por favor repita o lançamento: ");
				lancamentoDado[i]=entrada.nextInt();
			}
			
			if(lancamentoDado[i]==6) {
		
				contMP++;
				
			}
			soma+=lancamentoDado[i];
			
		}
		media=soma/lancamentoDado.length;
		System.out.println("A média foi de: "+media);
		System.out.println("Os maiores lançamentos foram contabilizados "+contMP+" vezes"); 
		entrada.close();
	}

}
