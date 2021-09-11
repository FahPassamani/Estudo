package main;

import java.util.Locale;
import java.util.Scanner;

import utility.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
//		fa�a um programa para ler a cota��o do dolar e depois um valor em dolar a ser comprado por uma pessoa em reais.
//		informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda que a pessoa tera que pagar 6% de IOF sobre o valor em dolar.
//		Criar uma classe CurrencyConverter para ser responsavel pelos calculos.
		
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = scanner.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarBought = scanner.nextDouble();
		
		double result = CurrencyConverter.dolarToReal(dollarBought, dollarPrice);
		
		
		System.out.printf("Amount to be paid in Reais = %.2f%n", result);
		
		scanner.close();

	}

}
