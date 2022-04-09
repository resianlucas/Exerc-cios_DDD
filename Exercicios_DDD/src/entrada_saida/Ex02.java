package entrada_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int aresta;
		
		System.out.println("Área de um quadrado");
		
		System.out.println("Digite o valor da aresta: ");
		aresta = ler.nextInt();
	
		
		double area;
		
		area = aresta*aresta;
		
		System.out.printf("A área do retângulo é %.2f", area);
	}

}

