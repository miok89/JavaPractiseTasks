package domaciZadatakS13;

public class Putnik extends Covek{
	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}
	
	public double getNovac() {
		return novac;
	}

	public boolean dodajNovac(double dodajSvotu) {
		if (dodajSvotu > 0) {
			novac += dodajSvotu;
			System.out.println("Putnik " + getIme() + " " + getPrezime() + " trenutno ima " 
			+ novac + " rsd.");
			return true;
		}
		return false;
		
	}
	
	public boolean oduzmiNovac(double oduzmiSvotu) {
		if (oduzmiSvotu > 0) {
			novac -= oduzmiSvotu;
			System.out.println("Putnik " + getIme() + " " + getPrezime() + " trenutno ima " 
					+ novac + " rsd.");
			return true;
		}
		return false;		
	}
}
