package DomaciZadatakS6;

import java.util.Scanner;

public class Zadatak3S6zaVezbu {

	public static int saberiClanoveNiza(int[] niz, int mesec) {
		int suma = 0;
		for (int i = 0; i < mesec; i++) {
			suma += niz[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji od korisnika traži da unese neki datum i da ispiše
		 * koji je to po redu dan u godini. Za izraèunavanje definisati i koristiti niz.
		 * Npr. korisnik unese dan 28, mesec 2 i rezultat bude 59.
		 */
		int dan;
		int mesec;
		int brojDana = 0;
		int[] nizBrDana = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite \"0\" za izlazak iz programa.");
			System.out.println("Ili..");
			System.out.println("Unesite redni broj dana u mesecu: ");
			dan = sc.nextInt();
			if (dan == 0) {
				break;
			}
			System.out.println("Unesite redni broj meseca u godini: ");
			mesec = sc.nextInt();

			if (dan < 1) {
				System.out.println("Nije dobar unos..");
			} else if (dan > 31 & (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 ||mesec == 8
					|| mesec == 10 || mesec == 12)) {
				System.out.println("Nije dobar unos..");
			} else if (dan > 29 & mesec == 2) {
				System.out.println("Nije dobar unos..");
			} else if (dan > 30 & (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11)) {
				System.out.println("Nije dobar unos..");
			} else {
				switch (mesec) {
				case 1: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 2: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 1);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 3: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 2);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 4: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 3);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 5: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 4);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 6: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 5);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 7: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 6);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 8: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 7);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 9: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 8);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 10: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 9);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 11: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 10);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}
				case 12: {
					for (int i = 0; i <= dan; i++) {
						brojDana = i;
					}
					brojDana += saberiClanoveNiza(nizBrDana, 11);
					System.out.println("Redni broj unesenog dana u godini je: " + brojDana);
					break;
				}

				default:
					System.out.println("Niste uneli dobar redni broj meseca u godini!");
				}
			}
			System.out.println();
		} while (true);
		System.out.println("Kraj programa.");
	}
}
