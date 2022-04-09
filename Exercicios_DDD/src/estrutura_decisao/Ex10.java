package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Coloque algum número inteiro: ");
		num1 = ler.nextInt();
		
		System.out.printf("Coloque outro número inteiro: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.printf("O maior número é %d", num1);
		}else if (num1 == num2) {
			System.out.printf("Os números são idênticos!");
		}else { 
			System.out.printf("O maior número é %d", num2);
		}
		
	}

}
