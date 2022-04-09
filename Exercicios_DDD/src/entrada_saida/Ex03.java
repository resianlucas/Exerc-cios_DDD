package entrada_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int base, altura;
		
		System.out.println("Área de um triângulo");
		System.out.printf("Digite o valor da base: ");
		base = ler.nextInt();
		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextInt();
		
		double area;
		
		area = (base*altura)/2;
		
		System.out.println("A área do triângulo é: " + area);
		
		
	}

}
