package entrada_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura;
		
		System.out.println("Área de um retângulo");
		
		System.out.println("Digite o valor da base: ");
		base = ler.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = ler.nextDouble();
		
		double area;
		
		area = base*altura;
		
		System.out.printf("A área do retângulo é %.2f", area);
	}

}
