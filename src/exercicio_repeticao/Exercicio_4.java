package exercicio_repeticao;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	int num_digitados = sc.nextInt();
	int contagemA = 0, contagemB = 0, contagemC = 0, contagemD = 0;
	
	
	while (num_digitados >= 0) {

		
		if (num_digitados >= 0 & num_digitados <= 25) {
			contagemA += 1; 
		}else if (num_digitados >= 26 & num_digitados <= 50) {
			contagemB += 1; 
		}else if (num_digitados >= 51 & num_digitados <= 75) {
			contagemC += 1; 
		}else if (num_digitados >= 76 & num_digitados <= 100) {
			contagemD += 1; 
		} 
		
		num_digitados = sc.nextInt();
	
	}

	
	System.out.println(contagemA + " números no intervalo 0-25");
	System.out.println(contagemB + " números no intervalo 26-50");
	System.out.println(contagemC + " números no intervalo 51-75");
	System.out.println(contagemD + " números no intervalo 76-100");
		
		sc.close();	
	}

}
