package domaci2412b;

public class Zadatak2v2 {

	public static void main(String[] args) {
		
		int[] prviNiz = {2147483647};
		int[] drugiNiz = {0};
		
		odnosNizova(prviNiz, drugiNiz);

	}
	public static void odnosNizova(int[] nizPrvi, int[] nizDrugi) {
		
		int sumaPrvogNiza = 0;
		int sumaDrugogNiza = 0;
		int rezultatOduzimanja = 0;

		for (int i = 0; i < nizPrvi.length; i++) {
			sumaPrvogNiza = sumaPrvogNiza + nizPrvi[i];
		}
		
		for (int j = 0; j < nizDrugi.length; j++) {
			sumaDrugogNiza = sumaDrugogNiza + nizDrugi[j];
		}
		
		System.out.println("Suma prvog niza je " + sumaPrvogNiza + ", a suma drugog niza je " + sumaDrugogNiza + ".");
		
		if (sumaPrvogNiza > sumaDrugogNiza) {
			System.out.println("Suma prvog niza je veca od sume drugog niza.");
			rezultatOduzimanja = sumaPrvogNiza - sumaDrugogNiza;
			if (rezultatOduzimanja > sumaDrugogNiza ) {
				System.out.println("Nakon oduzimanja sume drugog niza od sume prvog, suma prvog niza je i dalje veca od sume drugog.");
			}
			else if (rezultatOduzimanja < sumaDrugogNiza)
				System.out.println("Nakon oduzimanja sume drugog niza od sume prvog, suma prvog niza vise nije veca od sume drugog. ");
			else
				System.out.println("Nakon oduzimanja sume drugog niza od sume prvog, nizovi su jednaki.");
		} else if (sumaDrugogNiza > sumaPrvogNiza) {
			System.out.println("Suma drugog niza je veca od sume prvog niza.");
			rezultatOduzimanja = sumaDrugogNiza - sumaPrvogNiza;
			if (rezultatOduzimanja > sumaPrvogNiza) {
				System.out.println("Nakon oduzimanja sume prvog niza od sume drugog, suma drugog niza je i dalje veca od sume prvog.");
			}
			else if (rezultatOduzimanja < sumaPrvogNiza)
				System.out.println("Nakon oduzimanja sume prvog niza od sume drugog, suma drugog niza vise nije veca od sume prvog. ");
			else
				System.out.println("Nakon oduzimanja sume prvog niza od sume drugog, nizovi su jednaki.");
		} else
			System.out.println("Nizovi su jednaki.");
	}
}
