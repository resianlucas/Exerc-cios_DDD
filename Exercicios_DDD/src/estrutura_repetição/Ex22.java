package estrutura_repetição;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2;
		System.out.println("Digite dois números. Nota: O segundo deve ser maior que o primeiro.");
		System.out.printf("Digite o primeiro número: ");
		num1 = ler.nextDouble();
		System.out.printf("Digite o segundo número: ");
		num2 = ler.nextDouble();
		
		while(num1>=num2) {
			System.out.println("O segundo número deve ser maior que o primeiro! Digite o segundo novamente: ");
			num2 = ler.nextDouble();
		}
	}

}
