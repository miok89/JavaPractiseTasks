package DomaciZadatakS5;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * 1) Napisati program gde korisnik unese datum rodjenja i program vrati koji je
		 * to horoskopski znak
		 */
		/*
		 * Ovan – od 21. marta do 20. aprila;	resio!!! 
		 * 
		 * Bik – od 21. aprila do 21. maja;		resio!!!
		 * 
		 * Blizanci – od 22. maja do 21. juna;	resio!!!
		 * 
		 * Rak – od 22. juna do 22. jula; 	resio!!!
		 * 
		 * Lav – od 23. jula do 22. avgusta; 	resio!!!
		 * 
		 * Devica – od 23. avgusta do 22. septembra;	resio!!!
		 * 
		 * Vaga – od 23. septembra do 23.oktobra; 	resio!!!
		 * 
		 * Škorpija – od 24. oktobra do 22. novembra; 	resio!!!
		 * 
		 * Strelac – od 23. novembra do 21. decembra; resio!!!
		 * 
		 * Jarac – od 22. decembra do 20. januara;	resio!!!
		 * 
		 * Vodolija – od 21. januara do 19. februara;	resio!!!
		 * 
		 * Ribe – od 20. februara do 20. marta;	resio!!!
		 */
		int dan;
		int mesec;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan kada ste rodjeni.. ");
		dan = sc.nextInt();
		System.out.println("Unesite mesec u kom ste rodjeni.. ");
		mesec = sc.nextInt();

		switch (mesec) {
		case 1: {
			if (dan >= 1 && dan <= 20) {
				System.out.println("Vi ste JARAC u horoskopu!");	
			}else if (dan >= 21 && dan <= 31) {
				System.out.println("Vi ste VODOLIJA u horoskopu!");
			}
			break;
		}
		case 2: {
			if (dan >= 1 && dan <= 19) {
				System.out.println("Vi ste VODOLIJA u horoskopu!");	
			}else if (dan >= 20 && dan <= 29) {
				System.out.println("Vi ste RIBE u horoskopu!");
			}
			break;
		}
		case 3: {
			if (dan >= 1 && dan <= 20) {
				System.out.println("Vi ste RIBE u horoskopu!");	
			} else if (dan >= 21 && dan <= 31) {
				System.out.println("Vi ste Ovan u horoskopu!");
			}
			break;
		}
		case 4: {
			if (dan >= 1 && dan <= 20) {
				System.out.println("Vi ste OVAN u horoskopu!");	
			} else if (dan >= 21 && dan <= 30) {
				System.out.println("Vi ste BIK u horoskopu!");
			}
			break;
		}
		case 5: {
			if (dan >= 1 && dan <= 21) {
				System.out.println("Vi ste BIK u horoskopu!");		
			} else if (dan >= 22 && dan <= 31) {
				System.out.println("Vi ste BLIZANCI u horoskopu!");
			}
			break;
		}
		case 6: {
			if (dan >= 1 && dan <= 21) {
				System.out.println("Vi ste BLIZANCI u horoskopu!");	
			} else if (dan >= 22 && dan <= 30) {
				System.out.println("Vi ste RAK u horoskopu!");	
			}
			break;
		}
		case 7: {
			if (dan >= 1 && dan <= 22) {
				System.out.println("Vi ste RAK u horoskopu!");
			} else if (dan >= 23 && dan <= 31) {
				System.out.println("Vi ste LAV u horoskopu!");
			}
			break;
		}
		case 8: {
			if (dan >= 1 && dan <= 22) {
				System.out.println("Vi ste LAV u horoskopu!");	
			} else if (dan >= 23 && dan <= 31) {
				System.out.println("Vi ste DEVICA u horoskopu!");
			}
			break;
		}
		case 9: {
			if (dan >= 1 && dan <= 22) {
				System.out.println("Vi ste DEVICA u horoskopu!");		
			} else if (dan >= 23 && dan <= 30) {
				System.out.println("Vi ste VAGA u horoskopu!");
			}
			break;
		}
		case 10: {
			if (dan >= 1 && dan <= 23) {
				System.out.println("Vi ste VAGA u horoskopu!");
			} else if (dan >= 24 && dan <= 31) {
				System.out.println("Vi ste SKORPIJA u horoskopu!");
			}
			break;
		}
		case 11: {
			if (dan >= 1 && dan <= 22) {
				System.out.println("Vi ste SKORPIJA u horoskopu!");
			} else if (dan >= 23 && dan <= 30) {
				System.out.println("Vi ste STRELAC u horoskopu!");
			}
			break;
		}
		case 12: {
			if (dan >= 1 && dan <= 21) {
				System.out.println("Vi ste STRELAC u horoskopu!");
			} else if (dan >= 22 && dan <= 31) {
				System.out.println("Vi ste JARAC u horoskopu!");	
			}
			break;
		}
		default:
			System.out.println("Mesec treba da ima vrednosti od 1 do 12 za unos!");
		}
		System.out.println("Kraj programa.");
	}

}
