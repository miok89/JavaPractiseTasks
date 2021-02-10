package DomaciZadatakS8;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * 1) Napisati funkciju koja za parametre prima tri broja num1, num2 i num3 i
		 * proverava da li je zbir num1 i num2 jednak num3. Primer: Ako se unese num1 =
		 * 2, num2 = 4, i num3 = 99 vraca false Ako se unese num1 = 2, num2 = 4, i num3
		 * = 6 vraca true
		 */
		int prviBr;
		int drugiBr;
		int treciBr;
		boolean rez;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj.. ");
		prviBr = scan.nextInt();
		System.out.println("Unesite drugi broj.. ");
		drugiBr = scan.nextInt();
		System.out.println("Unesite treci broj.. ");
		treciBr = scan.nextInt();
		rez = proveravaZbirPrvaDva(prviBr, drugiBr, treciBr);
		System.out.println("Da li je zbir prva dva broja je jednak trecem: " + rez);
	}
	public static boolean proveravaZbirPrvaDva(int num1, int num2, int num3) {
		if (num1 + num2 == num3) {
			return true;
		}else {
			return false;
		}
	}
}
