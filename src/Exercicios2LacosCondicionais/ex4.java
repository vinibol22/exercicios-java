package Exercicios2LacosCondicionais;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		double num=0;
		
		System.out.println("Digite um n�mero");
		num=entrada.nextDouble()
;		if(num % 2==0) {
		num=Math.sqrt(num);
		System.out.println("o n�mero � par e a sua raiz quadrada � de : \n"+num);
		}
		
		else {
			num=Math.pow(num, 2);
			System.out.println("o n�mero � �mpar e a sua potencia��o � de : \n"+num);
		}
		
	}

}
