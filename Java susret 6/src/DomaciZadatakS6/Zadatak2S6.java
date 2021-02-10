package DomaciZadatakS6;

import java.util.Scanner;

public class Zadatak2S6 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji proverava da li je napisan niz rastuci. Primer 1.
		 * niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer 2. niza: 71 422 1001 5054
		 * Ispis: Niz je rastuci*/

		int duzNiza;
		Scanner sc = new Scanner(System.in);
		int niz [];
		System.out.println("Unesite duzinu niza.. ");
		duzNiza = sc.nextInt();
		niz = new int [duzNiza];
		for (int i = 0; i < duzNiza; i++) {
			System.out.println("Unesite celobrojnu vrednost.. ");
			niz[i] = sc.nextInt();
		}

		int k = 0;
		
		System.out.println("Niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(" " + niz[i]);
		}
		System.out.println();
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] < niz[i + 1]) {
				k ++;
			}
		}
		if (k == niz.length - 1) {
			System.out.println("Niz je rastuci.");
		} else {
			System.out.println("Niz nije rastuci.");
		}
		System.out.println("Kraj programa.");
	}
}