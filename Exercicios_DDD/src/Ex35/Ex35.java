package Ex35;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaCliente = new Cliente[5];
		
		int id;
		String nome;
		int idade;
		String email;
		char resposta;
		String agencia;
		String numero;
		double saldo;
		Conta conta;

		
		for (int i = 0; i <= 4; i++) {
		
			Cliente cliente = new Cliente();
			
			System.out.printf("Digite o id: ");
			id = ler.nextInt();
			cliente.setId(id);
			
			System.out.printf("Digite o nome: ");
			nome = ler.next();
			cliente.setNome(nome);
			
			System.out.printf("Digite a idade: ");
			idade = ler.nextInt();
			cliente.setIdade(idade);
			
			System.out.printf("Digite o email: ");
			email = ler.next();
			cliente.setEmail(email);
			
			System.out.printf("Tem conta bancária? S/N");
			resposta = ler.next().charAt(0);
			
			if (resposta == 'S' || resposta == 's') {
				
				conta = new Conta();
				
				System.out.printf("Digite a agencia: ");
				agencia = ler.next();
				conta.setAgencia(agencia);
				
				System.out.printf("Digite o numero: ");
				numero = ler.next();
				conta.setNumero(numero);
				
				System.out.printf("Digite o saldo: ");
				saldo = ler.nextDouble();
				conta.setSaldo(saldo);
				
				
			} else {
				
				conta = null;
				
			}
			
			
			cliente = new Cliente(id, nome, idade, email, conta);
			
			listaCliente[i] = cliente;
			
		}
		
		// exibir clientes
		
		for (int i = 0; i <= 4; i++) {
			
			
			System.out.printf("\n Dados do cliente %d \n Nome: %s \n Idade: %d \n Saldo: %s", listaCliente[i].getId(), listaCliente[i].getNome(), listaCliente[i].getIdade(), listaCliente[i].getConta().getSaldo());
			
		}
		
		

		ler.close();

	}
	
	

}
