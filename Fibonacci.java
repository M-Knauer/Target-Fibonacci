package desafio2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		sc.close();
		
		int n1 = 0, n2 = 1, sum = 0;
		boolean pertence = false;
		
		System.out.printf("%d %d ", n1, n2);
		
		while(sum <= num) {
			pertence = sum == num ? true : false;
			
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		
			System.out.printf("%d ", sum);
		}
		
		if (pertence) {
			System.out.println("\nO número digitado pertence a sequência de Fibonacci!");
		}
		else {
			System.out.println("\nO número digitado não pertence a sequência de Fibonacci!");
		}
	}

}
