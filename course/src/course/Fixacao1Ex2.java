package course;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.println("Informe o raio de um circulo para calcular a area: ");
		double raio = sc.nextDouble();
		
		double area = pi * raio * raio;
		
		System.out.printf("Valor da Área: %.2f%n", area);
		
		sc.close();
	}

}
