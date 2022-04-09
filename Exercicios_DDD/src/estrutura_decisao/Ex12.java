package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int altura;
		int base;
	
		int terreno;
		
		System.out.printf("Informe a altura: ");
		altura = ler.nextInt();
		
		System.out.printf("Informe a base: ");
		base = ler.nextInt();
		
		terreno = altura*base;
		
		System.out.printf("Terreno é " + terreno);
		
		if (terreno > 100) {
			System.out.println("\nTerreno grande");
		} else {
			System.out.println("\nTerreno pequeno");
		}
		
	}

}
