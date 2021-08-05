package exercicios.Lacos.Repeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int idade =0;
		int menoresde21=0,maioresde50=0,nenhumadaspcoes=0;
		Scanner entrada=new Scanner(System.in);
		while(idade>=(-98)) {
			System.out.println("Digite um número");
			idade=entrada.nextInt();
			if(idade<=21) {
				menoresde21++;
			}
			if(idade>=50) {
				maioresde50++;
			}
			else {
				nenhumadaspcoes++;
			}
			
		}
		System.out.println("Total de Pessoas com menos de 21 anos = "+menoresde21);
		System.out.println("Total de Pessoas com mais de 50 anos = "+maioresde50);
		System.out.println("nenhuma das opções = "+nenhumadaspcoes);

	}

}
