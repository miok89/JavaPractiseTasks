package domaciZadatakS9;

public class Zadatak2 {

	public static void main(String[] args) {
/*2) Napisati program koji prikazuje sve proste brojeve od 0 do 100*/
		vracaProsteBrojeve();
		System.out.println("\nKraj programa.");
		
	}
	public static void vracaProsteBrojeve() {
		System.out.println("Prosti brojevi od 0 do 100 su: ");
		for (int i = 2; i <= 100; i++) {
			if (i%i == 0 & i%1 == 0 & i%2 == 0 & i <= 2) {
				System.out.print(" " + i);
			}
			else if (i%i == 0 & i%1 == 0 & i%3 == 0 & i <= 3) {
				System.out.print(" " + i);
			}
			else if (i%i == 0 & i%1 == 0 & i%5 == 0 & i <= 5) {
				System.out.print(" " + i);
			}
			else if (i%i == 0 & i%1 == 0 & i%7 == 0 & i <= 7) {
				System.out.print(" " + i);
			}
			else if (i%i == 0 & i%1 == 0 & i%2 != 0 & i%3 != 0 & i%5 != 0 & i%7 != 0) {
				System.out.print(" " + i);
			}
		}
	}
}
