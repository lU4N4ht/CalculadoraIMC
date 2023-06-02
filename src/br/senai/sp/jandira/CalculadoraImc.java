package br.senai.sp.jandira;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		// Definindo variáveis
		
		double altura,
			   imc,
			   peso;
		
		String nome;
		
		// Entrada de dados
		
		System.out.println("-------------------");
		System.out.println("CALCULADORA DE IMC");
		System.out.println("-------------------");
		
		System.out.print("Qual é o seu nome?");
		nome = teclado.nextLine();
		
		System.out.print("Qual é o seu peso?");
		peso = teclado.nextDouble();
		
		System.out.print("Qual é a sua altura?");
		altura = teclado.nextDouble();
		
		// Processamento de dados
		
		imc = peso / Math.pow(altura, 2);
	
		// Saída de dados
		
		System.out.println("-------------------");
		System.out.println(" R E S U L T A D O");
		System.out.println("-------------------");
		
		System.out.println("Olá, " + nome + " seu imc é " + imc);

	}

}
