package exercicios.Lacos.Repeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int num,media=0,soma=0,cont=0;
		
		do {
			System.out.println("Digite um número :");
			num=entrada.nextInt();
			
			if(num%3==0) {
				soma=soma+num;
				cont++;
			}
			
		}while((num-1)>=0);
		media=soma/cont;
		System.out.println("A Média total foi de : "+media);
		entrada.close();

	}

}
