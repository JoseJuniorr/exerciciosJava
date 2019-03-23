package course;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao1Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do Funcionário");
		int cod = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		int hrs = sc.nextInt();
		
		System.out.println("Informe o valor recebido por hora trabalhada: ");
		float valor = sc.nextFloat();
		
		float salary = valor *hrs;
		
		
		System.out.printf("Funcionario nº: %d - Salário a ser pago: %.2f%n",cod, salary);
	
		
		
		sc.close();
	}

}
