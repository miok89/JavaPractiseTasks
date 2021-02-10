package DomaciZadatakS3;

import java.util.Collections;

import java.util.*;

public class NeformalniDomaciZ2 {

	public static void main(String[] args) {

		/* Napraviti Fibonaèijev niz da izgleda ovako u ispisu:
		   0 1 1 2 3 5 8 13 21 34*/
		int n;
		System.out.println("Unesite broj za Fibonaèijev niz: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int niz[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				niz[0] = 0;
				System.out.print(niz[0] + " ");
				continue;
			} else if (i == 1) {
				niz[1] = 1;
				System.out.print(niz[1] + " ");
				continue;
			} else {
				niz[i] = niz[i-1] + niz[i-2];
				System.out.print(niz[i] + " ");
			}
		}
		System.out.println("\nKraj programa!");

	}
}