package Exercicios2LacosCondicionais;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int num1,num2,num3;
		int primeiro=0,segundo=0,terceiro=0;
	
			System.out.println("Digite um némero");
			num1=entrada.nextInt();			
		
			
			System.out.println("Digite um némero");
			num2=entrada.nextInt();	
			
			System.out.println("Digite um némero");
			num3=entrada.nextInt();	
	
			if(num1-num2>=0 && num1-num3>0) {
				primeiro=num1;
			}
		
			if(num1-num2<=0 && num1-num3<=0) {
				terceiro=num1;
			}
			
			
			if(num2-num1>=0 && num2-num3>0) {
				primeiro=num2;
			}
	
			if(num2-num3<=0 && num2-num1<=0) {
				terceiro=num2;
			}
			
			
			if(num3-num2>=0 && num3-num1>0) {
				primeiro=num3;
			}
		
			if(num3-num2<=0 && num3-num1<=0) {
				terceiro=num3;
			}
			
			 if(num1!=primeiro && num1 !=terceiro) {
				segundo=num1;
				
				
			}
			 if(num2!=primeiro && num2 !=terceiro) {
				segundo=num2;
				
				
			}
			 if(num3!=primeiro && num3 !=terceiro) {
				segundo=num3;
				
				
			}
	
			System.out.println(terceiro+"  "+segundo+"  "+primeiro);
		entrada.close();
	}

}
