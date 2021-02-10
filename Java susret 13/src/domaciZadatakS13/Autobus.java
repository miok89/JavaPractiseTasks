package domaciZadatakS13;

import java.util.ArrayList;
import java.util.Collections;

public class Autobus {
	private String nazivAutobusa;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnici = new ArrayList<>();
	private ArrayList<Vozac> vozaci = new ArrayList<>();
	
	public double getCenaKarte() {
		return cenaKarte;
	}
	
	public String getNazivAutobusa() {
		return nazivAutobusa;
	}
	
	public ArrayList<Vozac> getVozaci() {
		return vozaci;
	}

	public Autobus(String nazivAutobusa, double cenaKarte) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
	}
	
	public void dodajPutnika(Putnik putnik) {
		putnici.add(putnik);
	}
	
	public void izbaciPutnika(Putnik putnik) {
		putnici.remove(putnik);
	}
	
	public void dodajVozaca(Vozac vozac) {
		vozaci.add(vozac);
	}
	
	public void izbaciVozaca(Vozac vozac) {
		vozaci.remove(vozac);
	}
	
	public void stampaj() {
		System.out.print("U autobusu su trenutno: ");
		for (Vozac vozac : vozaci) {
			System.out.print(vozac.getZvanje() + " " + vozac.getIme() 
			+ " " + vozac.getPrezime() + "; ");
		}
		for (Putnik putnik : putnici){
            System.out.print(putnik.getIme() + " " + putnik.getPrezime() + "; ");
       }
	}
}
