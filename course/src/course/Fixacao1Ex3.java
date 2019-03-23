package course;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao1Ex3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quatro valores inteiros: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		
		int dif = A * B - C * D; 
		

		System.out.println("Calculo da difença: " + dif);
		
		
		
		
		
		
		
		sc.close();
	}

}
