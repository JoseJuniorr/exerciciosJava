package course;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n1:");
		int n1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Digite a string:");
		String name = sc.nextLine(); 
		
		System.out.println("Digite o genero:");
		char  gender = sc.next().charAt(0);
		String s = sc.next();
		
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		
		
	
		
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
