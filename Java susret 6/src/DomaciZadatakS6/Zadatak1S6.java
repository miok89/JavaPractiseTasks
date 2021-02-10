package DomaciZadatakS6;

import java.util.Scanner;

public class Zadatak1S6 {

	public static void main(String[] args) {
		/*1. Napisati program koji ucitava duzinu niza, 
		     niz i ispisuje niz inverznim redosledom.
			 Primer niza: 32 54 123 18
			 Ispis: 18 123 54 32*/
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
		System.out.println("Pocetni niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(" " + niz[i]);
		}
		System.out.println("\nPocetni niz sa obrnutim redosledom: ");
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(" " + niz[i]);
		}
		System.out.println("\nKraj programa.");
	}

}
