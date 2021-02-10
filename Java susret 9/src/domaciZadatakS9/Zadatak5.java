package domaciZadatakS9;

public class Zadatak5 {

	public static void main(String[] args) {
/*5) Uneti niz (integer ili string) i proveriti da li je palindrom*/
		String[] nizString = {"p", "o", "t", "o", "p"};
		System.out.println("Prvi niz: ");
		daLiJePalindrom(nizString);
		String[] nizString2 = {"p", "o", "t", "m", "p"};
		System.out.println("Drugi niz: ");
		daLiJePalindrom(nizString2);
		
		System.out.println("Treci niz: ");
		int[] nizInt = {6, 9, 6};
		daLiJePalindrom(nizInt);
		System.out.println("Cetvrti niz: ");
		int[] nizInt2 = {6, 9, 7};
		daLiJePalindrom(nizInt2);
		
		System.out.println("Kraj programa.");
	}
	public static void daLiJePalindrom(String[] niz) {
		String[] nizP;
		int k = 0;
		nizP = new String[niz.length];
		int j = 0;
		for (int i = niz.length - 1; i >= 0; i--) {
			nizP[j] = niz[i];
			j++;
		}
		for (int i = 0; i < nizP.length; i++) {
			if (nizP[i] == niz[i]) {
				k++;		
			}
		}
		if (k == niz.length) {
			System.out.println("Niz JE palindrom.");
		}
		else {
			System.out.println("Niz NIJE palindrom.");
		}

	}
	
	public static void daLiJePalindrom(int[] niz) {
		int[] nizP;
		int k = 0;
		nizP = new int [niz.length];
		int j = 0;
		for (int i = niz.length - 1; i >= 0; i--) {
			nizP[j] = niz[i];
			j++;
		}
		for (int i = 0; i < nizP.length; i++) {
			if (nizP[i] == niz[i]) {
				k++;		
			}
		}
		if (k == niz.length) {
			System.out.println("Niz JE palindrom.");
		}
		else {
			System.out.println("Niz NIJE palindrom.");
		}

	}
}
