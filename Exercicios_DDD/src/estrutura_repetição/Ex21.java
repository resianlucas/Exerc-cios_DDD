package estrutura_repetição;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número positivo: ");
		num = ler.nextInt();
		
		while (num<0) {
			System.out.printf("Erro! Você digitou um número negativo. \nDigite um número positivo: ");
			num = ler.nextInt();
			
		}
		
		
		
	}

}
