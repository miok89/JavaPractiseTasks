package DomaciZadatakS7;

import java.util.Scanner;

public class Zadatak1S7 {

	public static void main(String[] args) {
		/*
		 * 1. Napraviti kalkulator povrsina kvadrata, pravougaonika i kruga. Povrsina se
		 * bira tako sto se unese kao tekst odgovarajuca figura. Ukoliko se unese
		 * 'izadji', program treba da se zavrsi. Program treba da se ponavlja dokle god
		 * se ne unese izadji. Kao zadatke za vezbu mozete da iskoristite prosli domaci
		 * i da neki od tih zadataka pretvorite u metode.
		 */
		double vrednost1 = 0;
		double vrednost2 = 0;
		double rezultat;
		String figura = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Unesite ime figure za izracunavanje povrsine: ");
			System.out.println("Ili unesite \"izadji\" za izlazak iz programa..");
			figura = sc.next();
			if (figura.equals("izadji")) {
				System.out.println("Kraj programa.");
				break;

			} else if (figura.equals("kvadrat")) {
				System.out.println("Unesite vrednost stranice a: ");
				vrednost1 = sc.nextDouble();
				rezultat = povKvadrata(vrednost1);
				System.out.println("Povrsina kvadrata je: " + rezultat);
			} else if (figura.equals("pravougaonik")) {
				System.out.println("Unesite vrednost stranice a: ");
				vrednost1 = sc.nextDouble();
				System.out.println("Unesite vrednost stranice b: ");
				vrednost2 = sc.nextDouble();
				rezultat = povPravougaonika(vrednost1, vrednost2);
				System.out.println("Povrsina pravougaonika je: " + rezultat);
			} else if (figura.equals("krug")) {
				System.out.println("Unesite vrednost poluprecnika r: ");
				vrednost1 = sc.nextDouble();
				rezultat = povKruga(vrednost1);
				System.out.println("Povrsina kruga je: " + rezultat);
			}
			System.out.println();

		} while (true);
	}

	public static double povKvadrata(double a) {
		double pov = Math.pow(a, 2);
		return pov;
	}

	public static double povPravougaonika(double a, double b) {
		double pov = a * b;
		return pov;
	}

	public static double povKruga(double r) {
		double pov = Math.pow(r, 2) * Math.PI;
		return pov;
	}
}