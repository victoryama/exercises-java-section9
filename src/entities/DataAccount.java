package entities;

public class DataAccount {

	private int conta;
	private String proprietario;
	private double saldo;
	
	public DataAccount(int conta, String proprietario) { //construtor
		this.conta = conta;
		this.proprietario = proprietario;
	}


	public DataAccount(int conta, String proprietario, double saldoInicial) {
		this.conta = conta;
		this.proprietario = proprietario;
		deposito(saldoInicial);
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public double getSaldo() {
		return saldo;
	}


	public int getConta() {
		return conta;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "Data Account: "
				+ conta + ", proprietário: " + proprietario	+ ", Saldo: $ " + String.format("%.2f", saldo);
		}
	 
	
	
	
}
