package entities;

public class Conta {

	private int numeroConta;
	private int agencia;
	private double salario;
	private double saldo;
	private String titular;

	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}

	public void sacar(double valorSacado) {
		saldo -= valorSacado;
	}

	/*public String toString () 
	{
		return "Aqui vai texto";
	}*/
	public String toString() {
		return "Titular " + titular + "\nAgencia: "+ agencia+ "\nConta: "+ numeroConta+ "\nSaldo: " +saldo;
	}
	
}
