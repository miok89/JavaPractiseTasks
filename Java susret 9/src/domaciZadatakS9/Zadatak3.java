package domaciZadatakS9;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
		 * 3) Napisati program gde korisnik unese broj, a program mu vrati odgovor da li
		 * je unet broj prost ili ne
		 */
		int br;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj.. ");
		br = sc.nextInt();
		daLiJeProstBroj(br);
		System.out.println("Kraj programa.");

	}

	public static void daLiJeProstBroj(int broj) {

		for (int i = 2; i <= broj; i++) {
			if (broj % broj == 0 & broj % 1 == 0 & broj % 2 == 0 & broj <= 2) {
				System.out.println("Uneti broj je prost broj.");
				break;
			} else if (broj % broj == 0 & broj % 1 == 0 & broj % 3 == 0 & broj <= 3) {
				System.out.println("Uneti broj je prost broj.");
				break;
			} else if (broj % broj == 0 & broj % 1 == 0 & broj % 5 == 0 & broj <= 5) {
				System.out.println("Uneti broj je prost broj.");
				break;
			} else if (broj % broj == 0 & broj % 1 == 0 & broj % 7 == 0 & broj <= 7) {
				System.out.println("Uneti broj je prost broj.");
				break;
			} else if (broj % broj == 0 & broj % 1 == 0 & broj % 2 != 0 & broj % 3 != 0 & broj % 5 != 0
					& broj % 7 != 0) {
				System.out.println("Uneti broj je prost broj.");
				break;
			} else {
				System.out.println("Uneti broj NIJE prost broj!");
				break;
			}
		}
		for (int i = 1; i >= broj; i--) {
			System.out.println("Uneti broj je 1 ili manji, i nije PROST broj!");
			break;
		}
	}
}
