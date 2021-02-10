package domaci2412b;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		int brojA = scan.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		int brojB = scan.nextInt();
		
		System.out.println("Unesite treci broj: ");
		int brojC = scan.nextInt();
		
		if (provera(brojA, brojB, brojC) == true) {
			System.out.println("Zbir prvog i drugog broja je jednak trecem broju.");
		}
		else {
			System.out.println("Zbir prvog i drugog broja nije jednak trecem broju.");
		}
		

	}
	public static boolean provera(int prviBroj, int drugiBroj, int treciBroj) {
		if (prviBroj + drugiBroj == treciBroj) {
			return true;
		}
		else
			return false;
	}
}
