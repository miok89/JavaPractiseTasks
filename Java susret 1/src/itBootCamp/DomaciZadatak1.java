package itBootCamp;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		String ime = "Kevin";
		String prezime = "Spacey";
		char pol = 'M'; // male
		int godineStarosti = 61;
		double ocenaGlumca = 10;
		boolean glumacIzSrbije = false;
		System.out.println("Ime i prezime glumca je: " + ime + " " + 
				prezime + " " + pol + " (M-male-muški pol) pola, \nkoji je star " + 
				godineStarosti + 
				", a da li dolazi iz Srbije, \nodgovor je " +
				 glumacIzSrbije + "!" + " Ocena glumca u filmu American Beauty je " +
				ocenaGlumca);
		//Fantastic role in "American beauty"
		System.out.println();
		ime = "Uma";
		prezime = "Thurman";
		pol = 'F'; // female
		godineStarosti = 50;
		ocenaGlumca = 9;
		
		System.out.println("Ime i prezime glumice je: " + ime + " " + 
				prezime + " " + pol + " (F-female-ženski pol) pola, \nkoja je stara " + 
				godineStarosti + 
				", a da li dolazi iz Srbije, \nodgovor je " +
				 glumacIzSrbije + "!" + " Ocena glumice u filmu Kill Bill je " +
				 ocenaGlumca);
		//Outstanding role in "Kill Bill"
	}

}
