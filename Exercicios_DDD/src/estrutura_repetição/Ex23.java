package estrutura_repeti��o;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		System.out.println("Qual o seu sexo, Masculino (M) ou Feminino(F)?");
		sexo = ler.next();
		
		while(sexo != "M" && sexo != "F") {
			System.out.println("Ainda n�o entendi. Seu sexo � M ou F?");
			sexo = ler.next();
		}
		
		ler.close();
		
	}

}
