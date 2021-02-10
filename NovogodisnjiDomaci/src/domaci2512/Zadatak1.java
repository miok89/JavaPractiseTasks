package domaci2512;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// 1) Napisati program gde korisnik unese ime, prezime i pol, a program mu vrati 
		// "Dobrodosao u IT + (ime i prezime)" ili "Dobrodosla u IT + (ime i prezime)" 
		// zavisno koji pol unese
		
		String ime = "";
		String prezime = "";
		char pol = ' ';
		
		pozdravnaPoruka(ime, prezime, pol);
					
	}
	public static void pozdravnaPoruka(String imeKorisnika, String prezimeKorisnika, char polKorisnika) {
		
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Unesite vase ime: ");
			imeKorisnika = scan.next();
			System.out.println("Unesite vase prezime: ");
			prezimeKorisnika = scan.next();
			System.out.println("Unesite pol:");
			polKorisnika = scan.next().charAt(0);
			
			if (polKorisnika == 'm') {
				System.out.println("Dobrodosao u IT, " + imeKorisnika + " " + prezimeKorisnika + "!");
			}
			else if (polKorisnika == 'z') {
				System.out.println("Dobrodosla u IT, " + imeKorisnika + " " + prezimeKorisnika + "!");
			} 
			else {
				System.out.println("Niste uneli validan pol. Unesite m ili z. Hvala.");	
				continue;
			}
			break;
		} while (polKorisnika != 'm' || polKorisnika != 'z');
	}
}
