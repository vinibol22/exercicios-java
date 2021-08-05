package exercicios.Lacos.Repeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	int	num=0,soma=0;
		do {
			System.out.println("Digite um número: ");
			num=entrada.nextInt();
			soma=soma+num;
		}
		while((num-1)>=0);

		System.out.println("A soma dos números é de: "+soma);
		
		entrada.close();
	}

}
