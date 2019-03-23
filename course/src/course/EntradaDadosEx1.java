package course;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosEx1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full Name: ");
		String name = sc.nextLine();
		
		System.out.println("How many bedrooms are these in your house? ");
		int qtd = sc.nextInt();
		
		System.out.println("Enter product price: ");
		float price = sc.nextFloat();
		
		System.out.println("Enter your last name, age and height (same line):");
		
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		System.out.println(name);
		System.out.println(qtd);
		System.out.println(price);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
