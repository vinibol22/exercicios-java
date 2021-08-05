package exercicios.Lacos.Repeticao;

import java.util.Scanner;


public class Ex4 {
		
	public static void main(String[] args) {
		
	
		Scanner entrada=new Scanner(System.in);
		
		
		int i=0,idade=0,sexo,personalidade,contPc=0,contMn=0,contHa=0,contOc=0,contPmais40=0,
				contPcmenos18=0;
		
		while(i<=2) {
			i++;
		
			System.out.println("Qual é a sua idade ");
			idade=entrada.nextInt();
			while(idade<0 || idade>=130) {

				System.out.println("Houve na digitação por favor repita a operação ,e digite-a novamente a sua idade ");
				idade=entrada.nextInt();
			}
			System.out.println("Qual é o seu sexo  \n 1=Feminino  2=Masculino  3=Outros");
			sexo=entrada.nextInt();
			
			while(sexo <1 || sexo >3) {
				System.out.println("Houve erro na digitação por favor repita a operação ,e digite-a novamente seu sexo ");
				sexo=entrada.nextInt();
			}
			
			System.out.println("Digite o número de sua personalidade  \n 1=Calmo  2=Nervoso  3=Agressivo");
			personalidade=entrada.nextInt();
			
			while(personalidade <1 || personalidade >3) {
				System.out.println("Houve erro na digitação por favor repita a operação ,e digite-a novamente sua personalidade ");
				personalidade=entrada.nextInt();
			}
			if(personalidade==1) {
				contPc++;
			}
			if(sexo==1&&personalidade==2) {
				contMn++;
			}
			if(sexo==2&&personalidade==3) {
				contHa++;
			}
			if(sexo==3&&personalidade==1) {
				contOc++;
			}
			if(idade>=40&&personalidade==2) {
				contPmais40++;
			}
			if(idade<=18&&personalidade==1) {
				contPcmenos18++;
			}
		}
		
	System.out.println("Número de pessoas Calmas :"+contPc);
	System.out.println("Número de mulheres Nervosas :"+contMn);
	System.out.println("Número de homens Agressivos :"+contHa);
	System.out.println("Número de Outros sexo que são Calmos :"+contOc);
	System.out.println("Número de Pessoas nervosas com mais de 40 :"+contPmais40);
	System.out.println("Número de Pessoas calmas com menos 18 anos : "+contPcmenos18 );
	
	entrada.close();
	}

}
