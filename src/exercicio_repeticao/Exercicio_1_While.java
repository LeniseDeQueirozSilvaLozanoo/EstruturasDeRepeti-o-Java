package exercicio_repeticao;

public class Exercicio_1_While {

	public static void main(String[] args) {
		
		int i = 0;
		int soma = 0;
		while(i != 500) {
			i++;
			if (i % 3 == 0 & i % 2 == 1) { 
				
				soma = soma + i;
				System.out.println(i);		
			}
		}
				System.out.println("Total = " + soma);
	}
}