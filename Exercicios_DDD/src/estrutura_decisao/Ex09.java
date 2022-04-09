package estrutura_decisao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Coloque um número inteiro: ");
		num1 = ler.nextInt();
		
		System.out.printf("Coloque outro número inteiro: ");
		num2 = ler.nextInt();
		
		if (num1 < num2) {
			System.out.println("O menor número é: " + num1);
		}else { System.out.println("O menor número é: " + num2);
		
		}
		
	}

}
