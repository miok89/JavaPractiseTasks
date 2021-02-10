package domaci2512;

public class Zadatak5 {

	public static void main(String[] args) {
		
		int nizBrojeva[] = {-4, -8, -5, -5, -8, -4};
		int provera = 0;
		int n = nizBrojeva.length;	// 6
		
		for (int i = 0; i < n / 2; i++) {	// i < 3
			if (nizBrojeva[i] != nizBrojeva[n - 1 - i]) {
				provera = 1;
				break;
			}
		}
		
		if (provera == 1) {
			System.out.println("Niz nije palindrom.");
		} else {
			System.out.println("Niz je palindrom.");
		}
	}
}

// prvi prolaz: i=0, 6-1-0=5, sto bi bila cifra 4, 4 je isto sto i 4