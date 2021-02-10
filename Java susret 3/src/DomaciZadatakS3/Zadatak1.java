package DomaciZadatakS3;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/* 1.Napisati program koji racuna sumu parnih brojeva 
	   i proizvod neparnih brojeva od 0 do n - za resavanje ovog 
	   zadatka koristiti samo jednu petlju 
	   (ne jednu vrstu petlje, vec samo jednu petlju).
       podrazumeva se da se n ucitava preko tastature */
		
		int i = 0;
		int brojN;
		int sumaP = 0;
		long proizvodN = 1; // treba long i n je max 48
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti broj \'n\': ");
		brojN = sc.nextInt();
		
		while (i <= brojN) {
			if (i%2 == 0) {
				sumaP = sumaP + i;	
			} else {
				proizvodN = proizvodN * i;
			}
			++i;
		} 

		System.out.println("Suma parnih brojeva za \'n\' = " + brojN + " je: " 
				+ sumaP);
		System.out.println("Proizvod neparnih brojeva za \'n\' = " + brojN + " je: "
		+ proizvodN);
		System.out.println("Kraj programa!");		
	}

}
