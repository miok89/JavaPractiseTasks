package domaciZadatakS9;

public class Zadatak4 {

	public static void main(String[] args) {
		/* 4) Napisati funkciju koja racuna aritmeticku sredinu niza */
		int [] nizBre = {1, 2, 3, 4};
		double rez;
		rez = aritmetickaSredinaNiza(nizBre);
		System.out.println("Aritmeticka sredina niza je " + rez);
		System.out.println("Kraj programa.");
	}
	public static double aritmetickaSredinaNiza(int niz[]) {
		int suma = 0;
		double vrednost;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		vrednost = (double)suma/niz.length;
		return vrednost;
	}
}
