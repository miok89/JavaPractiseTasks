package neobavezniDomaciS15;

public class MainOsoba {

	public static void main(String[] args) {
		Igrac igrac1 = new Igrac("Dmitar", "Berbatov", 3697412581234L, 1983, 9, "napadac", true);
		Igrac igrac2 = new Igrac("Nemanja", "Vidic", 2587413214574L, 1985, 4, "odbrambeni", false);
		
		Trener trener1 = new Trener("Ser Alex", "Ferguson", 5246321785423L, 1950, 30, "glavni trener");
		Trener trener2 = new Trener("Ser Alex", "Ferguson", 5246321785423L, 1950, 30, "glavni trener");
		Osoba[] nizOsoba = {igrac1, igrac2, trener1, trener2};
		for (int i = 0; i < nizOsoba.length; i++) {
			nizOsoba[i].stampaj();
			System.out.println("*****************************");
		}

	}

}
