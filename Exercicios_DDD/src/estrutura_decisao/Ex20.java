package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.println("Digite a nota da P1: ");
		p1 = ler.nextDouble();
		
		p2 = (15 - p1)/2;
		
		System.out.println("Você precisa tirar " + p2 + " para ter uma média 5");
			
	}

}
