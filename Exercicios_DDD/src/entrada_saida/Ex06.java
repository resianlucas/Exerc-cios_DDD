package entrada_saida;

import java.util.Scanner;


public class Ex06 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Coloque a cotação atual do dólar hoje: ");
		a = ler.nextDouble();
		
		System.out.printf("Coloque o valor em dólar: ");
		b = ler.nextDouble();
		
		c = a*b;
				
		System.out.printf("A quantia em real é %.2f", c);
		
	
 }
}