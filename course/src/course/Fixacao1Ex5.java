package course;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao1Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double price1, price2, totalPc1, totalPc2, total;
		
		System.out.println("Informe o código da peça1: ");
		cod1 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Informe o valor de cada peça: ");
		price1 = sc.nextDouble();
		
		
		System.out.println("Informe o código da peça2: ");
		cod2 = sc.nextInt();
		
		System.out.println("Informe a quantidade de peças: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Informe o valor de cada peça: ");
		price2 = sc.nextDouble();
		
		
		totalPc1 = qtd1 * price1;
		totalPc2 = qtd2 * price2;
				
		total = qtd1 * price1 + qtd2 * price2;
		
		System.out.println("cod Peça 1: " + cod1);
		System.out.println("Total: " + totalPc1);
		System.out.println("cod Peça 2: " + cod2);
		System.out.println("Total: " + totalPc2);
		
		//System.out.printf("Valor total de cada peça: %.2f  %.2f  %n",  totalPc1, totalPc2);
		
		System.out.printf("Total a Pagar: %.2f%n", total);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
