package DomaciZadatakS6;

import java.util.Scanner;

public class DoWhileSwitchPrimer1 {

	public static void main(String[] args) {
		boolean uslov = false;

		String text;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Unesite \"mare\" ; \"zile\" ; \"cile\" ; \"mile\" ; \"djole\" ili \"exit: \"");
			text = sc.next();

			switch (text) {
			case "mare": {
				System.out.println("Radim i dalje..");
				// uslov = false;
				break;
			}
			case "zile": {
				System.out.println("Radim i dalje..");
				// uslov = false;
				break;
			}
			case "cile": {
				System.out.println("Radim i dalje..");
				// uslov = false;
				break;
			}
			case "mile": {
				System.out.println("Radim i dalje..");
				// uslov = false;
				break;
			}
			case "djole": {
				System.out.println("Radim i dalje..");
				// uslov = false;
				break;
			}
			case "exit": {
				System.out.println("Izlazim..");
				uslov = true;
				break;
			}
			default: {
				System.out.println("Pogresan text");
			}

			}
		} while (!uslov);

	}

}
