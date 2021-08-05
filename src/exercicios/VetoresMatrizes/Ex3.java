package exercicios.VetoresMatrizes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	int [][]N=new int[4][6];
	int	[][]N2=new int [4][6];
	int	[][]M1=new int [4][6];
	int	[][]M2=new int [4][6];
	
	
	for(int l=0;l < N.length;l++) { 
		
		for(int c=0;c < N[l].length;c++) {
			
			System.out.println("Digite os números da matriz num1 :"+l+""+c);
			N[l][c]=entrada.nextInt();	
			
		
		}	


		}		

		for(int l=0;l < N2.length;l++) { 
		
		for(int c=0;c < N2[l].length;c++) {
			
			System.out.println("Digite os números da matriz num2 :"+l+""+c);
			N2[l][c]=entrada.nextInt();	
			
		
		}	
		}		

	System.out.println("Os elementos da matriz M1 =");
	
	for(int l=0;l < N.length;l++){ 
		
		for(int c=0;c < N[l].length;c++) {
			
					
					if(N[l][c]==N2[l][c]) {
			
						M1[l][c]=N[l][c]+N2[l][c];
						
					}System.out.print(M1[l][c]+"/");
														}	
															}		
	
	
	
					System.out.println();
	
						System.out.println("Os elementos da matriz M2 =");
	
							for(int l=0;l < N.length;l++){ 
		
								for(int c=0;c < N[l].length;c++) {
			
					
									if(N[l][c]==N2[l][c]) {
			
											M2[l][c]=N[l][c]-N2[l][c];
						
											}System.out.print(M2[l][c]+"/");
			
		
										}	
									}		
	
	
	}

}
