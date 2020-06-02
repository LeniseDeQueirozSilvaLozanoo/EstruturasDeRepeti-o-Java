package exercicio_repeticao;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		int soma = 0;
		for (int i=0; i<500; i++) {
			if (i % 3 == 0 & i % 2 == 1) { 
				
				soma = soma + i;
				System.out.println(i);		

			}
		}
		
		System.out.println("Total = " + soma);

  }
	
}