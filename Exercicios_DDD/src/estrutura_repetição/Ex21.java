package estrutura_repeti��o;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um n�mero positivo: ");
		num = ler.nextInt();
		
		while (num<0) {
			System.out.printf("Erro! Voc� digitou um n�mero negativo. \nDigite um n�mero positivo: ");
			num = ler.nextInt();
			
		}
		
		
		
	}

}
