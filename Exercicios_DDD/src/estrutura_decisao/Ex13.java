package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo número: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro número: ");
		c = ler.nextInt();
		
		if (a>b) {
			if (a>c)
				System.out.println("O maior número é: " + a);
			else 
				System.out.println("O maior número é: " + c);
			}else {
				if (b>c)
					System.out.println("O maior número é: " + b);
				else 
					System.out.println("O maior número é: " + c);
		}
		

	}

}
