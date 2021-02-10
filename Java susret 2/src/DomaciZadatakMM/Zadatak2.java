package DomaciZadatakMM;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*2.Napisati program koji ce proveravati 
		da li je uneti broj parni ili neparni.
		Dodatak zadatku za vezbu(neobavezno): Ako je broj parni, 
		mnoziti sa 5 a neparni mnoziti sa 6 i ispisati racun tog mnozenja.*/
		int broj;
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite ceo broj: ");
		broj = citac.nextInt();
		
		if(broj%2 == 0) {
			System.out.println("Uneti broj je paran!");
			System.out.println("Uneti broj pomnozen sa 5 je: " + broj * 5);
		}else if (broj%2 != 0) {
			System.out.println("Uneti broj je neparan");
			System.out.println("Uneti broj pomnozen sa 6 je: " + broj * 6);
		}else {
			System.out.println("Nepravilan unos!");
		}
		System.out.println("Kraj programa!");
	}

}
