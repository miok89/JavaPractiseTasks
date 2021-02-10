package domaciZadatakS9;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * 1) Napisati program gde korisnik unese ime, prezime i pol, a program mu vrati
		 * "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese
		 */
		String imeN;
		String prezimeN;
		String polN;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite vase ime.. ");
		imeN = scan.next();
		System.out.println("Unesite vase prezime.. ");
		prezimeN = scan.next();
		System.out.println("Unesite pol (u formatu \"muski\" ili \"zenski\").. ");
		polN = scan.next();
		dobrodosli(imeN, prezimeN, polN);
		System.out.println("Kraj programa.");
	}
	public static void dobrodosli(String ime, String prezime, String pol) {
		if (pol.equals("muski")) {
			System.out.println("Dobrodosao u IT.");
		}else if (pol.equals("zenski")) {
			System.out.println("Dobrodosla u IT.");
		}else {
			System.out.println("Pogresan unos!");
		}
	}
}
