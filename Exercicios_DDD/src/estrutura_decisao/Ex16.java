package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Vamos criar um triângulo retângulo");
		
		System.out.printf("Digite o primeiro número: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo número: ");
		num2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro número: ");
		num3 = ler.nextDouble();
		
		if((num3 * num3) == (num1 * num1) + (num2 * num2) || (num1 * num1) == (num3 * num3) + (num2 * num2) || (num2 * num2) == (num3 * num3) + (num1 * num1)){
			System.out.printf("É um triângulo retângulo.");			
		} else {
			System.out.printf("Não é um triângulo retângulo.");
		}
		
	}

}