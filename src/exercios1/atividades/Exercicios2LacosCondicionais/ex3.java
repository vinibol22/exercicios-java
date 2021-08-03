package Exercicios2LacosCondicionais;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade ");
		idade=entrada.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("INFANTIL");
			return ;
		}
		if(idade>=15 && idade<=17) {
			System.out.println("JUVENIL");
			return ;
		}
		if(idade>=18 && idade<=25) {
			System.out.println("ADULTO");
			return ;
		}
		
		else {
			System.out.println("IDADE INVÁLIDA");
			return ;
		}
		
		
	}
	
}
