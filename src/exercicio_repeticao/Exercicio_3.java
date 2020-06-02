package exercicio_repeticao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int numDeterminado = sc.nextInt();
		int x = 0, soma = 0, proximo = 0, valorPositivo = 0, valorNegativo = 0;
		double media = 0, percentualPositivo = 0, percentualNegativo = 0;
		
		for (x =0; x<numDeterminado; x++) {
			proximo = sc.nextInt();
			soma += proximo;
			
			if (proximo < 0) {
				valorNegativo += 1;
			} else {
				valorPositivo += 1;
			}
		}
		
		percentualNegativo = (valorNegativo * 100)/numDeterminado;
		percentualPositivo = (valorPositivo * 100)/numDeterminado;
		media = soma/numDeterminado;
		

		System.out.println("A média dos valores é " + media);
		System.out.println("A quantidade de valores positivos é: " + valorPositivo);
		System.out.println("A quantidade de valores negativos é: " + valorNegativo );
		System.out.println("O percentual de valores positivos é:  " + percentualPositivo + "%");
		System.out.println("O percentual de valores negativos é:  " + percentualNegativo + "%");
		
		sc.close();

	}

}
