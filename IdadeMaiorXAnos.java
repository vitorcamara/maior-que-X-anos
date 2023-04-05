package com.vitorcamara.projetos;

import java.util.Scanner;

public class IdadeMaiorXAnos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];
		int qtdMaiorX = 0;
		
		System.out.println("Você quer a quantidade de pessoas com mais de quantos anos?");
		int idadeMaior = scan.nextInt();
		
		for (int i = 0; i < idades.length; i++) {

			System.out.println("Entre com a idade " + (i + 1) + ":");
			idades[i] = scan.nextInt();

			if (idades[i] > idadeMaior) {
				qtdMaiorX++;
			}

		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idade " + (i + 1) + ": " + idades[i] + " anos");
		}

		System.out.println("\nQuantidade de pessoas com mais de " + idadeMaior +  " anos = " + qtdMaiorX);

	}

}
