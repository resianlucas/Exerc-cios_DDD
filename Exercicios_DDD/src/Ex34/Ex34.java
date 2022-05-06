package Ex34;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		       
		        Scanner ler = new Scanner(System.in);
		       
		        Cliente[] listaClientes = new Cliente[5];
		       
		        int id;
		        String nome;
		        int idade;
		        String email;
		        char resposta;
		        String agencia;
		        String numero;
		        double saldo;
		       
		        for (int i = 0; i <= 4; i++) {
		   
		            Cliente cliente;
		           
		            System.out.printf("Digite o id: ");
		            id = ler.nextInt();
		           
		            System.out.printf("Digite o nome: ");
		            nome = ler.next();
		            
		            System.out.printf("Digite a idade: ");
		            idade = ler.nextInt();
		            
		            System.out.printf("Digite o email: ");
		            email = ler.next();
		           
		            System.out.printf("Possui conta corrente? (S/N)");
		            resposta = ler.next().charAt(0);
		           
		            if (resposta == 'S') {
		            	
		            	ContaBancaria conta;
		            	
		                System.out.printf("Digite a agencia:  ");
		                agencia = ler.next();
		               
		                System.out.printf("Digite o numero da conta: ");
		                numero = ler.next();
		                
		                System.out.printf("Digite o saldo da conta: ");
		                saldo = ler.nextDouble();
		              
		                conta = new ContaBancaria(agencia, numero, saldo);
		                cliente = new Cliente(id, nome, idade, email, conta);
		                
		            }
		            else {
		            	
		                cliente = new Cliente(id, nome, idade, email, null);            
		            }
		           
		            listaClientes[i] = cliente;            
		        }
		               
		        for (int i = 0; i <= 4; i++) {
		        	
		            System.out.printf("\nCliente %d criado com sucesso (%s)", listaClientes[i].id, listaClientes[i].nome);
		                   
		            if (listaClientes[i].conta != null) {
		                System.out.printf("\n Conta: %s", listaClientes[i].conta);
		            }
		        }
		        
		        ler.close();

	}

}
