package exercicios.Basicos;
import java.util.Scanner;
public class oitavoex8 {

	public static void main(String[] args) {
	      Scanner console = new Scanner(System.in);
	
	double custoFabrica,custodistribuidor,custoimpostos,custoConsumidor;
	
		
		
		
		System.out.println("escreva o custo de fábrica do carro  :");
			custoFabrica=Integer.parseInt(console.nextLine());
		
			custodistribuidor=custoFabrica*1.28;
			custoimpostos=custoFabrica*1.45;

				custoConsumidor=(custoimpostos+custodistribuidor)-(custoFabrica);
				System.out.println("valor total do carro  :"+custoConsumidor+"reais");
			
				
				
		console.close();
	
	 }
	}


