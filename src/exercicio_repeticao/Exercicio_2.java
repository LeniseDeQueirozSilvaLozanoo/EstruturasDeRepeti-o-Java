	package exercicio_repeticao;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double alturaDig = 0, menorAltura = 0, maiorAltura = 0; 
		
		for(int i=0; i<15; i++) {
			System.out.println("Digite a altura da pessoa " + (i+1));
			alturaDig = sc.nextDouble();
			
			if(i == 0) {
				menorAltura = alturaDig;
				maiorAltura = alturaDig;
			} else if (alturaDig > maiorAltura){
				maiorAltura = alturaDig;
			} else if (alturaDig < menorAltura){
				menorAltura = alturaDig;
			}
		}
		System.out.println("A menor altura do grupo é " + menorAltura);
		System.out.println("A maior altura do grupo é " + maiorAltura);
		
		sc.close();
	}
}
