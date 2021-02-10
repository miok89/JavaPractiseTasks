package domaciZadatakS13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Vozac vozac1 = new Vozac("Niki", "Lauda");
		Vozac vozac2 = new Vozac("Michael", "Schumaher");
		Vozac vozac3 = new Vozac("Sebastian", "Ogier");
		Vozac vozac4 = new Vozac("Sebastian", "Loeb");
		Putnik putnik1 = new Putnik("Miroslav", "Klose", 1000);
		Putnik putnik2 = new Putnik("Michael", "Balack", 2000);
		Putnik putnik3 = new Putnik("Dusko", "Tosic", 3000);
		Putnik putnik4 = new Putnik("Joe", "Cole", 4500);
		Putnik putnik5 = new Putnik("Yaya", "Toure", 2500);
		Putnik putnik6 = new Putnik("Robert", "Lewandovski", 4500);
		Autobus autobus1 = new Autobus("61", 135);
		Autobus autobus2 = new Autobus("9", 55);

		String unos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ko ulazi u autobus? vozac/putnik");
		unos = sc.next();
		if (unos.equals("vozac")) {
			autobus1.dodajVozaca(vozac1);
			System.out.println("U autobus " + autobus1.getNazivAutobusa() + " ulazi " + vozac1.getZvanje() + "; ");
		} else if(unos.equals("putnik")) {
			if (autobus1.getVozaci().isEmpty()) {
				System.out.println("Nema vozaca u autobusu, molim vas sacekajte..");
			} else {
				System.out.println("Putnik kupuje kartu i ulazi..");
				putnik1.oduzmiNovac(autobus1.getCenaKarte());
			}
			/*
			 * autobus1.dodajVozaca(vozac1); autobus1.stampaj(); System.out.println();
			 */
			/*
			 * System.out.println("U autobus " + autobus1.getNazivAutobusa() + " ulazi " +
			 * vozac1.getZvanje() + "; "); autobus1.dodajVozaca(vozac2); autobus1.stampaj();
			 * System.out.println();
			 */

			/*
			 * autobus1.dodajPutnika(putnik1); autobus1.stampaj(); System.out.println();
			 * System.out.println("Putnik kupuje kartu i ulazi..");
			 * putnik2.oduzmiNovac(autobus1.getCenaKarte()); autobus1.dodajPutnika(putnik2);
			 * autobus1.stampaj(); System.out.println(); }
			 * 
			 * System.out.println("Putnik kupuje kartu i ulazi..");
			 * putnik3.oduzmiNovac(autobus1.getCenaKarte()); autobus1.dodajPutnika(putnik3);
			 * autobus1.stampaj(); System.out.println(); System.out.println(putnik1.getIme()
			 * + " " + putnik1.getPrezime() + " je nasao novac u autobusu.");
			 * putnik1.dodajNovac(500);
			 * System.out.println("Jednom vozacu je pozlilo i morao je da izadje napolje.");
			 * autobus1.izbaciVozaca(vozac1); autobus1.stampaj();
			 */
		}
	}
}
