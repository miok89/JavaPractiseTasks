package domaci2512;

public class Zadatak4 {

	public static void main(String[] args) {

		int[] nizBrojeva = {1, 2, 3, 4};
		int sumaNiza = 0;
		int aritmetickaSredina = 0;
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			sumaNiza = sumaNiza + nizBrojeva[i];
		}
			aritmetickaSredina = sumaNiza / nizBrojeva.length;
		
		System.out.println("Aritmeticka sredina niza je " + aritmetickaSredina + ".");
	}

}
