package estrutura_repeti��o;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2;
		System.out.println("Digite dois n�meros. Nota: O segundo deve ser maior que o primeiro.");
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = ler.nextDouble();
		System.out.printf("Digite o segundo n�mero: ");
		num2 = ler.nextDouble();
		
		while(num1>=num2) {
			System.out.println("O segundo n�mero deve ser maior que o primeiro! Digite o segundo novamente: ");
			num2 = ler.nextDouble();
		}
	}

}
