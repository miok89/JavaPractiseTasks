package DomaciZadatakS7;

import java.util.Scanner;

public class Zadatak1S7Switch {

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
			System.out.println("\'kvadrat\' \'pravougaonik\' ili \'krug\'.. ");
			System.out.println("Ili unesite \"izadji\" za izlazak iz programa.. ");
			figura = sc.next();

			if (figura.equals("kvadrat")) {
				System.out.println("Unesite vrednost stranice a: ");
				vrednost1 = sc.nextDouble();
				rezultat = Povrsina(vrednost1, vrednost2, "kvadrat");
				System.out.println("Povrsina kvadrata je: " + rezultat);
			} else if (figura.equals("pravougaonik")) {
				System.out.println("Unesite vrednost stranice a: ");
				vrednost1 = sc.nextDouble();
				System.out.println("Unesite vrednost stranice b: ");
				vrednost2 = sc.nextDouble();
				rezultat = Povrsina(vrednost1, vrednost2, "pravougaonik");
				System.out.println("Povrsina pravougaonika je: " + rezultat);
			} else if (figura.equals("krug")) {
				System.out.println("Unesite vrednost poluprecnika r: ");
				vrednost1 = sc.nextDouble();
				rezultat = Povrsina(vrednost1, vrednost2, "krug");
				System.out.println("Povrsina kruga je: " + rezultat);
			} else if (figura.equals("izadji")) {
				break;
				
			}
			System.out.println();

		} while (true);
		System.out.println("Kraj programa.");
	}

	public static double Povrsina(double vr1, double vr2, String figura) {
		switch (figura) {
		case "kvadrat": {
			return vr1 * vr1;

		}
		case "pravougaonik": {
			return vr1 * vr2;

		}
		case "krug": {
			return (vr1 * vr1) * Math.PI;

		}
		case "izadji": {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + figura);
		}
		return 0;
	}
}
