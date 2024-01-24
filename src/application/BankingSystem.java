package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DataAccount;

public class BankingSystem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DataAccount dataaccount;
		
		System.out.print("Conta: ");
		int conta = sc.nextInt();
		System.out.print("Proprietário: ");
		sc.nextLine();
		String proprietario = sc.nextLine();
		System.out.print("Depósito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Saldo incial: ");
			double depositoInicial = sc.nextDouble();
			dataaccount = new DataAccount(conta, proprietario, depositoInicial);			
		}
		else {
			dataaccount = new DataAccount(conta, proprietario);
		}
		
		System.out.print("\nData Account: \n");
		System.out.print(dataaccount);
		
		System.out.print("\n\nDeposito: ");
		double depositoValor = sc.nextDouble();
		dataaccount.deposito(depositoValor);
		System.out.print("Atualizado Data Account: \n");
		System.out.print(dataaccount);
		
		System.out.print("\n\nSaque: ");
		double saqueValor = sc.nextDouble();
		dataaccount.saque(saqueValor);
		System.out.print("Atualizado Data Account: \n");
		System.out.print(dataaccount);
		
		
		
		
		sc.close();
	}

}
