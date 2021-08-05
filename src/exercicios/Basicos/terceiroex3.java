package exercicios.Basicos;
import java.util.Scanner;
public class terceiroex3 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
		double horas,minutos,segundos = 0,segundosI;
		double horasI;
		double minutosI;
	
		
		System.out.println("Quantos segundos durou a festa :");
		segundos=Integer.parseInt(console.nextLine());
		
		horas=segundos/3600;
		horasI=segundos/3600;
		
				minutos=(horas-horasI)*60;
				minutosI=(horas-horasI)*60;

				segundosI=(minutos-minutosI)*60;
		
		System.out.println(horas+" horas"+minutosI+" minutos "+segundos+" segundos");
		
		console.close();
	
	 }
	}


