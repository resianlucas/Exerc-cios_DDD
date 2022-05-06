package Ex33;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

			
				Scanner ler = new Scanner(System.in);
				
				Produto [] listaProduto = new Produto[10];
				
				for (int i = 0; i < 10; i++) {
					
					Produto prod = new Produto();
					
					System.out.printf("Digite o id do produto: ");
					prod.id = ler.nextInt();
					
					System.out.printf("Digite a descrição do produto: ");
					prod.descricao = ler.next();
					
					System.out.printf("Digite o valor do produto: ");
					prod.valor = ler.nextDouble();
					
					System.out.printf("Digite a quantidade: ");
					prod.quantidade = ler.nextDouble();
					
					listaProduto[i] = prod;
					
					
				}
				
				for (int i = 0; i <= 9; i++) {
					
					if (listaProduto[i].valor >= 100) {
						
						System.out.printf("%s", listaProduto[i].descricao);
					
					}
					
				}
				
				ler.close();

	}

}
