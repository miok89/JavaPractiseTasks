package DomaciZadatakS6;

import java.util.Scanner;

public class Zadatak5zaVezbu {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji traži od korisnika da unese deset celih brojeva,
		 * uèitava ih u niz, zatim sortira brojeve u rastuæem rasporedu te ih na kraju
		 * štampa
		 */
		int broj;
		int[] niz;
		int priv;
		niz = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i+1) + ". broj: ");
			broj = sc.nextInt();
			niz[i] = broj;
		}
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] > niz[j]) {
					priv = niz[i];
					niz[i] = niz[j];
					niz[j] = priv;
				}
			}
		}
		System.out.println("Sortiran niz u rastucem redosledu: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

}
