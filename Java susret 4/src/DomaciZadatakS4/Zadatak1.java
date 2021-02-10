package DomaciZadatakS4;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * 1) Napisite program gde korisnik unosi broj godina i broj velicine obuce. Ako
		 * su uneseni brojevi parni treba ih sabrati, ako je barem jedan unet broj
		 * neparan onda ih pomnoziti. Resenje prikazati na kraju.
		 */
		int brojGodina;
		int velicinaObuce;
		int zbir = 0;
		int proizvod = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj godina...");
		brojGodina = sc.nextInt();
		System.out.println("Unesite broj cipela...");
		velicinaObuce = sc.nextInt();
		if (brojGodina % 2 == 0 && velicinaObuce % 2 == 0) {
			zbir = brojGodina + velicinaObuce;
			System.out.println("Zbir: " + zbir);
		} else if (brojGodina % 2 != 0 || velicinaObuce % 2 != 0) {
			proizvod = (brojGodina * velicinaObuce);
			System.out.println("Proizvod: " + proizvod);
		}
		System.out.println("Kraj programa!");
	}
}
