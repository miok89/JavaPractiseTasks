package DomaciZadatakS8;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * 2) Napisati funkciju koja vraca sumu dva niza, zatim od niza sa vecom sumom
		 * oduzme sumu drugog niza i vrati da li je veci niz i dalje veci Primer: Ako se
		 * unese prvi niz 1,2,3 (suma je 6) i drugi niz 10,20,30 (suma 60) onda 60 - 6 =
		 * drugi niz je i dalje veci, vraca true.
		 */
		int[] niz1 = {2, 3, 4, 5, 6, 7, 8};
		int[] niz2 = {-2147483648};
		int rez;
		rez = vecaSuma(niz1, niz2);
	}

	public static int vecaSuma(int[] niz1, int[] niz2) {
		int suma1 = 0;
		int suma2 = 0;
		int rez;
		int rez2;
		boolean veciManji;
		
		for (int i = 0; i < niz1.length; i++) {
			suma1 += niz1[i];
		}
		for (int i = 0; i < niz2.length; i++) {
			suma2 += niz2[i];
		}
		
		if (suma1 > suma2) {
			rez = suma1 - suma2;
			if (rez > suma2) {
				veciManji = true;
				System.out.println("Prvi niz je i dalje veci.");
				System.out.println(veciManji);
				return rez;
			} else if (rez == suma2) {
				System.out.println("Nizovi su sada jednaki.");
				return rez;
			} else {
				veciManji = false;
				System.out.println("Prvi niz je sada manji.");
				System.out.println(veciManji);
				return rez;
			}
			
		} else if (suma1 < suma2) {
			rez = suma2 - suma1;
			if (rez > suma1) {
				veciManji = true;
				System.out.println("Drugi niz je i dalje veci.");
				System.out.println(veciManji);
				return rez;
			} else if (rez == suma1) {
				System.out.println("Nizovi su sada jednaki.");
				return rez;
			} else {
				veciManji = false;
				System.out.println("Drugi niz je sada manji.");
				System.out.println(veciManji);
				return rez;
			}
			
		} else {
			veciManji = true;
			System.out.println("Sume nizova su jednake.");
			return -1;
		}
	}
}
