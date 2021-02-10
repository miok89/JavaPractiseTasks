package domaciZadatakRacunS11;

public class Racun {
	/*
	 * 1. Napisati klasu Racun koja ima 2 polja. Prvo polje 'brRacuna' tipa String
	 * predstavlja broj racuna, brRacuna moze da se dohvati, ali ne i postavi. Drugo
	 * polje 'stanje' tipa double i predstavlja stanje na racunu. Stanje ima pocetnu
	 * vrednost 0 i moze da se dohvati. Napisati metode za dodavanje i uzimanje novca
	 * za drugo polje.
	 * 
	 * dohvati=get postavi=set
	 */
	private String brRacuna;
	private double stanje = 0;

	public String getBrRacuna() {
		return this.brRacuna;
	}

	public double getStanje() {
		return this.stanje;
	}

	public Racun() {
	}

	public Racun(String brRacuna, double stanje) {
		System.out.println("Racun napravljen.");
		this.brRacuna = brRacuna;
		this.stanje = stanje;
	}

	public double dodavanjeNovca(String naRacunBr, double novac) {
		this.brRacuna = naRacunBr;
		if (novac > 0) {
			this.stanje += novac;
			System.out.println("Uspesno dodata sredstva na racun.");
		} else {
			System.out.println("Nije dobar unos!");
		}
		return this.stanje;
	}

	public double uzimanjeNovca(String naRacunBr, double novac) {
		this.brRacuna = naRacunBr;
		if (novac > 0 & novac <= this.stanje) {
			this.stanje -= novac;
			System.out.println("Racun umanjen za uneti iznos.");
		} else {
			System.out.println("Nije dobar unos!");
		}
		return this.stanje;
	}

}
