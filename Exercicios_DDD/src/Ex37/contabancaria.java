package Ex37;

public class contabancaria {
	private String agencia;
	private String numero;
	private double saldo;
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	contabancaria(){
		
	}
	
	contabancaria(String ag, String num, double sal){
		this.agencia=ag;
		this.numero=num;
		this.saldo=sal;
	}
}