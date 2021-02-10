package domaciZadatakAutomobilS11;

public class Automobil {
	/*
	 * 2. Napisati klasu Automobil. Automobil ima - marku (polje tipa String) koje
	 * moze da se dohvati, ali ne i postavi - model (polje tipa String) koje moze da
	 * se dohvati ali ne i postavi - serijski broj (polje tipa int) koje moze da se
	 * dohvati ali ne i postavi - Automobil moze da ima vlasnika, i vlasnik moze da
	 * se dohvati i postavi u svakom trenutku
	 * 
	 * Napisati glavni program koji kreira dva automobila. U glavnom programu
	 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
	 * Automobil.
	 */
	private String marka;
	private int serijskiBroj;
	private String vlasnik;
	
	public String getMarka(){
		return marka;
	}
	
	public int getSerijskiBroj() {
		return serijskiBroj;
	}
	
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	public String getVlasnik() {
		return vlasnik;
	}
	
	public Automobil(String marka, int vin) {
		this.marka = marka;
		serijskiBroj = vin;
	}
	
	public Automobil(String marka, int vin, String vlasnik) {
		this.marka = marka;
		serijskiBroj = vin;
		this.vlasnik = vlasnik;
	}
	
	public void prikaziPodatkeAutomobila() {
		System.out.println("Automobil: " + marka + "; VIN: " + serijskiBroj 
				+ "; vlasnik: " + vlasnik + ".");
	}
}
