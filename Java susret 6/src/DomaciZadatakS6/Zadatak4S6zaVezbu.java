package DomaciZadatakS6;

import java.util.Scanner;

public class Zadatak4S6zaVezbu {

	public static void main(String[] args) {
		/*
		 * 4. Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */
		int br;
		int duzinaNiza;
		int[] niz;
		boolean istina = true;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza.. ");
		duzinaNiza = sc.nextInt();
		niz = new int[duzinaNiza];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza.. ");
			br = sc.nextInt();
			niz[i] = br;
		}
		System.out.println("Unesite neki broj.. ");
		br = sc.nextInt();

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.println((i + 1) + ". clan niza deljiv sa " + br + " je: " + niz[i]);
				j++;
			}
			else if(niz[i] % br != 0) {
				istina = false;
			}
		}
		if (istina == false & j == 0) {
			System.out.println("Nema clanova deljivih sa unetim brojem.");
		}
		System.out.println("\nKraj programa.");
	}
}
