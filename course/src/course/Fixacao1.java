package course;

import java.util.Scanner;

public class Fixacao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int n2 = sc.nextInt();
		
		int result = n1 + n2;
		
		
		System.out.println("O resultado da soma é:" + result);
		
		
		
		
		sc.close();
	}

}
