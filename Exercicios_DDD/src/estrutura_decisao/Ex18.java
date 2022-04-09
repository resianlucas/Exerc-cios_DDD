package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double a, t, Vi, Vf;
		
		System.out.printf("Digite a velocidade inicial do veículo (em m/s): ");
		Vi = ler.nextDouble();
		
		System.out.printf("Digite a aceleração do veículo(em m/s²): ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o tempo(em segundos)gasto pelo veículo para completar o percurso: ");
		t = ler.nextDouble();
		
		Vf = Vi + (a * t);
		
		Vf =  Vf * 3.6;
		
		System.out.printf("A velocidade do veículo em km/h é: %.1f", Vf);
		
		if( Vf < 40) {
			System.out.println("\nVeículo muito lento");
		}
		else if(40 < Vf && Vf <= 60) {
			System.out.println("\nVelocidade permitida");
		}
		else if(60 < Vf && Vf <= 80) {
			System.out.println("\nVelocidade de cruzeiro");
		}
		else if(80 < Vf && Vf <= 120) {
			System.out.println("\nVeículo rápido");
		}
		else {
			System.out.println("\nVeículo muito rápido");
		}
		
	}
	
}		