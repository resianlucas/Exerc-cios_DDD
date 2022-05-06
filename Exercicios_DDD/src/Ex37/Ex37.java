package Ex37;

import java.io.IOException;
import java.util.Scanner;

import Ex35.Cliente;
import Ex35.Conta;

import java.util.ArrayList;

public class Ex37 {
	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		
		ArrayList<cliente> listaClientes = new ArrayList<>();
		int opcao;
		int id;
		String nome;
		int idade;
		String email;
		char possuiConta;
		Conta Conta;
		String agencia;
		double saldo;
		String numero;
		int escolha;
		
		do {
			System.out.printf("==> Sistema de Cadastro de Clientes <== \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Incluir cliente \n"+
							  "2 - Atualizar cliente \n"+
					 		  "3 - Excluir cliente \n"+
							  "4 - Exibir cliente \n" +
					 		  "5 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao=ler.nextInt();
			
			if(opcao==1) {
				cliente cliente=new cliente();
				id=listaClientes.size()+1;
				cliente.setId(id);
				
				System.out.printf("\nDigite o nome do cliente: ");
				nome=ler.next();
				cliente.setNome(nome);
				
				System.out.printf("Digite a idade do cliente: ");
				idade=ler.nextInt();
				cliente.setIdade(idade);
				
				System.out.printf("Digite o email do cliente: ");
				email=ler.next();
				cliente.setEmail(email);
				
				System.out.printf("Possui Conta bancaria? (S/N)");
				possuiConta = ler.next().charAt(0);
				
				if (possuiConta == 'S') {
					Conta ct = new Conta();
				
					
					System.out.printf("Digite a agência da Conta: ");
					agencia = ler.next();
					ct.setAgencia(agencia);
					System.out.printf("Digite o número da Conta: ");
					numero = ler.next();
					ct.setNumero(numero);
					System.out.printf("Digite o saldo da Conta: ");
					saldo = ler.nextDouble();
					ct.setSaldo(saldo);
					
					Conta = ct;
					cliente.setConta(Conta);
				}else{
					Conta=null;
					cliente.setConta(Conta);
				}
				listaClientes.add(cliente);
			}else if(opcao==2) {
				for(cliente a: listaClientes) {
					System.out.printf("\nID: %d - Nome: %s - Idade: %d - Email: %s \n", a.getId(), 
							a.getNome(), a.getIdade(), a.getEmail());
					if(a.getConta()!=null) {
						System.out.printf("Agência: %s - Número: %s - Saldo: R$%s \n",a.getConta().getAgencia(),a.getConta().getNumero(),
								a.getConta().getSaldo());
					}
				}
				System.out.printf("Digite o id do cliente que deseja atualizar: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o novo nome do cliente: ");
				nome=ler.next();
				
				System.out.printf("Digite a nova idade do cliente: ");
				idade=ler.nextInt();
				
				System.out.printf("Digite o novo email do cliente: ");
				email=ler.next();
				
				cliente cliente = listaClientes.get(id-1);
				
				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setEmail(email);
				System.out.printf("Deseja atualizar os dados da Conta bancaria do cliente?\n");
				System.out.printf("1 - sim\n"+
								  "2 - não\n");
				escolha=ler.nextInt();
					if(escolha==1) {
						System.out.printf("Digite a nova agência da Conta: ");
						agencia = ler.next();
						cliente.getConta().setAgencia(agencia);
						System.out.printf("Digite o novo número da Conta: ");
						numero = ler.next();
						cliente.getConta().setNumero(numero);
						System.out.printf("Digite o novo saldo da Conta: ");
						saldo = ler.nextDouble();
						cliente.getConta().setSaldo(saldo);
						
					}
				System.out.printf("Cliente atualizado com sucesso!");
				System.in.read();
			}else if(opcao==3) {
				for(cliente a: listaClientes) {
					System.out.printf("\nID: %d - Nome: %s - Idade: %d - Email: %s \n", a.getId(), 
							a.getNome(), a.getIdade(), a.getEmail());
					if(a.getConta()!=null) {
						System.out.printf("Agência: %s - Número: %s - Saldo: R$%s \n",a.getConta().getAgencia(),a.getConta().getNumero(),
								a.getConta().getSaldo());
					}
					
				}
				System.out.printf("Digite o id do cliente que deseja excluir: ");
				id=ler.nextInt();
				
				listaClientes.remove(id-1);
				System.out.printf("Cliente excluido com sucesso!");
				
			System.in.read();
			}else if(opcao==4) {
				for(cliente a: listaClientes) {
					System.out.printf("\nID: %d - Nome: %s - Idade: %d - Email: %s \n", a.getId(), 
							a.getNome(), a.getIdade(), a.getEmail());
					if(a.getConta()!=null){
						System.out.printf("Agência: %s - Número: %s - Saldo: R$%s \n",a.getConta().getAgencia(),a.getConta().getNumero(),
								a.getConta().getSaldo());
					}
			
			}
			System.in.read();
		}
	}while(opcao!=5);

		}

}
