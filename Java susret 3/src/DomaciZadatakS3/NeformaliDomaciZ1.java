package DomaciZadatakS3;

import java.util.Scanner;

public class NeformaliDomaciZ1 {

	public static void Menu() {
		System.out.println("---------------Menu---------------");
		System.out.println("0 - izaði iz programa.");
		System.out.println("1 - ubaci proizvod u korpu.");
		System.out.println("2 - naplati raèun.");
		int menuBr;
		double cenaPr;
		double racunUPr = 0;
		double unosVrRa = 0;
		double kusur = 0;
		Scanner sc = new Scanner(System.in);
		menuBr = sc.nextInt();

		switch (menuBr) {
		case 0: {
			System.out.println("Program je završen.");
			break;
		}
		case 1: {
			System.out.println("Unesite cenu proizvoda: ");
			cenaPr = sc.nextDouble();
			racunUPr += cenaPr;
			System.out.println("Vaš trenutni raèun iznosi: " + racunUPr + " rsd");
			//Treba da se doradi za ovu opciju
			//System.out.println("1 - dodaj proizvod;");
			//System.out.println("2 - plati");
		}
		case 2: {
			System.out.println("Unesite kolièinu novca za naplatu raèuna: ");
			unosVrRa = sc.nextDouble();
			if (unosVrRa < racunUPr) {
				System.out.println("Greška - bez umanjenja raèuna.");
				Menu();
				break;
			} else {
				kusur = unosVrRa - racunUPr;
				System.out.println("Vaš kusur je: " + kusur + " rsd");
				racunUPr = 0;
				System.out.println();
				Menu();
				break;
			}
		}
		default: {
			throw new IllegalArgumentException("Neoèekivan unos menu broja: " + menuBr);
		}
		}
	}

	public static void main(String[] args) {
		Menu();
	}
}