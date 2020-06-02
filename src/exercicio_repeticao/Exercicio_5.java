package exercicio_repeticao;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int quant_geral = 0, soma_geral = 0, quant_par = 0, soma_par = 0, quant_impar = 0;
		double mediaPar = 0, mediaGeral = 0;
		while(x > 0) {
			
			if (x % 2 == 0) {
				quant_par += 1;
				soma_par += x;
			} else if (x % 2 == 1) {
				quant_impar += 1;
			}
			
			quant_geral += 1;
			soma_geral += x;
			x = sc.nextInt();
			
		}
		
		mediaPar = soma_par / quant_par;
		mediaGeral = soma_geral / quant_geral;
		
		System.out.println(quant_par + " números pares");
		System.out.println(quant_impar + " números ímpares");
		System.out.println("Média dos valores par: " + mediaPar);
		System.out.println("Média de todos os valores: " + mediaGeral);
		
		sc.close();

	}

}
