package domaci2512;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int broj;
		boolean prost = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		broj = scan.nextInt();
	       
		for (int i = 2; i < broj; i++) {
	        		
	        if (broj % i == 0) {
	        	prost = true;
	        	break;
	        }
	     }
	     
		if (!prost) {
			System.out.println("Broj koji ste uneli je prost broj.");
		}
		else {
			System.out.println("Broj koji ste uneli nije prost broj.");
		}

	}
}




